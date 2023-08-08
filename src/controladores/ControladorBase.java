/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controladores;

import enums.Rol;
import excepciones.UsuarioEnUsoException;
import modelos.Enfermera;
import modelos.Medico;
import modelos.Paciente;
import modelos.Persona;
import singleton.Singleton;
import util.LSE;

/**
 *
 * @author LENOVO
 */
public class ControladorBase {
    
    protected LSE<Persona> personas;

    public ControladorBase() {
        personas = Singleton.getINSTANCIA().getPersonas();
    }

    public LSE<Persona> getPersonas() {
        return personas;
    }
    
    public void validarUsuario(String usuario) {
        for (int i = 0; i < personas.size(); i++) {
            if (personas.get(i).getUsuario().equals(usuario)) {
                throw new UsuarioEnUsoException();

            }
        }
    }
    
    public Paciente buscarPaciente(String cedula){
       for (int i = 0; i < personas.size(); i++) {
            if (personas.get(i).getRol() == Rol.PACIENTE) {
                Paciente paciente = (Paciente) personas.get(i);
                if (paciente.getCedula().equals(cedula)) {
                    return paciente;
                }

            }
        }
        return null;
    }
    
    public Medico buscarMedico(String cedula){
         for (int i = 0; i < personas.size(); i++) {
            if (personas.get(i).getRol() == Rol.MEDICO) {
                Medico medico = (Medico) personas.get(i);
                if (medico.getCedula().equals(cedula)) {
                    return medico;
                }

            }
        }
        return null;
    }
    
     public Enfermera buscarEnfermera(String cedula){
        for (int i = 0; i < personas.size(); i++) {
            if (personas.get(i).getRol() == Rol.ENFERMERA) {
                Enfermera enfermera = (Enfermera) personas.get(i);
                if (enfermera.getCedula().equals(cedula)) {
                    return enfermera;
                }
            }
        }
        return null;
    }
}
