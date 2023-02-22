//Escriba un programa que lea 20 números. Si el número leído es igual a cero se debe salir del
//bucle y mostrar el mensaje "Se capturó el numero cero". El programa deberá calcular y mostrar el
//resultado de la suma de los números leídos, pero si el número es negativo no debe sumarse.
//Nota: recordar el uso de la sentencia break.
package com.mycompany.egg;

import java.util.Scanner;

public class Practica12Java {

    public static void main(String[] args) {

        Scanner leer = new Scanner(System.in);

        int num;
        int total = 0;
        int cont = 0;

        do {
            System.out.println("Ingrese valores hasta llegar al valor n°20");
            num = leer.nextInt();
            if (num >= 0) {
                total = num + total;
                cont = cont + 1;
            } else {
                System.out.println("Los valores negativos no cuentan");
            }

        } while (cont != 20 && num != 0);

        if (cont == 20) {
            System.out.println("La suma de todos los valores ingresados es " + total);
        }

        if (num == 0) {
            System.out.println("Se capturó el numero cero.");
            System.out.println("La suma de todos los valores ingresados es " + total);

        }
    }
}
