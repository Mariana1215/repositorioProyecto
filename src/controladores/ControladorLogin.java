/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controladores;

import modelos.Enfermera;
import modelos.Medico;
import modelos.Paciente;
import modelos.Persona;
import enums.Rol;
import singleton.Singleton;
import util.LSE;

/**
 *
 * @author LENOVO
 */
public class ControladorLogin {

    private final LSE<Persona> personas;

    public ControladorLogin() {
        personas = Singleton.getINSTANCIA().getPersonas();
    }

    public Persona buscarPersona(String usuario, String contrasenia) {
        for (int i = 0; i < personas.size(); i++) {
            Persona persona = personas.get(i);
            if (persona.getUsuario().equals(usuario) && persona.getContrasenia().equals(contrasenia)) {
                return persona;
            }
        }
        return null;
    }

}
