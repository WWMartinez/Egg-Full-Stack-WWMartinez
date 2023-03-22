/*
    Definir una Clase que contenga algún tipo de dato de tipo array y agregue el código para
    generar y capturar una excepción ArrayIndexOutOfBoundsException (índice de arreglo fuera
    de rango).
 */
package Entity;

import java.util.Arrays;
import java.util.Locale;
import java.util.Scanner;

public class Arreglo {

    private String[] name;

    public Arreglo() {
    }

    public Arreglo(String[] nombres) {
        this.name = nombres;
    }

    public String[] getNombres() {
        return name;
    }

    public void setNombres(String[] nombres) {
        this.name = nombres;
    }

    public void llenarNombres() throws ArrayIndexOutOfBoundsException {
        Scanner leer = new Scanner(System.in).useDelimiter("\n").useLocale(Locale.US);
        String[] name = new String[3];
        for (int i = 0; i < 4; i++) {
            System.out.print("Ingrese un nombre: ");
            name[i] = leer.next();
        }
        this.setNombres(name);
    }

    @Override
    public String toString() {
        return "Arreglo{" + "nombres=" + Arrays.toString(name) + '}';
    }
}
