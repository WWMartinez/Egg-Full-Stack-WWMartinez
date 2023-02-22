//Define una variable de tipo boolean, double y char. Guarda información en ellas a través del
//Scanner.
package com.mycompany.egg;

import java.util.Scanner;

public class Practica7Java {

    public static void main(String[] args) {

        Scanner leer = new Scanner(System.in);

        System.out.println("Introduce verdadero o falso: ");
        boolean logic = leer.nextBoolean();
        System.out.println("Ingreso " + logic);

        System.out.println("Introduce un numero de tipo de dato double: ");
        double num1 = leer.nextFloat();
        System.out.println("Ingreso " + num1);

        char caracter;
        System.out.println("Introduce el carácter: ");
        caracter = leer.next().charAt(0);
        System.out.println("Carácter ingresado = " + caracter);
    }
}
