/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package operadoresaritmeticos;

/**
 *
 * @author ERICK
 */
public class Ej02 {
    public static void main(String[] args) {
        int a=1, b=2, c=3;
        double d=4.5, e=5.7, f=6.9;
        
        System.out.println("Variables tipo entero: " + a + ", " + b + ", " + c);
        
        System.out.println("Variables tipo double: " + d + ", " + e + ", " + f);
        
        //Asignación de valores entre variables
        b = c;
        c = a;
        a = b;
        
        System.out.println(b);
        System.out.println(c);
        System.out.println(a);
        
    }
}
