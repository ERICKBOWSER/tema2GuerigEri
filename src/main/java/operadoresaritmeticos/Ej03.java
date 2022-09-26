/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package operadoresaritmeticos;

/**
 *
 * @author ERICK
 */
public class Ej03 {
    public static void main(String[] args) {
        int a = 10, b = 5, i = 0;
        double c = 71.3, d = 4.8;
        
        int sumaAB = a + b;
        int restaAB = a - b;
        int multiplicacionAB = a * b;
        int divisionAB = a / b;
        double sumaDobleCD = c + d;
        double restaDobleCD = c - d;
        double multDobleCD = c * d;
        
        /*
        /// Si un tipo de dato cambia, todas las expresiones que esten dentro también cambian
        
        Si quiero decimales dividiendo dos int tengo que forzar que uno de los operadores sea double o float
        */
        double divisionDobleCD = c / (double)d;
        
        // Uso de Text blocks
        String bloqueDeTexto = """
                               Resultado de la suma de a y b: %d
                               Resultado de la resta de a y b : %d
                               Resultado de la multiplicación de a y b: %d
                               Resultado de división de a y b: %d
                               
                               Resultado de la suma doble de c y d: %f
                               Resultado de la resta doble de c y d: %f
                               Resultado de la multiplicación de c y d: %f
                               Resultado de la división de c y d: %f
                               
                               """.formatted(sumaAB, restaAB, multiplicacionAB, divisionAB, sumaDobleCD, restaDobleCD, multDobleCD, divisionDobleCD);
                         
        System.out.println(bloqueDeTexto);
        
        /*System.out.printf("Suma %.3f Resta %.4f Multiplicación %.2f División %.1f",
                sumaAB, restaAB, multiplicacionAB, divisionAB);*/
        
        
        int operacion1 = a*=3;
        int operacion2 = b-=1;
        int operacion3 = a/=b;
        double operacion4 = c+=d;
        
        /*
        El formato que se use con cada uno es muy importante
        Por ejemplo: si se usa un %d en una operación double da error ya que previamente la variable ya había sido definida como double
        */        
        String bloqueOperaciones = """
                                   Resultado de la primera operación: %d
                                   Resultado de la segunda operación: %d
                                   Resultado de la tercera operación: %d
                                   Resultado de la cuarta operación: %f
                                   """.formatted(operacion1, operacion2, operacion3, operacion4);
        
        System.out.println(bloqueOperaciones);
        
        /*
        El valor del incremento cambia cuando pasa a la siguiente linea de código
        i++ incrementa después 
        ++i incrementa antes
        */
        System.out.println("Valor de i: " + i);
        System.out.println("Valor de i++: " + (i++));
        System.out.println("Valor de ++i: " + (++i));
        
        // Módulo
        a = 11;
        b =  5;
        
        int cociente = a/b;
        int resto = a%b;
        System.out.println("Cociente " + cociente + " Resto " + resto);
        
        
        
        
        
        
    }
}



















