/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelos;

import java.io.Serializable;
import util.LSE;

/**
 *
 * @author LENOVO
 */
public class Quirofano implements Serializable {
    
    public static final String DISPONIBLE = "Disponible";
    public static final String OCUPADO = "Ocupado";
    public static final String EN_MANTENIMIENTO = "En mantenimiento";
    
    private final LSE<Separado> separados;
    private Mantenimiento mantenimiento;
    private String estado;

    public Quirofano() {
        this.separados = new LSE<>();
        this.estado = DISPONIBLE;
    }

    public Mantenimiento getMantenimiento() {
        return mantenimiento;
    }

    public void setMantenimiento(Mantenimiento mantenimiento) {
        this.mantenimiento = mantenimiento;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public LSE<Separado> getSeparados() {
        return separados;
    }
    
    public Separado buscarQuirofanoSeparado(int id){
        for(int i = 0; i < separados.size(); i++){
            if(separados.get(i).getId() == id){
                return separados.get(i);
            }
        }
        return null;
    }

}
