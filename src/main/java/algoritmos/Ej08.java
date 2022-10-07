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
public class Ej08 {
    public static void main(String[] args) {
        /*
        En un hospital existen tres áreas: Ginecología, Pediatría y Traumatología. 
        El presupuesto anual del hospital se reparte de la siguiente forma: 
            Ginecología 40% 
            Traumatología 30% 
            Pediatría 30% 
        Obtener la cantidad de dinero que recibirá cada área, para cualquier cantidad de presupuesto.
        */
        
        double presupuestoAnual, ginecologiaTotal;
        final int GINECOLOGIA = 40, TRAUMATOLOGIA = 30, PEDIATRIA = 30;
        
        // Metodo para recoger los datos 
        Scanner teclado = new Scanner(System.in);
        System.out.println("Introduce el presupuesto anual del hospital: ");
        
        // Conversion y almacenamiento de los datos
        presupuestoAnual = teclado.nextDouble();
        
        ginecologiaTotal = (double)GINECOLOGIA * presupuestoAnual / 100;
        
        System.out.println("El presupuesto para el are de Ginecología es : " + ginecologiaTotal + "€");
        
        
        
        
    }
}
