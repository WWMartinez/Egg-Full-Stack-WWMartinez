/*
 Realizar un programa que rellene un matriz de 4 x 4 de valores aleatorios y muestre la
  traspuesta de la matriz. La matriz traspuesta de una matriz A se denota por B y se obtiene
   cambiando sus filas por columnas (o viceversa).
 */
package JavaEjercicios;

import java.util.Random;

public class Ejer18Java {

    public static void main(String[] args) {

        Random ale = new Random();

        //Crear matriz
        int[][] matriz = new int[4][4];

        //Llenar matriz
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz.length; j++) {
                matriz[i][j] = ale.nextInt(0, 100);
            }
        }

        //Imprimir matriz
        System.out.println("Imprimiendo Matriz de 4x4");
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz.length; j++) {
                System.out.print("[" + matriz[i][j] + "] ");
            }
            System.out.println();
        }
        System.out.println();

        //Transponiendo la matriz
        //Imprimir matriz transpuesta
        System.out.println("La matriz transpuesta es:");
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz.length; j++) {
                System.out.print("[" + matriz[j][i] + "] ");
            }
            System.out.println();
        }
        System.out.println();
        System.out.println("Programa finalizado...");
    }

}
