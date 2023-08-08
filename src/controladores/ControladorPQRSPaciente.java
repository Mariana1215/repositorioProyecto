/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controladores;

import modelos.PQRS;
import modelos.Paciente;
import singleton.Singleton;
import util.LSE;
import util.Queue;

/**
 *
 * @author LENOVO
 */
public class ControladorPQRSPaciente {
    
    private Paciente paciente;
    private Queue<PQRS> colaPQRS;

    public ControladorPQRSPaciente(Paciente paciente) {
        this.paciente = paciente;
        colaPQRS = Singleton.getINSTANCIA().getColaPQRS();
    }
    
    public boolean crearPQRS(PQRS pqrs){
        if(!tienePeticiones()){
            paciente.generarPQRS(pqrs);
            colaPQRS.enQueue(pqrs);
            Singleton.getINSTANCIA().escribirPersona();
            Singleton.getINSTANCIA().escribirColaPqrs();
            return true;
        }
        return false;
    }
    
    private boolean tienePeticiones(){
        LSE<PQRS> pqrs = paciente.getPeticiones();
        
        for(int i = 0; i < pqrs.size(); i++){
            if(pqrs.get(i).getEstado() == PQRS.ACTIVA
                    || pqrs.get(i).getEstado() == PQRS.EN_PROCESO){
                return true;
            }
        }
        return false;
    }
            
    
}
