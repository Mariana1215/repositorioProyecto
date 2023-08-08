/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package util;

import java.io.Serializable;

/**
 *
 * @author LENOVO
 */
public class Queue<T> implements Serializable {

    private Nodo<T> nodoPrimero;
    int size;

    public Queue() {
        this.nodoPrimero = null;
        this.size = 0;
    }

    public void enQueue(T dato) {
        Nodo<T> nuevo = new Nodo<>(dato);

        if (nodoPrimero == null) {
            this.nodoPrimero = nuevo;

        } else {
            Nodo<T> aux = nodoPrimero;
            while (aux.getNodoSiguiente() != null) {
                aux = aux.getNodoSiguiente();
            }
            aux.setNodoSiguiente(nuevo);
        }
        size++;
    }
    
  public boolean isEmpty(){
      return nodoPrimero == null;
    
      
  }
  public T deQueue(){
      if(isEmpty()){
          throw new RuntimeException("No hay datos para eliminar");
      }
      T dato = nodoPrimero.getDato();
      this.nodoPrimero = nodoPrimero.getNodoSiguiente();
      size--;
      return dato;
          
      
  }
  public T peek(){
      if(isEmpty()){
          throw new RuntimeException("No hay datos en la cola");
      }
      return this.nodoPrimero.getDato();
  }
}
