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
public class Atencion implements Serializable {
    
    private static int contadorId = 1;
    
    private final Cita cita;
    private final LocalDate fechaCita;
    private final String diagnostico;
    private final String tratamiento;
    private final int id;
    private String nota;
    
    public Atencion(Cita cita, String diagnostico, String tratamiento, String nota) {
        this.cita = cita;
        this.fechaCita = LocalDate.now();
        this.diagnostico = diagnostico;
        this.tratamiento = tratamiento;
        this.nota = nota;
        this.id = getIdSiguiente();
    }

    public int getId() {
        return id;
    }

    public Cita getCita() {
        return cita;
    }

    public LocalDate getFechaCita() {
        return fechaCita;
    }

    public String getDiagnostico() {
        return diagnostico;
    }

    public String getTratamiento() {
        return tratamiento;
    }

    public String getNota() {
        return nota;
    }
    
    private int getIdSiguiente(){
        return contadorId++;
    }
}
