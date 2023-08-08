/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controladores;

import enums.Rol;
import excepciones.NoHayPQRSException;
import modelos.PQRS;
import modelos.Paciente;
import modelos.Persona;
import singleton.Singleton;
import util.LSE;
import util.Queue;

/**
 *
 * @author LENOVO
 */
public class ControladorPQRSAdmin {
    private Queue<PQRS> colaPQRS;
    private LSE<Persona> personas;

    public ControladorPQRSAdmin() {
        colaPQRS = Singleton.getINSTANCIA().getColaPQRS();
        personas = Singleton.getINSTANCIA().getPersonas();
    }
    
    private LSE<Paciente> obtenerPaciente(){
        LSE<Paciente> pacientes = new LSE<>();
        for(int i = 0; i  < pacientes.size(); i++){
            if(personas.get(i).getRol() == Rol.PACIENTE){
                Paciente paciente = (Paciente) personas.get(i);
                pacientes.add(paciente);
            }
        }
        return pacientes;
    }
    
    public PQRS mostrarSiguiente(){
        if(!colaPQRS.isEmpty()){
            return colaPQRS.peek();
        }else{
            throw new NoHayPQRSException();
        }
    }
    
    public PQRS atenderPQRS(PQRS pqrs){
        pqrs.setEstado(PQRS.RESUELTA);
        Singleton.getINSTANCIA().escribirPersona();
        Singleton.getINSTANCIA().escribirColaPqrs();
        return pqrs;
    }
    
    public PQRS saltarPQRS(){
        PQRS pqrs = colaPQRS.deQueue();
        
        if(pqrs != null){
            return pqrs;
        }else{
            throw new NoHayPQRSException();
        }
    }
    
    public PQRS mostrarPQRS(){
        for( int i = 0; i < obtenerPaciente().size(); i++){
            Paciente paciente = obtenerPaciente().get(i);
            for(int j = 0; j < paciente.getPeticiones().size(); i++){
                PQRS pqrs = paciente.getPeticiones().get(i);
                if(pqrs.getEstado().equals(PQRS.EN_PROCESO)){
                    return pqrs;
                }
            }
            
        }
        return null;
    }
    
    public void pasarEnProceso(PQRS pqrs){
        pqrs.setEstado(PQRS.EN_PROCESO);
        Singleton.getINSTANCIA().escribirPersona();
        Singleton.getINSTANCIA().escribirColaPqrs();
        
    }
}
