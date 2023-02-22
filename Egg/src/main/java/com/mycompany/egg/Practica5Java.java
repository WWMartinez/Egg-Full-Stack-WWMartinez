//Define variables donde puedas alojar los resultados y prueba usar dos operadores de cada tipo.
package com.mycompany.egg;

public class Practica5Java {

    public static void main(String[] args) {
        int var1 = 4;
        System.out.println("La variable 1 es: " + var1);
        int var2 = 5;
        System.out.println("La variable 2 es: " + var2);
        int var3 = 7;
        System.out.println("La variable 3 es: " + var3);
        int var4 = 4;
        System.out.println("La variable 4 es: " + var4);
        int var5 = 2;
        System.out.println("La variable 5 es: " + var5);
        System.out.println();

        int resulSuma = var1 + var3;
        System.out.println("La suma de las variables 1 y 3 es: " + resulSuma);
        int resulResta = var2 - var3;
        System.out.println("La resta de las variables 2 y 3 es: " + resulResta);
        int resulMulti = var2 * var1;
        System.out.println("El resultado de la multiplicacion de las variables 2 y 1 es :" + resulMulti);
        double resulDiv = var5 / var1;
        System.out.println("El resultado de la division de las variables 5 y 1 es: " + resulDiv);
        boolean logico = var1 == var4;
        System.out.println("El la variable 1 y la variable 4 Iguales? " + logico);
    }
}
