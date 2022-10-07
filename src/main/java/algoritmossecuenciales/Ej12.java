/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package algoritmossecuenciales;

import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 *
 * @author ERICK
 */
public class Ej12 {
    public static void main(String[] args) {
        /*
        Una tienda ofrece un descuento del 25% sobre el total de la compra y un cliente
        desea saber cuánto deberá pagar finalmente por su compra.
        */
        
        double precio, pagarTotal, descuento = 75;
        final int PORCENTAJE = 100;
        String texto;
        
        Scanner teclado = new Scanner(System.in);
        System.out.println("Introduce el precio de tu compra: ");
        precio = teclado.nextDouble();
        
        pagarTotal = (precio * descuento) / PORCENTAJE;
        
        texto = """
                El total a pagar es %.2f€
                """.formatted(pagarTotal);
        
        JOptionPane.showMessageDialog(null, texto);
        
    }
}










