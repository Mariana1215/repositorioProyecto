/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controladores;

import excepciones.EstaSeparadoException;
import java.time.LocalDate;
import java.time.LocalTime;
import modelos.Mantenimiento;
import modelos.Quirofano;
import modelos.Separado;
import singleton.Singleton;
import util.LSE;

/**
 *
 * @author LENOVO
 */
public class ControladorMantenimientoQuirofano {
    
    private Quirofano quirofano;
    private LSE<Separado> separados;

    public ControladorMantenimientoQuirofano(Quirofano quirofano) {
        this.quirofano = quirofano;
        separados = quirofano.getSeparados();
    }
    
    public void inhabilitarQuirofano(Mantenimiento mantenimiento){
        LocalDate fecha = LocalDate.now();
        LocalDate fechaFinal = fecha.plusDays(2);
        
        if(estaSeparado(fecha, fechaFinal)){
            throw new EstaSeparadoException();
        }
        
        quirofano.setEstado(Quirofano.EN_MANTENIMIENTO);
        quirofano.setMantenimiento(mantenimiento);
        Singleton.getINSTANCIA().escribirQuirofano();
    }
    
    public void habilitarQuirofano(){
        quirofano.setEstado(Quirofano.DISPONIBLE);
        quirofano.setMantenimiento(null);
        Singleton.getINSTANCIA().escribirQuirofano();
        
    }
    
    private boolean estaSeparado(LocalDate fecha, LocalDate fechaFinal){
        for(int i = 0; i < separados.size(); i++){
            LocalDate fechaQuirofanoSeparado = separados.get(i).getFecha();
            if(fechaQuirofanoSeparado.isAfter(fecha) && fechaQuirofanoSeparado.isBefore(fechaFinal) ||
                    fechaQuirofanoSeparado.equals(fecha)){
                return true;
            }
        }
        return false;
    }
}
