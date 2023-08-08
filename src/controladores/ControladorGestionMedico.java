/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controladores;

import enums.Rol;
import excepciones.PersonaYaRegistradaException;
import excepciones.RegistroInvalidoException;
import modelos.Enfermera;
import modelos.Medico;
import singleton.Singleton;
import util.LSE;

/**
 *
 * @author LENOVO
 */
public class ControladorGestionMedico extends ControladorBase {
    
    public LSE<Medico> getMedicos(){
        LSE<Medico> medicos = new LSE<>();
        for(int i = 0; i < personas.size(); i++){
            if(personas.get(i).getRol() == Rol.MEDICO){
                medicos.add((Medico) personas.get(i));
            }
        }
        return medicos;
    }
    
    public void registrarMedico(Medico medico){
         Medico aux = buscarMedico(medico.getCedula());
         Enfermera auxi = buscarEnfermera(medico.getCedula());
         
         if(auxi != null){
             throw new RegistroInvalidoException("Ya se encuentra registrado como enfermera");
         }

        if (aux == null) {
            validarUsuario(medico.getUsuario());
            personas.add(medico);
            Singleton.getINSTANCIA().escribirPersona();
        } else {
            throw new PersonaYaRegistradaException();
        }
    }
    
    public boolean editarMedico(Medico medico){
         
        Medico aux = buscarMedico(medico.getCedula());
        boolean editado = false;
        
        if(!aux.getTelefono().equals(medico.getTelefono())){
            aux.setTelefono(medico.getTelefono());
            editado = true;
        }
        
        if(!aux.getDireccion().equals(medico.getDireccion())){
            aux.setDireccion(medico.getDireccion());
            editado = true;
        }
        
        if(!aux.getUsuario().equals(medico.getUsuario())){
            validarUsuario(medico.getUsuario());
            aux.setUsuario(medico.getDireccion());
            editado = true;
        }
        
        if(!aux.getContrasenia().equals(medico.getContrasenia())){
            aux.setContrasenia(medico.getContrasenia());
            editado = true;
        }
        
        if(!aux.getHoraInicioJornada().equals(medico.getHoraInicioJornada())){
            aux.setHoraInicioJornada(medico.getHoraInicioJornada());
            editado = true;
        }
        
        if(!aux.getHoraFinJornada().equals(medico.getHoraFinJornada())){
            aux.setHoraFinJornada(medico.getHoraFinJornada());
            editado = true;
        }
        
        if(editado){
            Singleton.getINSTANCIA().escribirPersona();
            return true;
        }else{
            return false;
        }
    }
    
    public void eliminarMedico(String cedula){
        for (int i = 0; i < personas.size(); i++) {
            if (personas.get(i).getRol() == Rol.MEDICO) {
                Medico medico = (Medico) personas.get(i);
                if (medico.getCedula().equals(cedula)) {
                    personas.remove(i);
                    Singleton.getINSTANCIA().escribirPersona();
                    break;
                }
            }
        }
    }
}
