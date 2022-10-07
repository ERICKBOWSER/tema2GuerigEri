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
        
        double presupuestoAnual, ginecologiaTotal, traumatologiaTotal, pediatriaTotal;
        final int GINECOLOGIA = 40, TRAUMATOLOGIA = 30, PEDIATRIA = 30;
        
        // Metodo para recoger los datos 
        Scanner teclado = new Scanner(System.in);
        System.out.println("Introduce el presupuesto anual del hospital: ");
        
        // Conversion y almacenamiento de los datos
        presupuestoAnual = teclado.nextDouble();
        
        // Cálculo del total 
        ginecologiaTotal = (double)GINECOLOGIA * presupuestoAnual / 100;
        traumatologiaTotal = (double)TRAUMATOLOGIA * presupuestoAnual / 100;
        pediatriaTotal = (double)PEDIATRIA * presupuestoAnual / 100;
        
        String bloqueDeTexto = """
                               El presupuesto actual es %f€
                               Presupuesto destinado a cada area:
                                Ginecología = %f€
                                Traumatología = %f€
                                Pediatria = %f€
                               """.formatted(presupuestoAnual, ginecologiaTotal, 
                                       traumatologiaTotal, pediatriaTotal);
        
        System.out.println(bloqueDeTexto);
        
        
    }
}
