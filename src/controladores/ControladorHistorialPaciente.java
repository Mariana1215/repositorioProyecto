/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controladores;

import modelos.Atencion;
import modelos.Paciente;
import util.LSE;

/**
 *
 * @author LENOVO
 */
public class ControladorHistorialPaciente {
    
    private LSE<Atencion> atenciones;
    
    public ControladorHistorialPaciente(Paciente paciente) {
        atenciones = paciente.getHistorialconsultas();
    }

    public LSE<Atencion> getAtenciones() {
        return atenciones;
    }
    
    public Atencion buscarAtencion(int id) {
        for (int i = 0; i < atenciones.size();i++) {
            if (atenciones.get(i).getId() == id) {
                return atenciones.get(i);
            }
        }
        return null;
     }
}
