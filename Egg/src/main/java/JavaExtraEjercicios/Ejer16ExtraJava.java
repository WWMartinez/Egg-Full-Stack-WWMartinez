/*
 Diseñe una función que pida el nombre y la edad de N personas e imprima los datos de
  las personas ingresadas por teclado e indique si son mayores o menores de edad.
   Después de cada persona, el programa debe preguntarle al usuario si quiere seguir
    mostrando personas y frenar cuando el usuario ingrese la palabra “No”.
 */
package JavaExtraEjercicios;

import java.util.Scanner;

public class Ejer16ExtraJava {

    public static void main(String[] args) {

        Scanner leer = new Scanner(System.in);

        System.out.println("Ingrese la cantidad de personas a registrar");
        int cant = leer.nextInt();

        for (int i = 1; i <= cant; i++) {
            System.out.println("Persona n° " + i);
            System.out.println("Ingrese su nombre: ");
            String nombre = leer.next();
            System.out.println(nombre + " Ingrese su edad: ");
            int edad = leer.nextInt();

            if (edad > 17) {
                System.out.println("Usted es mayor de edad...");
            } else {
                System.out.println("Usted es menor de edad...");
                System.out.println("Para ser mayor de edad necesita " + (18 - edad) + " años ...");
            }

        }

    }

}
