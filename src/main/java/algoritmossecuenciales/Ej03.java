/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package algoritmossecuenciales;

import java.util.Scanner;

/**
 *
 * @author ERICK
 */
public class Ej03 {
    public static void main(String[] args) {
        //Algoritmo que lea tres notas numéricas de tipo float y calcule la nota media.
        float nota1, nota2, nota3, resultado;
        final int DIVISOR = 3;

        // Objeto scanner para la llamada por teclado
        Scanner teclado = new Scanner(System.in);
        
        System.out.println("Introduce la primera nota: ");
        nota1 = teclado.nextFloat();
        
        System.out.println("Introduce la segunda nota: ");
        nota2 = teclado.nextFloat();
        
        System.out.println("Introduce la tercera nota: ");
        nota3 = teclado.nextFloat();
        
        resultado = (nota1 + nota2 + nota3) / DIVISOR;
        System.out.println("El promedio es: " + resultado);
        
    }
}
