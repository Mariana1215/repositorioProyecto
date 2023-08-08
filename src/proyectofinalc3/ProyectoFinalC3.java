/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package proyectofinalc3;

import enums.Rol;
import modelos.Persona;
import singleton.Singleton;
import util.LSE;

/**
 *
 * @author LENOVO
 */
public class ProyectoFinalC3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        LSE<Persona> personas = Singleton.getINSTANCIA().getPersonas();
        
        Persona persona = new Persona("123", "Mariana", "1234", "1234", "admin2023", "2023", Rol.ADMINISTRADOR);
        
        personas.add(persona);
        
        Singleton.getINSTANCIA().escribirPersona();
    }
    
}
