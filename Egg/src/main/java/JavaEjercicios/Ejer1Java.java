//Escribir un programa que pida dos números enteros por teclado y calcule la suma de los
//dos. El programa deberá después mostrar el resultado de la suma

package JavaEjercicios;

import java.util.Scanner;

public class Ejer1Java {

    public static void main(String[] args) {
        
      Scanner leer = new Scanner(System.in);
      
      int num1;
      int num2;
      int tol;
      
        System.out.println("Ingrese el N°1");
        num1 = leer.nextInt();
        
        System.out.println("Ingrese el N°2");
        num2 = leer.nextInt();
        
        tol = num1 + num2;
        
        System.out.println("La suma de los valores es: " + tol);
        
    }
    
}
