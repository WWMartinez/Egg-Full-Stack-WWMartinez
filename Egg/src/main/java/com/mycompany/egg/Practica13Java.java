package com.mycompany.egg;

import java.util.Scanner;

public class Practica13Java {

    public static void main(String[] args) {

        Scanner leer = new Scanner(System.in);

        int num1;
        int num2;
        int num3;
        int num4;

        System.out.println("Ingrese el valor del n°1 ");
        num1 = leer.nextInt();

        System.out.println("Ingrese el valor del n°2 ");
        num2 = leer.nextInt();

        System.out.println("Ingrese el valor del n°3 ");
        num3 = leer.nextInt();

        System.out.println("Ingrese el valor del n°4 ");
        num4 = leer.nextInt();

        System.out.print("N°1: ");
        for (int i = 0; i < num1; i++) {
            System.out.print("*");
        }
        
        System.out.println("");
        System.out.print("N°2: ");
        for (int i = 0; i < num2; i++) {
            System.out.print("*");
        }

        System.out.println("");
        System.out.print("N°3: ");
        for (int i = 0; i < num3; i++) {
            System.out.print("*");
        }

        System.out.println("");
        System.out.print("N°4: ");
        for (int i = 0; i < num4; i++) {
            System.out.print("*");
        }
    }
}
