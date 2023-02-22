/*
Realice un programa que compruebe si una matriz dada es anti simétrica. Se dice que una
matriz A es anti simétrica cuando ésta es igual a su propia traspuesta, pero cambiada de
signo. Es decir, A es anti simétrica si A = -AT. La matriz traspuesta de una matriz A se
denota por AT y se obtiene cambiando sus filas por columnas (o viceversa).
 */
package JavaEjercicios;

import java.util.Scanner;

public class Ejer19Java {

    public static void main(String[] args) {

        Scanner dato = new Scanner(System.in);

        //Inicializo el metodo boolean en false
        boolean teste = false;

        //Ingreso el tamaño de la matriz
        System.out.println("ingrese el tamaño de la matriz");
        int tam = dato.nextInt();

        //Creo la matriz
        int mat[][] = new int[tam][tam];
        int m[][] = new int[tam][tam];

        //Lleno con los valores ingresados la matriz
        System.out.println("ingrese los elementos de la matriz");
        for (int i = 0; i < tam; i++) {
            for (int j = 0; j < tam; j++) {
                System.out.println("Columna " + (i + 1) + "  fila " + (j + 1));
                mat[i][j] = dato.nextInt();
                m[i][j] = mat[i][j];
            }
        }

        System.out.println();

        //Muestro la matriz creada
        System.out.println("La matriz creada es:");
        for (int i = 0; i < tam; i++) {
            for (int j = 0; j < tam; j++) {
                System.out.print("[" + mat[i][j] + "] ");
            }
            System.out.println();
        }

        System.out.println();

        //Muestro la matriz transpuesta.
        System.out.println("La matriz transpuesta es:");

        for (int i = 0; i < tam; i++) {
            for (int j = 0; j < tam; j++) {
                mat[j][i] = mat[i][j];
                m[i][j] = -m[i][j];
                System.out.print("[" + m[i][j] + "] ");
            }
            System.out.println();
        }

        System.out.println();

        //Reviso si la matriz ingresada es anti simétrica
        for (int i = 0; i < tam; i++) {
            for (int j = 0; j < tam; j++) {
                if ((mat[j][i]) == (m[i][j])) {
                    teste = true;
                } else {
                    teste = false;
                }
            }
        }
        if (teste == true) {
            System.out.println("la matriz es antisimétrica");
        } else {
            System.out.println("la matriz no es antisimétrica");
        }
    }
}
