/*
Realice un programa que calcule y visualice el valor máximo, el valor mínimo y el promedio
de n números (n>0). El valor de n se solicitará al principio del programa y los números
serán introducidos por el usuario. Realice dos versiones del programa, una usando el
bucle “while” y otra con el bucle “do - while”.
 */
package JavaExtraEjercicios;

import java.util.Scanner;

public class Ejer7ExtraJava {

    public static void main(String[] args) {
        int valorMax = 0, valorMin = 0, promedio = 0, m, suma = 0, n, i = 0;

        Scanner leer = new Scanner(System.in);

        System.out.println("Ingrese la cantidad de números que desea tipear...");
        n = leer.nextInt();

        System.out.println();
        System.out.println("Que tipo de operacion desea realizar?");
        System.out.println("Escriba el nombre de la operacion");
        System.out.println("While");
        System.out.println("-----o-----");
        System.out.println("Do while");
        String pregunta = leer.next().toLowerCase();

        System.out.println(pregunta);

        switch (pregunta) {
            case "while" -> {
                while (i < n) {
                    System.out.println("Ingrese un numero");
                    m = leer.nextInt();
                    if (i == 0) {
                        valorMin = m;
                    }
                    if (m > valorMax) {
                        valorMax = m;
                    } else if (m < valorMin) {
                        valorMin = m;
                    }

                    i++;
                    suma += m;
                    promedio = suma / n;
                }

                System.out.println("El valor maximo es : " + valorMax);
                System.out.println("El valor minimo es : " + valorMin);
                System.out.println("El promedio de los numeros ingresados es de : " + promedio);
            }

            case "dowhile" -> {
                do {
                    System.out.println("ingrese un numero a verificar");
                    m = leer.nextInt();
                    if (i == 0) {
                        valorMin = m;
                    }
                    if (m > valorMax) {
                        valorMax = m;
                    } else if (m < valorMin) {
                        valorMin = m;
                    }
                    i++;
                    suma += m;
                    promedio = suma / n;

                } while (i < n);
                System.out.println("El valor maximo es : " + valorMax);
                System.out.println("El valor minimo es : " + valorMin);
                System.out.println("El promedio de los numeros ingresados es de : " + promedio);
            }
        }

    }
}
