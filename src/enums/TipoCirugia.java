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
public enum TipoCirugia implements Serializable {
    
    CARDIOLOGIA("cardiologia"),
    NEUROLOGIA("neurologia"),
    GINECOLOGIA("ginecologia"),
    GINEOBSTETRICIA("gineobstetricia"),
    PLASTICA("plastica"),
    ORTOPEDICA("ortopedica"),
    OFTAMOLOGICA("oftamologia");
    
    private final String Valor;

    private TipoCirugia(String Valor) {
        this.Valor = Valor;
    }

    public String getValor() {
        return Valor;
    }
    
     public static String[] obtenerCirugias(){
        TipoCirugia[] cirugias = TipoCirugia.values();
        String[] valores = new String[cirugias.length];
        
        for(int i = 0; i < cirugias.length; i++){
            valores[i] = cirugias[i].getValor();
        }
        return valores;
    }
    
}
