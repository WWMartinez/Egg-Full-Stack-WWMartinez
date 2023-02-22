/*
 Dadas dos matrices cuadradas de números enteros, la matriz M de 10x10 y la matriz P de
 3x3, se solicita escribir un programa en el cual se compruebe si la matriz P está contenida
 dentro de la matriz M. Para ello se debe verificar si entre todas las submatrices de 3x3 que
 se pueden formar en la matriz M, desplazándose por filas o columnas, existe al menos una
 que coincida con la matriz P. En ese caso, el programa debe indicar la fila y la columna de
 la matriz M en la cual empieza el primer elemento de la submatriz P.
 */
package JavaEjercicios;

import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;

public class Ejer21Java {

    public static class Matrix {

        public final int szx;
        public final int szy;
        private final List<Integer> data;

        public Matrix(int szx, int szy, List<Integer> data) {
            this.szx = szx;
            this.szy = szy;
            this.data = data;
        }

        /* Obtener valor en x, y */
        public int at(int x, int y) {
            assert (x < szx);// comprobar estamos dentro del los límites
            assert (y < szy);
            return data.get(x + y * szx);
        }

        /* Comprobar si la submatriz con origen en ox, oy y de tamaño om.szx_, om.szy_ es igual a om */
        public boolean sub_eq(int ox, int oy, Matrix om) {
            assert (ox + om.szx < szx); // comprobar la matriz cabe en las coordenadas indicadas
            assert (oy + om.szy < szy);
            for (int y = 0; y < om.szy; ++y) {
                for (int x = 0; x < om.szx; ++x) {
                    if (om.at(x, y) != at(ox + x, oy + y)) {
                        return false;
                    }
                }
            }
            return true;
        }
    }

    public static class FindInMatrixResult {

        public final int x;
        public final int y;

        public FindInMatrixResult(int x, int y) {
            this.x = x;
            this.y = y;
        }
    }

    public static List<FindInMatrixResult> findInMatrix(Matrix big, Matrix small) {
        assert (big.szx >= small.szx); // comprobar small cabe en big
        assert (big.szy >= small.szy);

        List<FindInMatrixResult> ret = new ArrayList<>(); // coleccion de resultados

        for (int y = 0; y < big.szy - small.szy; ++y) { // comprobar todas las submatrices posibles
            for (int x = 0; x < big.szx - small.szx; ++x) {
                if (big.sub_eq(x, y, small)) {
                    ret.add(new FindInMatrixResult(x, y));
                }
            }
        }
        return ret;
    }

    public static void main(String args[]) {
        Matrix big = new Matrix(10, 10, Arrays.asList(
                1, 26, 36, 47, 5, 6, 72, 81, 95, 10,
                11, 12, 13, 21, 41, 22, 67, 20, 10, 61,
                56, 78, 87, 90, 9, 90, 17, 12, 87, 67,
                41, 87, 24, 56, 97, 74, 87, 42, 64, 35,
                32, 76, 79, 1, 36, 5, 67, 96, 12, 11,
                99, 13, 54, 88, 89, 90, 75, 12, 41, 76,
                67, 78, 87, 45, 14, 22, 26, 42, 56, 78,
                98, 45, 34, 23, 32, 56, 74, 16, 19, 18,
                24, 67, 97, 46, 87, 13, 67, 89, 93, 24,
                21, 68, 78, 98, 90, 67, 12, 41, 65, 12));

        Matrix small = new Matrix(3, 3, Arrays.asList(
                                  36, 5, 67,
                                  89, 90, 75,
                                  14, 22, 26));

        for (FindInMatrixResult r : findInMatrix(big, small)) {
            System.out.println("Matriz encontrada en " + r.x + ", " + r.y);
        }
    }
}

