/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package singleton;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import modelos.Atencion;
import modelos.Cita;
import modelos.PQRS;
import modelos.Persona;
import modelos.Quirofano;
import modelos.Separado;
import util.LSE;
import util.Queue;

/**
 *
 * @author LENOVO
 */
public class Singleton {
    
    private static final Singleton INSTANCIA = new Singleton();
    
    private LSE<Persona> personas;
    private LSE<Cita> citas;
    private LSE<Atencion> historialAtenciones;
    private LSE<Separado> separados;
    private Quirofano[][] quirofanos;
    private Queue<PQRS> colaPQRS;
    
    private Singleton(){
        personas = leerPersonas();
        citas = leerCitas();
        quirofanos = leerQuirofano();
        historialAtenciones = leerHistorialAtenciones();
        separados = leerQuirofanoSeparado();
        colaPQRS = leerPQRS();
    }

    public Queue<PQRS> getColaPQRS() {
        return colaPQRS;
    }
    

    public LSE<Separado> getSeparados() {
        return separados;
    }

    public LSE<Cita> getCitas() {
        return citas;
    }

    public Quirofano[][] getQuirofanos() {
        return quirofanos;
    }

    public static Singleton getINSTANCIA() {
        return INSTANCIA;
    }

    public LSE<Persona> getPersonas() {
        return personas;
    }

    public LSE<Atencion> getHistorialAtenciones() {
        return historialAtenciones;
    }
     
    public void escribirPersona(){
        try{
            FileOutputStream archivo = new FileOutputStream("personas.dat");
            ObjectOutputStream escritor = new ObjectOutputStream(archivo);
            escritor.writeObject(personas);
            
        }catch(IOException ex){
            ex.printStackTrace();
        }
    }
    
    public LSE<Persona> leerPersonas(){
        try{
            FileInputStream archivo = new FileInputStream("personas.dat");
            ObjectInputStream lector = new ObjectInputStream(archivo);
            return (LSE<Persona>) lector.readObject();
        }catch (IOException | ClassNotFoundException ex){
            ex.printStackTrace();
            return new LSE<>();
        }
    }
    
     public void escribirHistorial(){
        try{
            FileOutputStream archivo = new FileOutputStream("historial.dat");
            ObjectOutputStream escritor = new ObjectOutputStream(archivo);
            escritor.writeObject(historialAtenciones);
            
        }catch(IOException ex){
            ex.printStackTrace();
        }
    }
    
    public LSE<Atencion> leerHistorialAtenciones(){
        try{
            FileInputStream archivo = new FileInputStream("historial.dat");
            ObjectInputStream lector = new ObjectInputStream(archivo);
            return (LSE<Atencion>) lector.readObject();
        }catch (IOException | ClassNotFoundException ex){
            ex.printStackTrace();
            return new LSE<>();
        }
    }
    
    
    public void escribirQuirofano(){
        try{
            FileOutputStream archivo = new FileOutputStream("quirofanos.dat");
            ObjectOutputStream escritor = new ObjectOutputStream(archivo);
            escritor.writeObject(quirofanos);
        }catch(IOException ex){
            ex.printStackTrace();
        }
    }
    
    public Quirofano[][] leerQuirofano(){
        try{
            FileInputStream archivo = new FileInputStream("quirofanos.dat");
            ObjectInputStream lector = new ObjectInputStream(archivo);
            return(Quirofano[][]) lector.readObject();
        }catch(IOException | ClassNotFoundException ex){
            ex.printStackTrace();
            return new Quirofano[2][5];
        }
    }
    
     public void escribirCita(){
        try{
            FileOutputStream archivo = new FileOutputStream("citas.dat");
            ObjectOutputStream escritor = new ObjectOutputStream(archivo);
            escritor.writeObject(citas);
            
        }catch(IOException ex){
            ex.printStackTrace();
        }
    }
    
    public LSE<Cita> leerCitas(){
        try{
            FileInputStream archivo = new FileInputStream("citas.dat");
            ObjectInputStream lector = new ObjectInputStream(archivo);
            return (LSE<Cita>) lector.readObject();
        }catch (IOException | ClassNotFoundException ex){
            ex.printStackTrace();
            return new LSE<>();
        }
    }
    
    public void escribirQuirofanoSeparado(){
        try{
            FileOutputStream archivo = new FileOutputStream("separados.dat");
            ObjectOutputStream escritor = new ObjectOutputStream(archivo);
            escritor.writeObject(separados);
            
        }catch(IOException ex){
            ex.printStackTrace();
        }
    }
    
    public LSE<Separado> leerQuirofanoSeparado(){
        try{
            FileInputStream archivo = new FileInputStream("separados.dat");
            ObjectInputStream lector = new ObjectInputStream(archivo);
            return(LSE<Separado>)lector.readObject();
            
        }catch(IOException | ClassNotFoundException ex){
            ex.printStackTrace();
            return new LSE<>();
        }
    }
    
    public void escribirColaPqrs(){
        try{
            FileOutputStream archivo = new FileOutputStream("pqrs.dat");
            ObjectOutputStream escritor = new ObjectOutputStream(archivo);
            escritor.writeObject(colaPQRS);
        }catch(IOException ex){
            ex.printStackTrace();
        }
    }
    
    public Queue<PQRS> leerPQRS(){
        try{
            FileInputStream archivo = new FileInputStream("pqrs.dat");
            ObjectInputStream lector = new ObjectInputStream(archivo);
            return(Queue<PQRS>)lector.readObject();
            
        }catch(IOException | ClassNotFoundException ex){
            ex.printStackTrace();
            return new Queue<>();
        }
    }
}
