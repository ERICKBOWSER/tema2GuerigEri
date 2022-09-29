/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package operadoresbooleanos;

/**
 *
 * @author ERICK
 */
public class Ej05 {
    public static void main(String[] args) {
        
        // Declaramos las variables
        boolean verdadero = true;
        boolean falso = true;
        
        String resultado = """
                           %b && %b
                           """.formatted(verdadero, verdadero);
        
        System.out.println(resultado);
        
    }
}















