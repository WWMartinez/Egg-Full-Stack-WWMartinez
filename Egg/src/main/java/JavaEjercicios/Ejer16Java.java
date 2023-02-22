/*
Realizar un algoritmo que rellene un vector de tamaño N con valores aleatorios y le pida al
usuario un numero a buscar en el vector. El programa mostrará donde se encuentra el
numero y si se encuentra repetido
 */
package JavaEjercicios;

import java.util.Random;
import java.util.Scanner;

public class Ejer16Java {

    public static void main(String[] args) {

        Scanner leer = new Scanner(System.in);
        Random aleatorio = new Random();

        System.out.println("Ingrese de que tamaño desea que sea el Vector...");
        int n = leer.nextInt();

        int[] vector = new int[n];

        for (int i = 0; i < n; i++) {
            vector[i] = aleatorio.nextInt(1, 100);
            System.out.print("[" + vector[i] + "] ");
        }

        System.out.println("");
        System.out.println("Ingrese la posicion que desea encontrar...");
        n = leer.nextInt();

        int pos = -1;
        int cont = 0;
        for (int i = 0; i < vector.length; i++) {
            if (vector[i] == n) {
                pos = i;
                cont++;
                System.out.println("-----------------------------------------------------");
                System.out.println("La posición del número" + " [" + n + "] " + "es la: " + (pos+1));
                System.out.println("Total de veces que se encontro ese número es: " + cont);
                System.out.println("-----------------------------------------------------");
            } 
        }
        if (pos == -1) {
            System.out.println("No se encontró el número...");
        }
    }
}
