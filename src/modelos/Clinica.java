/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelos;

import singleton.Singleton;
import util.LSE;

/**
 *
 * @author LENOVO
 */
public class Clinica {
    private Quirofano[][] quirofanos;
    private LSE<Persona> personas;

    public Clinica() {
        quirofanos = Singleton.getINSTANCIA().getQuirofanos();
        personas = Singleton.getINSTANCIA().getPersonas();
    }

    public Quirofano[][] getQuirofanos() {
        return quirofanos;
    }

    public void setQuirofanos(Quirofano[][] quirofanos) {
        this.quirofanos = quirofanos;
    }

    public LSE<Persona> getPersonas() {
        return personas;
    }

    public void setPersonas(LSE<Persona> personas) {
        this.personas = personas;
    }
    
    
    
    
}
