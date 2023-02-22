/*
  Un cuadrado mágico 3 x 3 es una matriz 3 x 3 formada por números del 1 al 9 donde la
  suma de sus filas, sus columnas y sus diagonales son idénticas. Crear un programa que
  permita introducir un cuadrado por teclado y determine si este cuadrado es mágico o no.
  El programa deberá comprobar que los números introducidos son correctos, es decir,
  están entre el 1 y el 9.
 */
package JavaEjercicios;

import java.util.Scanner;

public class Ejer20MainJava extends Ejer20Java {

    public static void main(String[] args) {

        int[][] m = new int[3][3];
        int num;

        Scanner leer = new Scanner(System.in);

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {

                do {
                    System.out.println("Ingrese los valores para la matriz");
                    System.out.println("Los valores no deben ser mayor de 9 ni menor de 1...");
                    System.out.println("Fila: " + (i + 1));
                    num = leer.nextInt();
                } while (num < 1 || num > 9);

                m[i][j] = num;
            }
        }
        
        System.out.println();
        esMagico(m);
    
    }

}
