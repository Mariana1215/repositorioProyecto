/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controladores;

import enums.Rol;
import java.time.LocalDate;
import modelos.Atencion;
import modelos.Medico;
import modelos.Persona;
import singleton.Singleton;
import util.LSE;

/**
 *
 * @author LENOVO
 */
public class ControladorConsultasMedico {
    private LSE<Persona> personas;
    private int Cantidad;

    public ControladorConsultasMedico() {
        personas = Singleton.getINSTANCIA().getPersonas();
    }

    public int getCantidad() {
        return Cantidad;
    }

    public void setCantidad(int Cantidad) {
        this.Cantidad = Cantidad;
    }
    
    private LSE<Medico> obtenerMedicos(){
        LSE<Medico> medicos = new LSE<>();
        
        for(int i = 0; i < personas.size(); i++){
            if(personas.get(i).getRol() == Rol.MEDICO){
                Medico medico = (Medico) personas.get(i);
                medicos.add(medico);
            }
        }
        return medicos;
    }
    
    private int obtenerAtenciones(Medico medico, LocalDate fechaInicio, LocalDate fechaFinal){
        LSE<Atencion> atenciones = medico.getHistorialConsultas();
        int cantidadCitas = 0;
        
        for(int i = 0; i < atenciones.size(); i++){
            LocalDate fecha = atenciones.get(i).getFechaCita();
            if(fecha.equals(fechaInicio) || fecha.equals(fechaFinal)
                    || fecha.isAfter(fechaInicio) && fecha.isBefore(fechaFinal));
            cantidadCitas++;
        }
        return cantidadCitas;
    }
    
    public Medico filtrarMedico(LocalDate fechaInicio, LocalDate fechaFinal){
        Medico medicoConsultas = null;
        int cantidad = 0;
        
        for(int i = 0; i < obtenerMedicos().size(); i++){
            Medico medico = obtenerMedicos().get(i);
            int atenciones = obtenerAtenciones(medico, fechaInicio, fechaFinal);
            
            if(atenciones > cantidad){
                cantidad = atenciones;
                medicoConsultas = medico;
            }
            
        }
        setCantidad(cantidad);
        return medicoConsultas;
    }
    
}
