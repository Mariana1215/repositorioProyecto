/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controladores;

import enums.Rol;
import excepciones.AgendaException;
import excepciones.RegistroInvalidoException;
import java.time.LocalDate;
import java.time.LocalTime;
import modelos.Cirugia;
import modelos.Enfermera;
import modelos.Horario;
import modelos.Instrumental;
import modelos.Medico;
import singleton.Singleton;
import util.LSE;

/**
 *
 * @author LENOVO
 */
public class ControladorGestionReserva extends ControladorBase {
    
    private Cirugia cirugia;

    public ControladorGestionReserva(Cirugia cirugia) {
        this.cirugia = cirugia;
    }
    
    public LSE<Medico> obtenerMedicosAsignados(){
        LSE<Medico> medicos = new LSE<>();
        for(int i = 0; i <cirugia.getPersonalSalud().size(); i++){
            if(cirugia.getPersonalSalud().get(i).getRol() == Rol.MEDICO){
                medicos.add((Medico) cirugia.getPersonalSalud().get(i));
            }
        }
        return medicos;
    }
    
    public LSE<Enfermera> obtenerEnfermerasAsignadas(){
        LSE<Enfermera> enfermeras = new LSE<>();
        for(int i = 0; i < cirugia.getPersonalSalud().size(); i++){
            if(cirugia.getPersonalSalud().get(i).getRol() == Rol.ENFERMERA){
               enfermeras.add((Enfermera) cirugia.getPersonalSalud().get(i));
            }
        }
        return enfermeras;
    }
    
    public LSE<Medico> obtenerMedicosDisponibles(){
        LSE<Medico> medicos = new LSE<>();
        for(int i = 0; i < personas.size(); i++){
            if(personas.get(i).getRol() == Rol.MEDICO){
                Medico medico = (Medico) personas.get(i);
                if(!medico.getCedula().equals(cirugia.getCirujano().getCedula())){
                    if(!medicoDisponible(medico)){
                        medicos.add(medico);
                    }
                }
            }
        }
        return medicos;
    }
    
    public LSE<Enfermera> obtenerEnfermerasDisponible(){
        LSE<Enfermera> enfermeras = new LSE<>();
        for(int i = 0; i < personas.size(); i++){
            if(personas.get(i).getRol() == Rol.ENFERMERA){
                Enfermera enfermera = (Enfermera) personas.get(i);
                if(!enfermeraDiponible(enfermera)){
                    enfermeras.add(enfermera);
                }
            }
        }
        return enfermeras;
    }
    
    public void registrarMedico(Medico medico){
        cirugia.getPersonalSalud().add(medico);
        medico.getCirugias().add(cirugia);
        
        Horario horario = new Horario(cirugia.getFechaCirugia(), cirugia.getHoraInicio(), cirugia.getHoraFinal());
        horario.setDisponible(true);
        medico.getHorariosCitas().add(horario);
        
        
        Singleton.getINSTANCIA().escribirPersona();
        Singleton.getINSTANCIA().escribirQuirofanoSeparado();
    }
    
    public void registrarEnfermera(Enfermera enfermera){
        cirugia.getPersonalSalud().add(enfermera);
        enfermera.getCirugias().add(cirugia);
        Singleton.getINSTANCIA().escribirPersona();
        Singleton.getINSTANCIA().escribirQuirofanoSeparado();
    }
    
    public void registrarInstrumentos(Instrumental instrumental){
        cirugia.getInstrumental().add(instrumental);
        Singleton.getINSTANCIA().escribirQuirofanoSeparado();
    }
    
    private boolean medicoDisponible(Medico medico){
        LSE<Horario> horarios = medico.getHorariosCitas();
        
        LocalDate fecha = cirugia.getFechaCirugia();
        LocalTime horaInicio = cirugia.getHoraInicio();
        LocalTime horaFinal = cirugia.getHoraFinal();
        
        if(horaInicio.isBefore(medico.getHoraInicioJornada()) || horaInicio.isAfter(medico.getHoraFinJornada())
                ||horaFinal.isAfter(medico.getHoraFinJornada())){
           return true;
        }
        
        if(medico.tieneDiaLibre() && medico.getDiaLibre().equals(fecha)){
            return true;
        }
        
        for(int i = 0; i < horarios.size(); i++){
            Horario horario = horarios.get(i);
            
            if(horario.getFecha().equals(fecha)){
                if(horaInicio.equals(horario.getHoraInicioCita()) && !horario.isDisponible()){
                    return true;
                }
            }
        }
        return false;
    }
    
    private boolean enfermeraDiponible(Enfermera enfermera){
        LSE<Cirugia> cirugias = enfermera.getCirugias();
        
        LocalDate fecha = cirugia.getFechaCirugia();
        LocalTime horaInicio = cirugia.getHoraInicio();
        LocalTime horaFinal = cirugia.getHoraFinal();
        
        for(int i = 0; i < cirugias.size(); i++){
            Cirugia cirugia = cirugias.get(i);
            if(fecha.equals(cirugia.getFechaCirugia())){
                if(horaInicio.isAfter(cirugia.getHoraInicio()) && horaInicio.isBefore(cirugia.getHoraFinal())
                        || horaFinal.isAfter(cirugia.getHoraInicio()) && horaFinal.isBefore(cirugia.getHoraFinal())
                        || horaInicio.equals(cirugia.getHoraInicio())){
                     return true;
                }
            }
        }
        return false;
    }
    
}
