/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Enum.java to edit this template
 */
package enums;

import java.io.Serializable;

/**
 *
 * @author LENOVO
 */
public enum Especializacion implements Serializable{
    
/**    Para que los campos no queden abiertos a especilizaciones indebidas (num u otras cosas)
 * y para pre-establecer cuales van a ser las especialiaciones
 */
    
    
    GENERAL("General"),
    CARDIOLOGIA("Cardiologia"),
    NEUROLOGIA("Neurologia"),
    GINECOLOGIA("Ginecologia"),
    GINEOBSTETRICIA("Gineobstetricia"),
    DERMATOLOGO("Dermatologo"),
    OFTAMOLOGO("Oftamologo"),
    ORTOPEDISTA("Ortopedista"),
    ANESTESIOLOGIA("Anestesiologia");
    
    private final String valor;

    private Especializacion(String especializacion) {
        this.valor = especializacion;
    }

    public String getValor() {
        return valor;
    }
    
    public static String[] obtenerEspecializaciones(){
        Especializacion[] especializaciones = Especializacion.values();
        String[] valores = new String[especializaciones.length];
        
        for(int i = 0; i < especializaciones.length; i++){
            valores[i] = especializaciones[i].getValor();
        }
        return valores;
    }
    
}
