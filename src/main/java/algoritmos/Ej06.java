/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package algoritmos;

import java.util.Scanner;

/**
 *
 * @author erick
 */
public class Ej06 {
    public static void main(String[] args) {
        /*
        Tres personas deciden invertir su dinero para formar una empresa. 
        Cada una de ellas invierte una cantidad distinta, que debes solicitar al usuario 
        por teclado. Implementa un algoritmo que imprima el porcentaje que invierte cada 
        uno con respecto al total de la inversión.
        */
        
        double persona1, persona2, persona3, persona1Total, persona2Total, persona3Total;

        Scanner teclado =  new Scanner(System.in);
        System.out.println("Introduce la cantidad a invertir: ");
        persona1 =  teclado.nextDouble();
        
        System.out.println("Introduce la cantidad a invertir: ");
        persona2 =  teclado.nextDouble();
        
        System.out.println("Introduce la cantidad a invertir: ");
        persona3 =  teclado.nextDouble();
        
        persona1Total = persona1 + persona2 + persona3;
        
        
    }
    
}
