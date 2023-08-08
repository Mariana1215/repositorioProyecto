/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelos;

import enums.Especializacion;
import enums.Rol;
import java.time.LocalDate;
import java.time.LocalTime;
import util.LSE;

/**
 *
 * @author LENOVO
 */
public class Medico extends Persona  {
    
    private final Especializacion especializacion;
    private final LSE<Atencion> historialConsultas;
    private final LSE<Cita> citas;
    private final LSE<Horario> horariosCitas;
    private final LSE<Cirugia> cirugias;
    private LocalTime horaInicioJornada;
    private LocalTime horaFinJornada;
    private LocalDate diaLibre;


    public Medico(Especializacion especializacion, LocalTime horaInicioJornada, LocalTime horaFinJornada, 
            String cedula, String nombre, String direccion, String telefono, String usuario, String contrasenia) {
        super(cedula, nombre, direccion, telefono, usuario, contrasenia, Rol.MEDICO);
        this.especializacion = especializacion;
        this.horaInicioJornada = horaInicioJornada;
        this.horaFinJornada = horaFinJornada;
        this.historialConsultas = new LSE<>();
        this.citas = new LSE<>();
        this.horariosCitas = new LSE<>();
        this.cirugias = new LSE<>();
        this.diaLibre = null;
    }

    public LSE<Cirugia> getCirugias() {
        return cirugias;
    }

    public LSE<Horario> getHorariosCitas() {
        return horariosCitas;
    }
    
    public Especializacion getEspecializacion() {
        return especializacion;
    }

    public LSE<Atencion> getHistorialConsultas() {
        return historialConsultas;
    }

    public LSE<Cita> getCitas() {
        return citas;
    }

    public LocalTime getHoraInicioJornada() {
        return horaInicioJornada;
    }

    public LocalTime getHoraFinJornada() {
        return horaFinJornada;
    }

    public LocalDate getDiaLibre() {
        return diaLibre;
    }

    public void setHoraInicioJornada(LocalTime horaInicioJornada) {
        this.horaInicioJornada = horaInicioJornada;
    }

    public void setHoraFinJornada(LocalTime horaFinJornada) {
        this.horaFinJornada = horaFinJornada;
    }
    
    public boolean tieneDiaLibre(){
        return diaLibre != null;
    }

    public void setDiaLibre(LocalDate diaLibre) {
        this.diaLibre = diaLibre;
    }
    
    public void atenderCita(Atencion atencion) {
        historialConsultas.add(atencion);
        
        for (int i = 0; i < citas.size(); i++) {
            if (citas.get(i).getId() == atencion.getCita().getId()) {
                citas.remove(i);
            }
        }
        
    }
    
}
