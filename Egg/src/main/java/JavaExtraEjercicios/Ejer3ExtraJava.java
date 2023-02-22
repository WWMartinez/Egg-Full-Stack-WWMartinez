/*
 Elaborar un algoritmo en el cuál se ingrese una letra y se detecte si se trata de una vocal.
 Caso contrario mostrar un mensaje. Nota: investigar la función equals() de la clase String.
 */
package JavaExtraEjercicios;

import java.util.Scanner;

public class Ejer3ExtraJava {

    public static void main(String[] args) {
        
        Scanner leer = new Scanner(System.in);
        
        System.out.println("Ingrese la letra");
        String letra = leer.nextLine().toLowerCase();
        
        System.out.println("La letra ingresada fue: " + letra);
        
        if ("a".equals(letra) || "e".equals(letra) || "i".equals(letra) || "o".equals(letra) || "u".equals(letra)) {
            System.out.println(letra + " Es vocal");
        } else {
            System.out.println(letra + " No es una vocal");
        }
    }
}
