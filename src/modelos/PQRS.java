/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelos;

import java.io.Serializable;
import java.time.LocalDate;

/**
 *
 * @author LENOVO
 */
public class PQRS implements Serializable {
    
    public static final String EN_PROCESO = "en proceso";
    public static final String RESUELTA = "Resuelta";
    public static final String ACTIVA = "Activa";
    
    private static int contadorId = 1;
    
    private final Paciente paciente;
    private final LocalDate fecha;
    private final Atencion atencion;
    private final int id;
    private final String motivo;
    private String respuesta;
    private String  estado;

    public PQRS(Paciente paciente, Atencion consulta, String motivo) {
        this.paciente = paciente;
        this.atencion = consulta;
        this.motivo = motivo;
        respuesta = respuesta;
        this.id = getIdSiguiente();
        this.fecha = LocalDate.now();
        this.estado = EN_PROCESO;
    }

    public Atencion getAtencion() {
        return atencion;
    }
    
    public String getMotivo() {
        return motivo;
    }
    
    public String getRespuesta() {
        return respuesta;
    }

    public void setRespuesta(String respuesta) {
        this.respuesta = respuesta;
    }

    public int getId() {
        return id;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public Paciente getPaciente() {
        return paciente;
    }

    public LocalDate getFecha() {
        return fecha;
    }

    public Atencion getConsulta() {
        return atencion;
    }
    
    private int getIdSiguiente(){
        return contadorId++;
    }
}
