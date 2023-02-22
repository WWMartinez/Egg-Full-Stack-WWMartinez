//Escribir un programa que pida tu nombre, lo guarde en una variable y lo muestre por
//pantalla.

package JavaEjercicios;

import java.util.Scanner;

public class Ejer2Java {

    public static void main(String[] args) {
        
        Scanner leer = new Scanner(System.in);
        
        String var1;
        
        System.out.println("Ingrese la frase que quiere guardar en la variable.");
        var1 = leer.nextLine();
        
        System.out.println("La frase que guardo es: " + var1);
        
    }
    
}
