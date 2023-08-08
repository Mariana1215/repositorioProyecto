/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelos;


import java.io.Serializable;
import java.time.LocalDate;
import java.time.LocalTime;
import util.LSE;


/**
 *
 * @author LENOVO
 */
public class Separado implements Serializable {
    private static int contadorId = 1;
    
    private Cirugia cirugia;
    private int id;
    private LocalDate fecha;
    private LocalTime horaInicio;
    private LocalTime horaFinal;

    public Separado(Cirugia cirugia) {
        this.cirugia = cirugia;
        id = getIdSiguiente();
        fecha = cirugia.getFechaCirugia();
        horaInicio = cirugia.getHoraInicio();
        horaFinal = cirugia.getHoraFinal().plusHours(1);

        
        
    }

    public int getId() {
        return id;
    }

    

    public Cirugia getCirugia() {
        return cirugia;
    }

    public LocalDate getFecha() {
        return fecha;
    }

    public LocalTime getHoraInicio() {
        return horaInicio;
    }

    public LocalTime getHoraFinal() {
        return horaFinal;
    }
    
    private int getIdSiguiente(){
        return contadorId++;
    }

}
