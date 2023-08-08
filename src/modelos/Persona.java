/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelos;

import enums.Rol;

/**
 *
 * @author LENOVO
 */
public class Persona extends Usuario {

    private final String cedula;
    private String nombre;
    private String direccion;
    private String telefono;

    public Persona(String cedula, String nombre, String direccion, String telefono, String usuario, String contrasenia, Rol rol) {
        super(usuario, contrasenia, rol);
        this.cedula = cedula;
        this.nombre = nombre;
        this.direccion = direccion;
        this.telefono = telefono;
    }

    public String getCedula() {
        return cedula;
    }

    public String getNombre() {
        return nombre;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }


}
