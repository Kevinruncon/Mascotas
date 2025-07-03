/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Parte_1;

/**
 *
 * @author Kevin
 */

    public class Gato extends Mascota {
// Constructor de la clase Gato que recibe el nombre como parámetro
    public Gato(String nombre) {
// Llamo al constructor de la clase padre (Mascota) para asignar el nombre
        super(nombre);
    }
// Método propio de la clase Gato para maullar
    public void maullar() {
        System.out.println(nombre + " dice: ¡Miau!");
    }
}



