/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelos;

import java.io.Serializable;
import java.time.LocalDate;
import java.time.LocalTime;

/**
 *
 * @author LENOVO
 */
public class Mantenimiento implements Serializable{
    
    private final String motivo;
    private final LocalDate fechaInicio;
    private final LocalDate fechaFinal;
   


    public Mantenimiento(String motivo) {
        this.motivo = motivo;
        fechaInicio = LocalDate.now();
        fechaFinal = fechaInicio.plusDays(2);
   
        

    }

    public String getMotivo() {
        return motivo;
    }

    public LocalDate getFechaInicio() {
        return fechaInicio;
    }

    public LocalDate getFechaFinal() {
        return fechaFinal;
    }

    
    
    
}
