/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controladores;

import enums.Especializacion;
import enums.Rol;
import excepciones.AgendaException;
import excepciones.HoraInvalidaException;
import excepciones.MantenimientoQuirofanoException;
import excepciones.MedicoNoEsCirujanoException;
import java.time.LocalDate;
import java.time.LocalTime;
import modelos.Cirugia;
import modelos.Cita;
import modelos.Enfermera;
import modelos.Horario;
import modelos.Medico;
import modelos.Quirofano;
import modelos.Separado;
import singleton.Singleton;
import util.LSE;

/**
 *
 * @author LENOVO
 */
public class ControladorSepararQuirofano extends ControladorBase {

    private Quirofano quirofano;

    public ControladorSepararQuirofano(Quirofano quirofano) {
        this.quirofano = quirofano;
    }

    public void separarQuirofano(Separado separado) {
        validarDisponiblidadQuirofano(separado.getCirugia());
        validarAgendaPaciente(separado.getCirugia());
        validarAgendaMedico(separado.getCirugia().getCirujano(), separado.getCirugia());
        validarHoraQuirofano(separado);

        quirofano.getSeparados().add(separado);
        separado.getCirugia().getPaciente().getCirugias().add(separado.getCirugia());
        separado.getCirugia().getCirujano().getCirugias().add(separado.getCirugia());

        Horario horario = new Horario(separado.getFecha(), separado.getCirugia().getHoraInicio(), separado.getCirugia().getHoraFinal());
        horario.setDisponible(false);
        separado.getCirugia().getCirujano().getHorariosCitas().add(horario);
        Singleton.getINSTANCIA().escribirQuirofano();

    }

    public Medico buscarMedicoCirujano(String cedula) {
        for (int i = 0; i < personas.size(); i++) {
            if (personas.get(i).getRol() == Rol.MEDICO) {
                Medico medico = (Medico) personas.get(i);
                if (medico.getCedula().equals(cedula)) {
                    if (medico.getEspecializacion() != Especializacion.GENERAL) {
                        return medico;
                    } else {
                        throw new MedicoNoEsCirujanoException();
                    }
                }
            }
        }
        return null;
    }

    private void validarAgendaPaciente(Cirugia cirugia) {
        LSE<Cita> citas = cirugia.getPaciente().getCitas();
        LSE<Cirugia> cirugias = cirugia.getPaciente().getCirugias();

        LocalDate fecha = cirugia.getFechaCirugia();

        LocalTime horaInicio = cirugia.getHoraInicio();
        LocalTime horaFinal = cirugia.getHoraFinal();

        for (int i = 0; i < citas.size(); i++) {
            Cita cita = citas.get(i);
            if (fecha.equals(cita.getFecha())) {
                if (horaInicio.isAfter(cita.getHoraInicio()) && horaInicio.isBefore(cita.getHoraFinal())
                        || horaFinal.isAfter(cita.getHoraInicio()) && horaFinal.isBefore(cita.getHoraFinal())
                        || horaInicio.equals(cita.getHoraInicio())) {

                    throw new AgendaException("El paciente tiene cita para ese día");
                }
            }
        }

        for (int i = 0; i < cirugias.size(); i++) {
            Cirugia aux = cirugias.get(i);
            if (fecha.equals(aux.getFechaCirugia())) {
                throw new AgendaException("El paciente tiene una cirugía para ese día");
            }
        }
    }

    private void validarAgendaMedico(Medico medico, Cirugia cirugia) {
        LSE<Horario> horarios = medico.getHorariosCitas();

        LocalDate fechaCirugia = cirugia.getFechaCirugia();
        LocalTime horaInicioCirugia = cirugia.getHoraInicio();
        LocalTime horaFinCirugia = cirugia.getHoraFinal();

        if (horaInicioCirugia.isBefore(medico.getHoraInicioJornada()) || horaInicioCirugia.isAfter(medico.getHoraFinJornada())
                || horaFinCirugia.isAfter(medico.getHoraFinJornada())) {
            throw new AgendaException("La hora que desea programar se encuentra fuera del horario del médico");
        }
        for (int i = 0; i < horarios.size(); i++) {
            Horario horario = horarios.get(i);

            if (horario.getFecha().equals(fechaCirugia)) {
                if (horaInicioCirugia.equals(horario.getHoraInicioCita()) && !horario.isDisponible()) {
                    throw new AgendaException("Médico no disponible");
                }
            }

            if (horario.getFecha().equals(fechaCirugia)) {
                if (horaInicioCirugia.equals(horario.getHoraInicioCita()) && !horario.isDisponible()) {
                    throw new AgendaException("Médico no disponible");
                }
            }
        }
    }

    private void validarHoraQuirofano(Separado separado) {
        LocalDate fecha = separado.getFecha();
        LocalTime hora = separado.getHoraInicio();

        if (fecha.equals(LocalDate.now()) && hora.isBefore(LocalTime.now())) {
            throw new HoraInvalidaException();
        }
    }

    private void validarAgendaEnfermera(Enfermera enfermera, Cirugia cirugia) {
        LSE<Cirugia> cirugias = enfermera.getCirugias();

        LocalDate fechaCirugia = cirugia.getFechaCirugia();
        LocalTime horaInicioCirugia = cirugia.getHoraInicio();
        LocalTime horaFinalCirugia = cirugia.getHoraFinal();

        for (int i = 0; i < cirugias.size(); i++) {
            Cirugia aux = cirugias.get(i);

            if (aux.getFechaCirugia().equals(fechaCirugia)) {
                if (horaInicioCirugia.isBefore(aux.getHoraInicio()) || horaInicioCirugia.isAfter(aux.getHoraFinal())
                        || horaInicioCirugia.equals(aux.getHoraInicio()) || horaFinalCirugia.isBefore(aux.getHoraFinal())) {
                    throw new AgendaException("Enfermera no disponible");

                }
            }
        }
    }

    private void validarDisponiblidadQuirofano(Cirugia cirugia) {
        LSE<Separado> separados = quirofano.getSeparados();

        LocalDate fecha = cirugia.getFechaCirugia();
        LocalTime horaInicio = cirugia.getHoraInicio();
        LocalTime horaFinal = cirugia.getHoraFinal();

        for (int i = 0; i < separados.size(); i++) {
            Separado separado = separados.get(i);
            if (fecha.equals(separado.getFecha())) {
                if (horaInicio.isAfter(separado.getHoraInicio()) && horaInicio.isBefore(separado.getHoraFinal())
                        || horaFinal.isAfter(separado.getHoraInicio()) && horaFinal.isBefore(separado.getHoraFinal())
                        || horaInicio.equals(separado.getHoraInicio())) {
                    throw new AgendaException("El quirofano ya se encuentra separado para esa fecha y hora");
                }
            }
        }
        if (quirofano.getMantenimiento() != null) {
            LocalDate fechaSeparar = quirofano.getMantenimiento().getFechaInicio().plusDays(3);

            if (cirugia.getFechaCirugia().isBefore(fechaSeparar)) {
                throw new MantenimientoQuirofanoException(fechaSeparar);
            }

        }

    }
}
