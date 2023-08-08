/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package excepciones;

/**
 *
 * @author LENOVO
 */
public class LimiteDeCitasException extends RuntimeException {

    public LimiteDeCitasException() {
        super("Límite de citas excedido, solo puede tener 2 citas activas");
    }
    
    
    
}
