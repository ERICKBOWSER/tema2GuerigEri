/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package algoritmossecuenciales;

import javax.swing.JOptionPane;

/**
 *
 * @author erick
 */
public class Ej05 {
    public static void main(String[] args) {
        /*
        Cada grupo de clase de un centro educativo tiene 30 horas de clase a la semana. 
        Calcula el número de profesores que se necesitan, teniendo en cuenta que un profesor 
        imparte un número de horas de clase a la semana, que se debe pedir al usuario, 
        junto con el número total de grupos que tiene el centro escolar.
        */
        
        int gruposTotal, horasImpartidas, numeroProfesores;
        final int HORASSEMANALES = 30;
        
        // Ventana de mensaje de las horas del profesor y grupo
        String horas = JOptionPane.showInputDialog("¿Cuantas horas imparten los profesores a la semana?");
        
        String grupos = JOptionPane.showInputDialog("¿Cuantos grupos tiene el centro?");
        
        // Almacenamos los datos y los convertimos en Int
        horasImpartidas = Integer.parseInt(horas);
        gruposTotal = Integer.parseInt(grupos);
        
        
        numeroProfesores = (gruposTotal * HORASSEMANALES) / horasImpartidas;
        
        JOptionPane.showMessageDialog(null, "Se necesitan " + numeroProfesores + " profesores");
    }
    
    
    
    
    
    
    
}
