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
public class Horario implements Serializable {
    
    private LocalDate fecha;
    private LocalTime horaInicioCita;
    private LocalTime horaFinalCita;
    private boolean disponible;

    public Horario(LocalDate fecha, LocalTime horaInicioCita, LocalTime horaFinalCita) {
        this.fecha = fecha;
        this.horaInicioCita = horaInicioCita;
        this.horaFinalCita = horaFinalCita;
    }

    public LocalTime getHoraInicioCita() {
        return horaInicioCita;
    }

    public void setHoraInicio(LocalTime horaInicioCita) {
        this.horaInicioCita = horaInicioCita;
    }

    public LocalTime getHoraFinal() {
        return horaFinalCita;
    }

    public void setHoraFinal(LocalTime horaFinalCita) {
        this.horaFinalCita = horaFinalCita;
    }

    public boolean isDisponible() {
        return disponible;
    }

    public void setDisponible(boolean disponible) {
        this.disponible = disponible;
    }

    public LocalDate getFecha() {
        return fecha;
    }

    public void setFecha(LocalDate fecha) {
        this.fecha = fecha;
    }
}
