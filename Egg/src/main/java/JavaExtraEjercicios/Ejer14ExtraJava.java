/*
  Se dispone de un conjunto de N familias, cada una de las cuales tiene una M cantidad de
   hijos. Escriba un programa que pida la cantidad de familias y para cada familia la cantidad
    de hijos para averiguar la media de edad de los hijos de todas las familias.
 */
package JavaExtraEjercicios;

import java.util.Scanner;

public class Ejer14ExtraJava {

    public static void main(String[] args) {

        Scanner leer = new Scanner(System.in);

        System.out.println("Ingrese el conjunto total de familias: ");
        int cant = leer.nextInt();

        for (int i = 1; i <= cant; i++) {
            System.out.println("Ingrese la cantidad de hijos que tiene");
            int hijos = leer.nextInt();
            for (int j = 1; j <= hijos; j++) {
                int resul = cant % hijos;

                System.out.println("Media " + resul);
            }
        }
    }

}
