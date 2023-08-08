/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package excepciones;

import java.time.LocalDate;

/**
 *
 * @author LENOVO
 */
public class MantenimientoQuirofanoException extends RuntimeException {

    public MantenimientoQuirofanoException(LocalDate fechaMantenimiento) {
        super("El quirofano se encuentra en mantenimiento, puede separarlo para desde del" + fechaMantenimiento);
    }
    
    
    
}
