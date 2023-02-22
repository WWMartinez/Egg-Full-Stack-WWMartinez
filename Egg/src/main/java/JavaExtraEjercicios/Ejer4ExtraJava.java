/*
 Elaborar un algoritmo en el cuál se ingrese un número entre 1 y 10 y se muestre su
 equivalente en romano.
 */
package JavaExtraEjercicios;

import java.util.Scanner;

public class Ejer4ExtraJava {

    public static void main(String[] args) {
        
        int num;

        Scanner teclado = new Scanner(System.in);

        String unidad[] = {"", "I", "II", "III", "IV", "V", "VI", "VII", "VIII", "IX"};
        String decena[] = {"", "X", "XX", "XXX", "XL", "L", "LX", "LXX", "LXXX", "XC"};

        do {
            System.out.print("Ingresa numero entre 1 y 10 y te lo convierto a romanos: ");
            num = teclado.nextInt();
        } while (num < 1 || num > 10);

        int resto = num;

        int dece = resto / 10;
        resto = resto % 10;

        int unid = resto;

        if (num >= 10) {
            System.out.println(decena[dece] + unidad[unid]);
        } else {
            System.out.println(unidad[num]);
        }
    }
}
