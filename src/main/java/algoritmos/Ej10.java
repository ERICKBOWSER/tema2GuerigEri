/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package algoritmos;

import javax.swing.JOptionPane;

/**
 *
 * @author ERICK
 */
public class Ej10 {
    public static void main(String[] args) {
        
        /*
        Una empresa constructora se dedica a realizar bloques de pisos en parcelas como las 
        que figuran en la imagen de la derecha. Necesitan saber el área de la parcela según 
        las medidas A, B y C. Realiza el ejercicio usando JOption para solicitar y mostrar datos 
        al usuario.
        */
        
        int ladoA, ladoB, ladoC, area;
        
        String lA = JOptionPane.showInputDialog("Escribe el lado A: ");
        String lB = JOptionPane.showInputDialog("Escribe el lado B: ");
        String lC = JOptionPane.showInputDialog("Escribe el lado C: ");
        
        ladoA = Integer.parseInt(lA);
        ladoB = Integer.parseInt(lB);
        ladoC = Integer.parseInt(lC);
        
        area = (((ladoA-ladoC)*ladoB)/2) + (ladoB+ladoC);
        
        JOptionPane.showMessageDialog(null, "El area es: " + area);
    }
}
