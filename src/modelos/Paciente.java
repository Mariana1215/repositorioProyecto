/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelos;

import enums.Rol;
import util.LSE;

/**
 *
 * @author LENOVO
 */
public class Paciente extends Persona {

    private final LSE<PQRS> peticiones;
    private final LSE<Atencion> historialconsultas;
    private final LSE<Cita> citas;
    private final LSE<Cirugia> cirugias;
    private String motivoConsulta;

    public Paciente(String cedula, String nombre, String direccion, String telefono, String usuario, String contrasenia) {
        super(cedula, nombre, direccion, telefono, usuario, contrasenia, Rol.PACIENTE);
        this.peticiones = new LSE<>();
        this.historialconsultas = new LSE<>();
        this.citas = new LSE<>();
        this.cirugias = new LSE<>();

    }

    public LSE<PQRS> getPeticiones() {
        return peticiones;
    }

    public LSE<Atencion> getHistorialconsultas() {
        return historialconsultas;
    }

    public LSE<Cita> getCitas() {
        return citas;
    }

    public String getMotivoConsulta() {
        return motivoConsulta;
    }

    public void agendarCita(Cita cita) {
        citas.add(cita);
    }

    public LSE<Cirugia> getCirugias() {
        return cirugias;
    }
    
    public void generarPQRS(PQRS pqrs){
        peticiones.add(pqrs);
    }

}
