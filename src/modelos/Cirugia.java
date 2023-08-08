/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelos;

import enums.TipoCirugia;
import java.io.Serializable;
import java.time.LocalDate;
import java.time.LocalTime;
import util.LSE;

/**
 *
 * @author LENOVO
 */
public class Cirugia implements Serializable{
    
    private LSE<Persona> personalSalud;
    private LSE<Instrumental> instrumental;
    private Paciente paciente;
    private Medico cirujano;
    private TipoCirugia tipoCirugia;
    private String motivo;
    private LocalDate fechaCirugia;
    private LocalTime horaInicio;
    private LocalTime horaFinal;
    private int cantidadHoras;

    public Cirugia(Paciente paciente, Medico cirujano,String motivo, LocalDate fechaCirugia, LocalTime horaInicio, int cantidadHoras, TipoCirugia tipoCirugia) {
        instrumental = new LSE<>();
        personalSalud = new LSE<>();
        this.paciente = paciente;
        this.cirujano = cirujano;
        this.tipoCirugia = tipoCirugia;
        this.fechaCirugia = fechaCirugia;
        this.horaInicio = horaInicio;
        this.cantidadHoras = cantidadHoras;
        this.motivo = motivo;
        horaFinal = horaInicio.plusHours(cantidadHoras);
        
        
        
    }

    public Paciente getPaciente() {
        return paciente;
    }

    public Medico getCirujano() {
        return cirujano;
    }

    public TipoCirugia getTipoCirugia() {
        return tipoCirugia;
    }


    public LocalDate getFechaCirugia() {
        return fechaCirugia;
    }

    public LocalTime getHoraInicio() {
        return horaInicio;
    }

    public int getCantidadHoras() {
        return cantidadHoras;
    }

    public LocalTime getHoraFinal() {
        return horaFinal;
    }

    public String getMotivo() {
        return motivo;
    }

    public LSE<Persona> getPersonalSalud() {
        return personalSalud;
    }

    public LSE<Instrumental> getInstrumental() {
        return instrumental;
    }
    
    
    
    
}
