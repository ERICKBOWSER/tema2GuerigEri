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
public class Ej09 {
    public static void main(String[] args) {
        /*
        Programa que pida el precio de un artículo y calcule su valor aplicándole un 21% de IVA.
        */
        
        final int IVA = 121, PORCENTAJE = 100;
        double precio, ivaTotal;
        String texto;
        
        String producto = JOptionPane.showInputDialog("Introduce el precio del producto: ");
        precio = Double.parseDouble(producto);
        
        ivaTotal = precio * (double)IVA / PORCENTAJE;        
        
        texto = """
                El precio con IVA del articulo es: %.2f €
                """.formatted(ivaTotal);
        
        // **---------------- JOptionPane no admite especificadores de formato ----------------**
        JOptionPane.showMessageDialog(null, texto);
    }
}
