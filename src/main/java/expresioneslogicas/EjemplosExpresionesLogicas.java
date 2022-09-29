/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package expresioneslogicas;

import java.util.Scanner;

/**
 *
 * @author ERICK
 */
public class EjemplosExpresionesLogicas {
    public static void main(String[] args){

        /*
        Leer por teclado nombre y apellidos de una persona
        edad, peso y estatura

        Guardar en variables booleanas el resultado de evaluar las siguientes expresiones
        Usa equalsIgnoreCase de los Strings
        */
        String nombre, apellidos;
        int edad;
        double peso, estatura;

        // Objeto scanner para la llamada por teclado
        Scanner teclado = new Scanner(System.in);


        // EDAD
        // Mensaje por pantalla para solicitar la edad
        System.out.println("Introduce tu edad: ");

        // Almacenamiento del valor pasado por consola
        edad = teclado.nextInt();
        System.out.println("Su edad es " + edad);

        /*Limpiamos el buffer del contenido que ya tenía previamente en la anterior consulta*/
        teclado.nextLine();

        // PESO
        System.out.println("Introduce tu edad: ");

        peso = teclado.nextDouble();
        System.out.println("Su peso es " + peso);
        teclado.nextLine();

        // ESTATURA

        System.out.println("Introduce tu estatura: ");

        estatura = teclado.nextDouble();
        System.out.println("Su estatura es " + estatura);

        teclado.nextLine();


        // NOMBRE
        System.out.println("Introduce tu nombre: ");
        nombre = teclado.nextString();

        teclado.nextLine();

        System.out.println("Introduce tus apellidos: ");
        apellidos = teclado.nextString();

        System.out.println("Su nombre completo es " + nombre + " " + apellidos);
    
    }
}

































