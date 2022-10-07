/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package algoritmos;

import static java.lang.Math.sqrt;
import javax.swing.JOptionPane;

/**
 *
 * @author ERICK
 */
public class Ej11 {
    public static void main(String[] args) {
        /*
        Se requiere obtener el área de la figura, a partir de R y H. 
        Realiza un algoritmo para resolver el problema.        
        */
        
        double r, h, areaCirculo, areaTriangulo, areaFigura;
        String texto;
        
        // Recoger datos
        String valorR = JOptionPane.showInputDialog("Escribe el valor de R: ");
        String valorH = JOptionPane.showInputDialog("Escribe el valor de H: ");
        
        // Almacenar datos
        r = Double.parseDouble(valorR);
        h = Double.parseDouble(valorH);
        
        // Area del circulo
        areaCirculo = Math.pow(r, 2) * Math.PI / 2;
        
        // Area del triangulo
        areaTriangulo = sqrt(Math.pow(h, 2) - Math.pow(r, 2));
        
        // Area de la figura
        areaFigura = areaCirculo + areaTriangulo;
        
        texto = """
                El area de la figura es: %.2f
                """.formatted(areaFigura);
        
        // Resultado
        JOptionPane.showMessageDialog(null,texto);
        
    }
}
