/*
Realizar un programa que simule el funcionamiento de un dispositivo RS232, este tipo de
dispositivo lee cadenas enviadas por el usuario. Las cadenas deben llegar con un formato
fijo: tienen que ser de un máximo de 5 caracteres de largo, el primer carácter tiene que ser
X y el último tiene que ser una O.
Las secuencias leídas que respeten el formato se consideran correctas, la secuencia
especial “&&&&&” marca el final de los envíos (llamémosla FDE), y toda secuencia distinta
de FDE, que no respete el formato se considera incorrecta.
Al finalizar el proceso, se imprime un informe indicando la cantidad de lecturas correctas e
incorrectas recibidas. Para resolver el ejercicio deberá investigar cómo se utilizan las
siguientes funciones de Java Substring(), Length(), equals().
 */
package JavaEjercicios;

import java.util.Scanner;

public class Ejer12Java {

    public static void main(String[] args) {

        Scanner leer = new Scanner(System.in);

        int corrc = 0, incorrc = 0;

        String cadena;

        System.out.println("Ingrese la cadena de 5 caracteres");
        System.out.println("El primero caracter tiene que ser una X y finalizar con una O...");
        System.out.println("Ingrese la linea de caracteres correspondiente: ");
        cadena = leer.nextLine();

        while (!cadena.equals("&&&&&")) {

            int longi = cadena.length();

            if (cadena.substring(0, 1).equalsIgnoreCase("x") && (cadena.endsWith("o")) && (longi <= 5)) {
                corrc++;
                System.out.println("");
                System.out.println("[Cadena correcta]");
            } else {
                incorrc++;
                System.out.println("");
                System.out.println("[Cadena incorrecta]");
            }
            System.out.println("");
            System.out.println("Ingrese la cadena de 5 caracteres");
            System.out.println("El primero caracter tiene que ser una X y finalizar con una O...");
            System.out.println("Ingrese la linea de caracteres correspondiente: ");
            cadena = leer.nextLine();
        }
        System.out.println("");
        System.out.println("Cadenas Correctas = " + corrc);
        System.out.println("-------------------------------------");
        System.out.println("Cadenas Incorrectas = " + incorrc);
    }
}
