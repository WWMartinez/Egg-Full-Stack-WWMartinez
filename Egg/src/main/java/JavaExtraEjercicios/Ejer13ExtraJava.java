/*
 Crear un programa que dibuje una escalera de números, donde cada línea de números
  comience en uno y termine en el número de la línea. Solicitar la altura de la escalera al
   usuario al comenzar. Ejemplo: si se ingresa el número 3:
                                                            1
                                                            12
                                                            123
 */
package JavaExtraEjercicios;

import java.util.Scanner;

public class Ejer13ExtraJava {

    public static void main(String[] args) {

        Scanner leer = new Scanner(System.in);

        while (true) {

            System.out.println("Ingrese el número que desea graficar: ");
            int n = leer.nextInt();

            if (n > 0) {
                System.out.println("Okey");

                for (int i = 1; i <= n; i++) {
                    System.out.println("");
                    for (int j = 1; j <= i; j++) {
                        System.out.print(j + " ");
                    }
                }

                for (int i = n - 1; i >= 1; i--) {
                    System.out.println("");
                    for (int j = 1; j <= i; j++) {
                        System.out.print(j + " ");
                    }
                }

                {
                    break;
                }

            } else {
                System.out.println("Valor ingresado no valido...");
                System.out.println("Intente de nuevo");
            }

        }
    }
}
