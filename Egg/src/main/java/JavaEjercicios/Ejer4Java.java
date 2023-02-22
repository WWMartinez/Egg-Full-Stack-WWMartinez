//Dada una cantidad de grados centígrados se debe mostrar su equivalente en grados
//Fahrenheit. La fórmula correspondiente es: F = 32 + (9 * C / 5).
package JavaEjercicios;

import java.util.Scanner;

public class Ejer4Java {

    public static void main(String[] args) {

        Scanner leer = new Scanner(System.in);

        System.out.println("Ingrese la cantidad de grados a convertir a Fahrenheit");

        float grados = leer.nextFloat();

        float fahre = 32 + (9 * grados / 5);

        System.out.println("Fahrenheit = " + fahre);

    }
}
