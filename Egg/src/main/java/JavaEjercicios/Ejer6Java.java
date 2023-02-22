//Crear un programa que dado un numero determine si es par o impar
package JavaEjercicios;

import java.util.Scanner;

public class Ejer6Java {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);

        int num;

        System.out.println("Ingrese el número a evaluar:");
        num = leer.nextInt();

        if (num % 2 == 0) {
            System.out.println(num + " Es un número par.");
        } else {
            System.out.println(num + " No es un número par.");
        }
    }
}
