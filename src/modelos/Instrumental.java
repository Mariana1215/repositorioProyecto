/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelos;

import java.io.Serializable;

/**
 *
 * @author LENOVO
 */
public class Instrumental implements Serializable{
    
    private final String nombreInstrumento;
    private int cantidad;

    public Instrumental(String nombreInstrumento, int cantidad) {
        this.nombreInstrumento = nombreInstrumento;
        this.cantidad = cantidad;
    }

    public String getNombreInstrumento() {
        return nombreInstrumento;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }
    
    
    
    
}
