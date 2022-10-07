/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package algoritmossecuenciales;

import javax.swing.JOptionPane;

/**
 *
 * @author ERICK
 */
public class Ej07 {
    public static void main(String[] args) {
        //Realiza un conversor de euros a dólares.
        final double CAMBIODOLAR = 0.98;
        double dolar, conversionTotal;
        
        // Ventana para recoger los datos, el String no tiene que estar definido
        String cantidad = JOptionPane.showInputDialog("Introduce la cantidad a convertir: ");
        dolar = Double.parseDouble(cantidad);
        
        conversionTotal = dolar / CAMBIODOLAR;
        
        JOptionPane.showMessageDialog(null, "La conversión de " + dolar + "$ a euros son " + conversionTotal + "€");
    }
}












