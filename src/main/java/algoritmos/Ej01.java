/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package algoritmos;

import java.util.Scanner;

/**
 *
 * @author ERICK
 */
public class Ej01 {
    public static void main(String[] args) {
        int grados;
        
        // Creación del objeto Scanner 
        Scanner teclado = new Scanner(System.in);
        
        /*
        Al pasarle los grados hay que colocarlo con coma, ya que si no da fallo al colocar punto
        */
        System.out.println("Introduce los grados centígrados: ");
        
        // Almacenamos la respuesta del usuario
        grados = teclado.nextInt();
        
        double fahrenheit = (1.8 * grados) + 32;
        
        System.out.println("Resultado de la conversión a grados Fahrenheit: " + fahrenheit);
        
        /*  Ejercicio 4
        En el proyecto Tema2+tunombre, crea una nueva clase llamada Ej04, dentro del paquete 
        operadoresrelacionales, que contenga una llamada al método public static void main(String[] args). 
        La aplicación Java contendrá comentarios descriptivos del código y realizará lo siguiente:
            a.- Declara e inicializa dos variables int (a=10,  b=20).
            b.- Declara cuatro variables booleanas.
            c.- Guarda, en las variables booleanas, el resultado de realizar las siguientes operaciones relacionales: a<b, a>b, a==b, a!=b.
            d.- Muestra en pantalla el resultado de las operaciones, usando las variables booleanas.
        */
        
    }
}
