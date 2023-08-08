/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelos;

import enums.Rol;
import java.io.Serializable;

/**
 *
 * @author LENOVO
 */
public class Usuario implements Serializable {
    
    private String usuario;
    private String contrasenia;
    private Rol rol;

    public Usuario(String usuario, String contrasenia, Rol rol) {
        this.usuario = usuario;
        this.contrasenia = contrasenia;
        this.rol = rol;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getContrasenia() {
        return contrasenia;
    }

    public void setContrasenia(String contrasenia) {
        this.contrasenia = contrasenia;
    }

    public Rol getRol() {
        return rol;
    }
    
}
