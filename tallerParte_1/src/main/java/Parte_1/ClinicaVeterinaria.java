/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Parte_1;

 public class ClinicaVeterinaria {
// Método para recibir una mascota, recibe como parámetro un objeto de tipo Mascota
    public void recibirMascota(Mascota m) {
        System.out.println("Recibiendo a: " + m.nombre);
// Llama al método saludar de la mascota (cada mascota puede saludar a su manera)
        m.saludar();
 // Verifica si la mascota es un Perro
        if (m instanceof Perro) {
// Si es un Perro, la convierto (cast) a Perro para poder llamar al método ladrar            
            ((Perro) m).ladrar();
 // Si no es Perro, verifica si es un Gato
        } else if (m instanceof Gato) {
// Si es un Gato, la convierto a Gato para poder llamar al método maullar
            ((Gato) m).maullar();
// Si no es ni Perro ni Gato imprime el siguiente mensaje
        } else {
            System.out.println("Tipo de mascota no reconocido.");
        }
    }
 }
