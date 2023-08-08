/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package excepciones;

/**
 *
 * @author LENOVO
 */
public class MedicoNoEsCirujanoException extends RuntimeException {

    public MedicoNoEsCirujanoException() {
        super("El médico que desea buscar no es cirujano");
    }
    
    
}
