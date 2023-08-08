/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelos;

import enums.Rol;
import util.LSE;

/**
 *
 * @author LENOVO
 */
public class Enfermera extends Persona {
    private LSE<Cirugia> cirugias;
    private boolean asistencial;

    public Enfermera(boolean asistencial, String cedula, String nombre, String direccion, String telefono, String usuario, String contrasenia) {
        super(cedula, nombre, direccion, telefono, usuario, contrasenia, Rol.ENFERMERA);
        this.asistencial = asistencial;
        cirugias = new LSE<>();
    }

    public boolean isAsistencial() {
        return asistencial;
    }

    public void setAsistencial(boolean asistencial) {
        this.asistencial = asistencial;
    }

    public LSE<Cirugia> getCirugias() {
        return cirugias;
    }
    
    
}