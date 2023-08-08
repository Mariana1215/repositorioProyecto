/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controladores;

import modelos.Atencion;
import modelos.Cita;
import modelos.Medico;
import modelos.Paciente;
import singleton.Singleton;
import util.LSE;

/**
 *
 * @author LENOVO
 */
public class ControladorAtencionCita {
    
    private final Medico medico;
    private final LSE<Atencion> historialAtenciones;
    private final LSE<Cita> citas;
    
    public ControladorAtencionCita(Medico medico) {
        this.medico = medico;
        historialAtenciones = Singleton.getINSTANCIA().getHistorialAtenciones();
        citas = Singleton.getINSTANCIA().getCitas();
    }
    
    public void atenderCita(Atencion atencion) {
        RegistrarAtencion(atencion);
    }
    
    private void RegistrarAtencion(Atencion atencion){
        Paciente paciente = atencion.getCita().getPaciente();
        
        medico.atenderCita(atencion);
        paciente.getHistorialconsultas().add(atencion);
        historialAtenciones.add(atencion);
        
        for(int i = 0; i < paciente.getCitas().size(); i++){
            Cita cita = paciente.getCitas().get(i);
            if(cita.getId() == atencion.getCita().getId()){
                paciente.getCitas().remove(i);
            }
        }
        
        for (int i = 0; i < citas.size(); i++) {
            if (citas.get(i).getId() == atencion.getCita().getId()) {
                citas.remove(i);
            }
        }
        
        Singleton.getINSTANCIA().escribirCita();
        Singleton.getINSTANCIA().escribirPersona();
        Singleton.getINSTANCIA().escribirHistorial();
        
    }
    
}
