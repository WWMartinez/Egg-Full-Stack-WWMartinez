//Implementar un programa que le pida dos números enteros a usuario y determine si ambos o
//alguno de ellos es mayor a 25.

package com.mycompany.egg;

import java.util.Scanner;

public class Practica9Java {

    public static void main(String[] args) {

        Scanner leer = new Scanner(System.in);

        System.out.println("Este MiniPrograma va a determinar si los 2 numeros ingresados son mayor a 25");

        System.out.println("Ingrese el 1er numero entero: ");
        int num1 = leer.nextInt();

        System.out.println("Ingrese el 2do numero entero: ");
        int num2 = leer.nextInt();

        if (num1 > 25 && num2 > 25) {
            System.out.println("Los valores ingresados son mayores a 25");
        } else {
            System.out.println("Los 2 valores ingresados son menor a 25");
        }
    }
}
