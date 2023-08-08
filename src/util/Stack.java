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
public class Stack<T> implements Serializable {

    private Nodo<T> primero;
    int size;

    public Stack() {
        this.primero = null;
        this.size = 0;
    }

    public boolean isEmpty() {
        return primero == null;

    }

    private void push(T dato) {
        Nodo<T> nuevoNodo = new Nodo<>(dato);
        if (isEmpty()) {
            primero = nuevoNodo;

        }else{
            Nodo<T> aux = primero;
            while(aux.getNodoSiguiente() != null){
                aux = aux.getNodoSiguiente();
            }
            aux.setNodoSiguiente(primero);

        }
        size++;

    }
    private T pop(){
        if(isEmpty()){
            return null;
        }else{
            Nodo<T> aux = primero;
            int contador = 0;
            while(contador < size -1 && aux.getNodoSiguiente() != null){
                aux = aux.getNodoSiguiente();
            }
            T dato = aux.getDato();
            size--;
            return dato;
        }
        
    }
    public T peek(){
        if(isEmpty()){
            return null;
        }else{
            Nodo<T> aux = primero;
            int contador = 0;
            while(contador < size -1 && aux.getNodoSiguiente() != null){
                aux = aux.getNodoSiguiente();
                contador++;
            }
            T dato = aux.getDato();
            return dato;
        
    }
    }

}
