/*
 Escriba un programa que lea números enteros. Si el número es múltiplo de cinco debe
  detener la lectura y mostrar la cantidad de números leídos, la cantidad de números pares y
   la cantidad de números impares. Al igual que en el ejercicio anterior los números
    negativos no deben sumarse. Nota: recordar el uso de la sentencia break.
 */

package JavaExtraEjercicios;

import java.util.Scanner;

public class Ejer8ExtraJava {

    public static void main(String[] args) {

        Scanner leer = new Scanner(System.in);

        int n;
        int pares = 0;
        int impares = 0;
        
        do {
            System.out.println("Ingrese un número");
            n = leer.nextInt();

            if (n % 2 == 0) {
                pares++;
                System.out.println(n + " Es par");
            } else {
                impares++;
                System.out.println(n + " No es par");
            }
            
        } while (n != 100);

        System.out.println("Números pares: " + pares);
        System.out.println("Números impares: " + impares);

    }

}
