/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package operadoresaritmeticos;

import java.util.Scanner;

/**
 *
 * @author ERICK
 */
public class Ej14 {
    public static void main(String[] args) {
        /*
        Crea una nueva clase llamada Ej14, que contenga una llamada al método public static void main(String[] args). 
        El programa tendrá una variable entera tiempo inicializada con un valor leído por teclado, en segundos, y queremos conocer este tiempo pero expresado en 
        horas, minutos y segundos, mostrando los resultados por pantalla.
        */
        int tiempo, hora, minutos, segundos, minutosResultado;
        
        // Constante
        final int DIVISOR = 60;
        
        
        // Objeto Scanner para la entrada de datos
        Scanner teclado = new Scanner(System.in);
        
        System.out.println("Introduce un tiempo en segundos: ");
        
        tiempo = teclado.nextInt();
        
        segundos = tiempo % DIVISOR;
        minutos = tiempo / DIVISOR;
        minutosResultado = minutos % DIVISOR;
        hora = minutos / DIVISOR;
        
        System.out.println("El tiempo es: " + hora + " hrs " + minutosResultado + " min " + segundos + " sec");
        
    }
}
