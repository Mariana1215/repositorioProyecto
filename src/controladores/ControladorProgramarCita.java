/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controladores;

import enums.Especializacion;
import enums.Rol;
import excepciones.AgendaException;
import excepciones.FechaInvalidaException;
import excepciones.LimiteDeCitasException;
import java.time.LocalDate;
import java.time.LocalTime;
import modelos.Cita;
import modelos.Horario;
import modelos.Medico;
import modelos.Paciente;
import modelos.Persona;
import singleton.Singleton;
import util.LSE;

/**
 *
 * @author LENOVO
 */
public class ControladorProgramarCita {

    private final Paciente paciente;
    private LSE<Cita> citas;
    private LSE<Persona> personas;

    public ControladorProgramarCita(Paciente paciente) {
        this.paciente = paciente;
        citas = Singleton.getINSTANCIA().getCitas();
        personas = Singleton.getINSTANCIA().getPersonas();
    }

    public void agendarCita(Cita cita) {
        validarFecha(cita);
        validarAgenda(cita);

        if (cita.getMedico().tieneDiaLibre() && cita.getFecha().equals(cita.getMedico().getDiaLibre())) {
            throw new FechaInvalidaException();
        }

        if (paciente.getCitas().size() >= 2) {
            throw new LimiteDeCitasException();
        }

        paciente.agendarCita(cita);
        agendarCitaMedico(cita);
        citas.add(cita);

        Singleton.getINSTANCIA().escribirPersona();
        Singleton.getINSTANCIA().escribirCita();
    }

    public Medico buscarMedico(String cedula) {
        for (int i = 0; i < personas.size(); i++) {
            if (personas.get(i).getRol() == Rol.MEDICO) {
                Medico medico = (Medico) personas.get(i);
                if (medico.getCedula().equals(cedula)) {
                    return medico;
                }
            }
        }
        return null;
    }

    private LSE<Medico> getMedico() {
        LSE<Medico> listaMedico = new LSE<>();
        for (int i = 0; i < personas.size(); i++) {
            if (personas.get(i).getRol() == Rol.MEDICO) {
                listaMedico.add((Medico) personas.get(i));
            }
        }
        return listaMedico;
    }

    private void agendarCitaMedico(Cita cita) {
        Medico medico = cita.getMedico();
        LSE<Horario> horarios = medico.getHorariosCitas();

        medico.getCitas().add(cita);

        Horario horario = new Horario(cita.getFecha(), cita.getHoraInicio(), cita.getHoraFinal());
        horario.setDisponible(false);
        horarios.add(horario);
    }

    private void validarFecha(Cita cita) {
        if (cita.getFecha().isBefore(LocalDate.now())) {
            throw new FechaInvalidaException();
        }
    }

    private boolean seCruzanHorarios(LocalTime horaInicio, LocalTime horaFinal, Cita citaProgramada) {
        return (horaInicio.isAfter(citaProgramada.getHoraInicio()) && horaInicio.isBefore(citaProgramada.getHoraFinal())
                || horaFinal.isAfter(citaProgramada.getHoraInicio()) && horaFinal.isBefore(citaProgramada.getHoraFinal())
                || horaInicio.equals(citaProgramada.getHoraInicio()));

    }

    public LSE<LocalTime> listaHorarioDisponible(Medico medico, LocalDate fecha) {
        LSE<Horario> horarios = medico.getHorariosCitas();
        LSE<LocalTime> horasCitas = new LSE<>();

        LocalTime horaInicio = medico.getHoraInicioJornada();
        LocalTime horaFinal = medico.getHoraFinJornada();

        for (LocalTime hora = horaInicio; hora.isBefore(horaFinal); hora = hora.plusMinutes(30)) {
            boolean disponible = true;

            for (int i = 0; i < horarios.size(); i++) {
                Horario horario = horarios.get(i);

                if (horario.getFecha().equals(fecha)) {
                    if (hora.equals(horario.getHoraInicioCita()) && !horario.isDisponible()
                            || hora.equals(horario.getHoraFinal()) &&  !horario.isDisponible()
                            || hora.isAfter(horario.getHoraInicioCita()) && hora.isBefore(horario.getHoraFinal())
                            && !horario.isDisponible()) {
                        disponible = false;
                        break;
                    }
                }
            }

            if (disponible) {
                horasCitas.add(hora);
            }

            if (fecha.equals(LocalDate.now())) {
                for (int i = 0; i < horasCitas.size(); i++) {
                    if (horasCitas.get(i).isBefore(LocalTime.now())) {
                        horasCitas.remove(i);
                    }
                }
            }
        }
        return horasCitas;
    }

    private void validarAgenda(Cita cita) {
        LocalTime horaInicio = cita.getHoraInicio();
        LocalTime horaFinal = cita.getHoraFinal();

        LSE<Cita> citas = paciente.getCitas();

        for (int i = 0; i < citas.size(); i++) {
            if (citas.get(i).getFecha().equals(cita.getFecha())
                    && seCruzanHorarios(horaInicio, horaFinal, citas.get(i))) {
                throw new AgendaException("Los horarios se interponen, busque otra hora u otra fecha");
            }
        }
    }

    public LSE<Medico> listaEspecializacion(Especializacion especializacion) {
        LSE<Medico> medicos = getMedico();
        LSE<Medico> lista = new LSE<>();

        for (int i = 0; i < medicos.size(); i++) {
            Medico medico = medicos.get(i);
            if (!medico.getCedula().equals(paciente.getCedula())) {
                if (medico.getEspecializacion().equals(especializacion)) {
                    lista.add(medico);
                }
            }
        }
        return lista;
    }
}
