/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controladores;

import enums.Rol;
import excepciones.PersonaYaRegistradaException;
import excepciones.RegistroInvalidoException;
import javax.swing.JOptionPane;
import modelos.Enfermera;
import modelos.Medico;
import singleton.Singleton;
import util.LSE;

/**
 *
 * @author LENOVO
 */
public class ControladorGestionEnfermera extends ControladorBase {
    
    
   public LSE<Enfermera> getEnfermeras(){
        LSE<Enfermera> enfermeras = new LSE<>();
        for(int i = 0; i < personas.size(); i++){
            if(personas.get(i).getRol() == Rol.ENFERMERA){
                enfermeras.add((Enfermera) personas.get(i));
            }
        }
        return enfermeras;
    }
    
    public void registrarEnfermera(Enfermera enfermera){
         Enfermera aux = buscarEnfermera(enfermera.getCedula());
         Medico auxi = buscarMedico(enfermera.getCedula());
         if(auxi != null){
             throw new RegistroInvalidoException("Ya se encuentra registrada como médico");
         }
        if (aux == null) {
            validarUsuario(enfermera.getUsuario());
            personas.add(enfermera);
            Singleton.getINSTANCIA().escribirPersona();
        } else {
            throw new PersonaYaRegistradaException();
        }
    }
    
    public boolean editarEnfermera(Enfermera enfermera){
        Enfermera aux = buscarEnfermera(enfermera.getCedula());
        boolean editado = false;
        
        if(!aux.getTelefono().equals(enfermera.getTelefono())){
            aux.setTelefono(enfermera.getTelefono());
            editado = true;
        }
        
        if(!aux.getDireccion().equals(enfermera.getDireccion())){
            aux.setDireccion(enfermera.getDireccion());
            editado = true;
        }
        
        if(!aux.getUsuario().equals(enfermera.getUsuario())){
            validarUsuario(enfermera.getUsuario());
            aux.setUsuario(enfermera.getDireccion());
            editado = true;
        }
        
        if(!aux.getContrasenia().equals(enfermera.getContrasenia())){
            aux.setContrasenia(enfermera.getContrasenia());
            editado = true;
        }
        
        if (aux.isAsistencial() != enfermera.isAsistencial()) {
            aux.setAsistencial(enfermera.isAsistencial());
            editado = true;
        }
        
        if(editado){
            Singleton.getINSTANCIA().escribirPersona();
            return true;
        }else{
            return false;
        }

        
    }
    
    public void eliminarEnfermera(String cedula){
       for (int i = 0; i < personas.size(); i++) {
            if (personas.get(i).getRol() == Rol.ENFERMERA) {
                Enfermera enfermera = (Enfermera) personas.get(i);
                if (enfermera.getCedula().equals(cedula)) {
                    personas.remove(i);
                    Singleton.getINSTANCIA().escribirPersona();
                    break;
                }
            }
        }
    }
}
