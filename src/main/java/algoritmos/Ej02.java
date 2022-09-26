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
public class Ej02 {
    public static void main(String[] args) {
        final double PI = 3.1416;
        double radio;
        double resultadoLongitud, resultadoArea, resultadoVolumen;
        
        /*
        Algoritmo que lea por teclado el valor del radio de una circunferencia y calcule la longitud, 
        el área de la circunferencia y el volumen de una esfera con ese radio.
        */
        
        // Calcular la longitud
        Scanner teclado = new Scanner(System.in);
     
        System.out.println("Introduce el radio de la circunferencia: ");
        
        radio = teclado.nextDouble();
        
        resultadoLongitud = 2 * (PI) * (radio);
        
        System.out.println("La longitud de la circunferencia es: " + resultadoLongitud);
        
        // Calcular el area
        resultadoArea = (resultadoLongitud * radio) / 2;
        System.out.println("El area de la circunferencia es: " + resultadoArea);
        
        // Calcular el volumen
        double multiplicadorVolumen = 4/3;
        double radioVolumen = Math.pow(radio, 3);
        
        double resultado = (4/3) * PI * radioVolumen;
        
        System.out.println("Volumen de la esfera es: " + resultado);
        
    }
}
