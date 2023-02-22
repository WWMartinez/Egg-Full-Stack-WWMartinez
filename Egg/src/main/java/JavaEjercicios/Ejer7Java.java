/*
Crear un programa que pida una frase y si esa frase es igual a “eureka” el programa
pondrá un mensaje de Correcto, sino mostrará un mensaje de Incorrecto. Nota: investigar
la función equals() en Java.
 */
package JavaEjercicios;

import java.util.Scanner;

public class Ejer7Java {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        String frase;

        do {
            System.out.println("Trate de adivinar la frase");
            frase = leer.next().toLowerCase();
        } while (!"eureka".equals(frase));
        System.out.println("CORRECTO!");
    }

}
