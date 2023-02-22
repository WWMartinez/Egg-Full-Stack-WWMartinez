//Escriba un programa que valide si una nota está entre 0 y 10, sino está entre 0 y 10 la nota se
//pedirá de nuevo hasta que la nota sea correcta.
package com.mycompany.egg;

import java.util.Scanner;

public class Practica11Java {

    public static void main(String[] args) {

        Scanner leer = new Scanner(System.in);
        int num1;

        System.out.println("Ingrese la nota");
        num1 = leer.nextInt();

        while (num1 <= 0 || num1 > 10) {
            System.out.println("Valor ingresado no valido.");
            System.out.println("Ingrese de nuevo la nota");
            num1 = leer.nextInt();
        }

        System.out.println("La nota ingresada es: " + num1);
    }
}
