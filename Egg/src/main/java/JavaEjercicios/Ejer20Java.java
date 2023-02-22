/*
  Un cuadrado mágico 3 x 3 es una matriz 3 x 3 formada por números del 1 al 9 donde la
  suma de sus filas, sus columnas y sus diagonales son idénticas. Crear un programa que
  permita introducir un cuadrado por teclado y determine si este cuadrado es mágico o no.
  El programa deberá comprobar que los números introducidos son correctos, es decir,
  están entre el 1 y el 9.
 */
package JavaEjercicios;

public class Ejer20Java {

    public static void esMagico(int[][] m) {
        int sumaFila = 0;
        int sumaColumna = 0;
        int count = 0;

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                sumaFila += m[i][j];
                sumaColumna += m[j][i];
            }
            if (esIgual(sumaFila, sumaColumna)) {
                count++;
                if (count == 3) {
                    System.out.println("Es magico!!");
                    mostrar(m);
                } else {
                    sumaFila = 0;
                    sumaColumna = 0;
                }
            } else {
                System.out.println("No es magico...");
                mostrar(m);
                return;
            }
        }
    }

    private static boolean esIgual(int sumaFila, int sumaColumna) {
        return sumaFila == sumaColumna;
    }

    private static void mostrar(int[][] m) {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print("[" + m[i][j] + "]");
            }
            System.out.println();
        }
    }
}
