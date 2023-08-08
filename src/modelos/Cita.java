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
public class Cita implements Serializable {
    
    private static int contadorId = 1;
    
    private final Paciente paciente;
    private final Medico medico;
    private final LocalDate fecha;
    private final LocalTime horaInicio;
    private final LocalTime horaFinal;
    private final String motivo;
    private final int id;
    

    public Cita(Paciente paciente, Medico medico, LocalDate fecha, LocalTime hora, String motivo) {
        this.paciente = paciente;
        this.medico = medico;
        this.fecha = fecha;
        this.horaInicio = hora;
        this.horaFinal = hora.plusMinutes(30);
        this.motivo = motivo;
        this.id = getIdSiguiente();
    }

    public Paciente getPaciente() {
        return paciente;
    }

    public Medico getMedico() {
        return medico;
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

    public String getMotivo() {
        return motivo;
    }

    public int getId() {
        return id;
    }
    
    private int getIdSiguiente(){
        return contadorId++;
    }
}
