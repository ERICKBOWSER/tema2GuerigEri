/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package guerig;

import java.util.Scanner;

/**
 *
 * @author guerig
 */
public class Deporte {
    /* 
    Solicitar al usuario los minutos que está corriendo Forrest Gump 
    y el programa me tiene que decir la distancia recorrida suponiendo que corre a 8km/h
    */
    public static void main(String[] args){
        // Variables y constantes
        final int VELOCIDAD = 8; // km/h
        final double MINUTOS_HORA = 60.0;
        
        int minutosCorriendo;
        double distanciaRecorrida;

        /* Creación del objeto Scanner llamado teclado
            a partir de la entrada estándar del sistema
        */
        // new = constructor
        Scanner teclado = new Scanner(System.in);
        
        System.out.println("Introduce los minutos que está corriendo: ");
        // Usando teclado y el método nextInt vamos a leer un número entero
        // nextInt, para la ejecución del programa hasta que el usuario introduce datos
        minutosCorriendo = teclado.nextInt();
        
        System.out.println("Valor de minutosCOrriendo: " + minutosCorriendo);
        
        
        // Entrada de datos por teclado
        
        // Proceso
        distanciaRecorrida = (minutosCorriendo / MINUTOS_HORA) * VELOCIDAD;     
        
        // Mostrar resultados
        System.out.println("Ha recorrido " + distanciaRecorrida + "km");
    }
}















