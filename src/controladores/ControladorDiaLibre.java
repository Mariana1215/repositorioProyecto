/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controladores;

import excepciones.AgendaException;
import excepciones.DiaLibreInvalidoException;
import java.time.LocalDate;
import modelos.Cita;
import modelos.Medico;
import singleton.Singleton;
import util.LSE;

/**
 *
 * @author LENOVO
 */
public class ControladorDiaLibre {
    
    private final Medico medico;

    public ControladorDiaLibre(Medico medico) {
        this.medico = medico;
        reiniciarDiaLibre();
        
    }
    
    public boolean programarDialibre(LocalDate fecha){
        if(!medico.tieneDiaLibre()){
        validarFecha(fecha);
        validarCitas(fecha);
        medico.setDiaLibre(fecha);
        Singleton.getINSTANCIA().escribirPersona();
            return true;
        }
        return false;
    }
    
    
    private void reiniciarDiaLibre(){
        if(medico.tieneDiaLibre()){
            if(medico.getDiaLibre().isBefore(LocalDate.now())){
                medico.setDiaLibre(null);
                Singleton.getINSTANCIA().escribirPersona();
            }
        }
    }
    
    private void validarFecha(LocalDate fecha){
        if(fecha.isBefore(LocalDate.now()) || fecha.equals(LocalDate.now())){
            throw new DiaLibreInvalidoException();
        }
    }
    
    private void validarCitas(LocalDate fecha){
        LSE<Cita> citas = medico.getCitas();
        
        for(int i = 0; i < citas.size(); i++){
            if(fecha.isEqual(citas.get(i).getFecha())){
                throw new AgendaException("Tiene citas programadas para ese día");
            }
        }
    }
    
    public void eliminarDiaLibre(){
        medico.setDiaLibre(null);
        Singleton.getINSTANCIA().escribirPersona();
    }
}
