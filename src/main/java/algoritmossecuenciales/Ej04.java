/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package algoritmossecuenciales;

import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 *
 * @author erick
 */
public class Ej04 {
    public static void main(String[] args) {
        /*
        Uber establece un precio mínimo por servicio de 1,25€ fijos y además 8 céntimos 
        por Km recorrido. Elabora un programa que lea el número de km a recorrer y 
        proporcione el presupuesto.
        */
        
        final double KM = 0.08, precioMinimo = 1.25;
        double distancia, precioTotal;
        
        String a = JOptionPane.showInputDialog("Introduce los km a recorrer: ");
        distancia = Double.parseDouble(a);
                
        precioTotal = precioMinimo + (KM * distancia);
        
        JOptionPane.showMessageDialog(null, "El total por los kilometros recorridos es " + precioTotal + "€");
        
        
        
    }
}
