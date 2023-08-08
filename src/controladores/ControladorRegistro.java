/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controladores;

import excepciones.PersonaYaRegistradaException;
import modelos.Paciente;
import modelos.Persona;
import enums.Rol;
import singleton.Singleton;
import util.LSE;

/**
 *
 * @author LENOVO
 */
public class ControladorRegistro extends ControladorBase {
    private LSE<Persona> personas;


    public ControladorRegistro() {
        personas = Singleton.getINSTANCIA().getPersonas();
    }

   
    
    public Paciente buscarPaciente(String cedula){
        for(int i = 0; i < personas.size(); i++){
            if(personas.get(i).getRol() == Rol.PACIENTE){
                if(personas.get(i).getCedula().equals(cedula)){
                    return (Paciente) personas.get(i);
                }
            }
        }
        return null;
    }
    
    public void registrarPaciente(Paciente paciente){
        Paciente aux = buscarPaciente(paciente.getCedula());
        
        if(aux == null){
            validarUsuario(paciente.getUsuario());
            personas.add(paciente);
            Singleton.getINSTANCIA().escribirPersona();
        }else{
            throw new PersonaYaRegistradaException();
        }
    }
    
}
