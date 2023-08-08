/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controladores;

import enums.Rol;
import excepciones.PersonaYaRegistradaException;
import modelos.Paciente;
import singleton.Singleton;
import util.LSE;

/**
 *
 * @author LENOVO
 */
public class ControladorGestionPaciente extends ControladorBase{
    
    public LSE<Paciente> getPacientes(){
        LSE<Paciente> pacientes = new LSE<>();
        for(int i = 0; i < personas.size(); i++){
            if(personas.get(i).getRol() == Rol.PACIENTE){
                pacientes.add((Paciente) personas.get(i));
            }
        }
        return pacientes;
    }

    public void registrarPaciente(Paciente paciente){
        Paciente aux = buscarPaciente(paciente.getCedula());

        if (aux == null) {
            validarUsuario(paciente.getUsuario());
            personas.add(paciente);
            Singleton.getINSTANCIA().escribirPersona();
        } else {
            throw new PersonaYaRegistradaException();
        }
    }
    
    public boolean editarPaciente(Paciente paciente){
        Paciente aux = buscarPaciente(paciente.getCedula());
        boolean editado = false;
        
        if(!aux.getTelefono().equals(paciente.getTelefono())){
            aux.setTelefono(paciente.getTelefono());
            editado = true;
        }
        
        if(!aux.getDireccion().equals(paciente.getDireccion())){
            aux.setDireccion(paciente.getDireccion());
            editado = true;
        }
        
        if(!aux.getUsuario().equals(paciente.getUsuario())){
            validarUsuario(paciente.getUsuario());
            aux.setUsuario(paciente.getDireccion());
            editado = true;
        }
        
        if(!aux.getContrasenia().equals(paciente.getContrasenia())){
            aux.setContrasenia(paciente.getContrasenia());
            editado = true;
        }
        
        if(editado){
            Singleton.getINSTANCIA().escribirPersona();
            return true;
        }else{
            return false;
        }

        
    }
    
    public void eliminarPaciente(String cedula){
       for (int i = 0; i < personas.size(); i++) {
            if (personas.get(i).getRol() == Rol.PACIENTE) {
                Paciente paciente = (Paciente) personas.get(i);
                if (paciente.getCedula().equals(cedula)) {
                    personas.remove(i);
                    Singleton.getINSTANCIA().escribirPersona();
                    break;
                }
            }
        }

    }
}
