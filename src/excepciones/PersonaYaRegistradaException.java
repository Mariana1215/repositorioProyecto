/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package excepciones;

/**
 *
 * @author LENOVO
 */
public class PersonaYaRegistradaException extends RuntimeException{

    public PersonaYaRegistradaException() {
        super("la persona ya se encuentra registrado");
    }
    
    
}
