/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.espoch.listasimple;

/**
 *
 * @author PERSONAL
 */
public class ListaEnlazada {

    private Nodo cabeza;

    public ListaEnlazada() {
        this.cabeza = null;
    }

    public boolean agregar(int dato) {

        Nodo nuevoNodo = new Nodo(dato);
        
        if (cabeza == null) {
            cabeza = nuevoNodo;

        } else {
            Nodo aux = cabeza;
            
            //Nodo nuevoNodo =siguiente;

            while (aux.siguiente != null) {
                aux = aux.siguiente;

            }
            aux.siguiente = nuevoNodo;
        }
        return false;
    }

    public void mostrar() {
        Nodo actual = cabeza;

        while (actual != null) {
            System.out.print(actual.dato + " -> ");
            actual = actual.siguiente;
        }
        System.out.println("null");

    }

}
