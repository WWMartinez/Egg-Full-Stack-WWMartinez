package com.mycompany.egg;

import java.util.Scanner;

public class Practica8Java {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);

        System.out.println("Ingresa tu edad");
        int edad = leer.nextInt();

        System.out.println("Ingresa tu nombre");
        String nombre = leer.next();
        System.out.println("");
        System.out.println("Su nombre es " + nombre);
        System.out.println("Usted tiene " + edad + " Años");
    }
}
