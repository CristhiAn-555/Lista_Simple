/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package ec.edu.espoch.listasimple;

/**
 *
 * @author PERSONAL
 */
public class ListaSimple {

    public static void main(String[] args) {
         // a. Crear instancia de ListaEnlazada
        ListaEnlazada lista = new ListaEnlazada();

        // b. Llamar al método agregar()
        lista.agregar(10);
        lista.agregar(20);
        lista.agregar(30);
        lista.agregar(40);

        // c. Llamar al método mostrar()
        lista.mostrar();   
        // Salida: 10 -> 20 -> 30 -> 40 -> null
    }
}
