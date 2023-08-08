/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controladores;

import java.time.LocalDate;
import java.time.LocalTime;
import modelos.Cirugia;
import modelos.Quirofano;
import modelos.Separado;
import singleton.Singleton;
import util.LSE;

/**
 *
 * @author LENOVO
 */
public class ControladorQuirofano {
    Quirofano[][] quirofanos;

    public ControladorQuirofano() {
        quirofanos = Singleton.getINSTANCIA().getQuirofanos();
        initQuirofanos();
    }
    
     private void initQuirofanos(){
        if(quirofanos[0][0] == null){
            for(int i = 0; i < quirofanos.length; i++){
                for(int j = 0; j < quirofanos[i].length; j++){
                    quirofanos[i][j] = new Quirofano();
                }
            }
            Singleton.getINSTANCIA().escribirQuirofano();
        }else{
            Singleton.getINSTANCIA().leerQuirofano();
        }
    }
     
     public Separado mostrarInfo(Quirofano quirofano){
         LSE<Separado> separados = quirofano.getSeparados();
         
         for(int i = 0; i < separados.size(); i++){
             return separados.get(i);
         }
         return null;
     }
    
     public Quirofano obtenerQuirofano(int fila, int columna){
         return quirofanos[fila][columna];
     }
     
     public void estadoQuirofano(){
         //<=0 negativo antes de la hora actual
         //>=0 positivo despues de la hora actual
         LocalDate fecha = LocalDate.now();
         LocalTime hora = LocalTime.now();
         
         for(int i = 0; i < quirofanos.length; i++){
             for(int j = 0; j < quirofanos.length; j++){
                 Quirofano quirofano = quirofanos[i][j];
                 
                 boolean estaSeparado = false;
                 
                 for(int k = 0; k < quirofano.getSeparados().size(); k++){
                     Separado separado = quirofano.getSeparados().get(k);
                     if(separado.getFecha().equals(fecha) && separado.getHoraInicio().compareTo(hora) <=0
                             && separado.getHoraFinal().compareTo(hora)>=0){
                         quirofano.setEstado(Quirofano.OCUPADO);
                         estaSeparado = true;
                     }
                 }
                 
                 if(!estaSeparado){
                     if(quirofano.getMantenimiento() != null){
                         quirofano.setEstado(Quirofano.EN_MANTENIMIENTO);
                     }else{
                         quirofano.setEstado(Quirofano.DISPONIBLE);
                     }
                     
                     if(quirofano.getMantenimiento() != null && quirofano.getMantenimiento().getFechaFinal().isBefore(fecha)){
                         quirofano.setEstado(Quirofano.DISPONIBLE);
                     }
                     Singleton.getINSTANCIA().escribirQuirofano();
                 }
                 
             }
         }
     }
     
     public boolean enAseo(Quirofano quirofano){
         LSE<Separado> separados = quirofano.getSeparados();
         
         for(int i = 0; i < separados.size(); i++){
             Cirugia cirugia =  separados.get(i).getCirugia();
             if(separados.get(i).getFecha().equals(LocalDate.now())){
                 if(LocalTime.now().isAfter(cirugia.getHoraFinal()) &&
                         LocalTime.now().isBefore(separados.get(i).getHoraFinal())){
                     return true;
                 }
             }
         }
         return false;
     }
}
