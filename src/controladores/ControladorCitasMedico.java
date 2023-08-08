/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controladores;

import java.time.LocalDate;
import modelos.Cita;
import modelos.Medico;
import util.LSE;

/**
 *
 * @author LENOVO
 */
public class ControladorCitasMedico {
    
    private final LSE<Cita> citasProgramadas;
    private final Medico medico;
    
    

    public ControladorCitasMedico(Medico medico) {
        this.medico = medico;
       citasProgramadas = medico.getCitas();
    }

    public LSE<Cita> getCitasProgramadas() {
        return citasProgramadas;
    }

    public Cita buscarCita(int id){
        for(int i = 0; i < citasProgramadas.size(); i++){
            if(citasProgramadas.get(i).getId() == id){
                return citasProgramadas.get(i);
            }
        }
        return null;
    }
    
    public LSE<Cita> ListaDeCitasPorFechas(LocalDate fecha){
        LSE<Cita> citas = new LSE<>();
        
        if(fecha != null){
            for(int i = 0; i < citasProgramadas.size(); i++){
                if(citasProgramadas.get(i).getFecha().equals(fecha)){
                    citas.add(citasProgramadas.get(i));
                }
            }
        }
        return citas;
    }
    
}
