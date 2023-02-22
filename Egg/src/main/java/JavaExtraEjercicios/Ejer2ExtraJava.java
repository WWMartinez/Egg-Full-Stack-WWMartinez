/*
 Declarar cuatro variables de tipo entero A, B, C y D y asignarle un valor diferente a cada
 una. A continuación, realizar las instrucciones necesarias para que: B tome el valor de C, C
 tome el valor de A, A tome el valor de D y D tome el valor de B. Mostrar los valores
 iniciales y los valores finales de cada variable. Utilizar sólo una variable auxiliar.
 */
package JavaExtraEjercicios;

public class Ejer2ExtraJava {

    public static void main(String[] args) {
       int a = 5;
       int b = 3;
       int c = 2;
       int d = 15;
       
        System.out.println("A = " + a);
        System.out.println("B = " + b);
        System.out.println("C = " + c);
        System.out.println("D = " + d);
        
        System.out.println();
        
       System.out.println("B = C: " + (b = c));

         System.out.println("C = A: " + (c = a));
    
           System.out.println("A = D: " + (a = d));
 
            System.out.println("D = B: " + (d = b));
    }
    
}
