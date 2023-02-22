//Escribir un programa que lea un número entero por teclado y muestre por pantalla el
//doble, el triple y la raíz cuadrada de ese número. Nota: investigar la función Math.sqrt().
package JavaEjercicios;

import java.util.Scanner;

public class Ejer5Java {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);

        System.out.println("Ingrese el número entero...");

        int num = leer.nextInt();
        System.out.println("El número ingresado: " + num);
        int num2 = num * 2;
        System.out.println("El doble del número ingresado es: " + num2);
        int num3 = num * 3;
        System.out.println("El triple del número ingresado es: " + num3);
        double raiz = Math.sqrt(num);
        System.out.println("La raiz cuadrada del número ingresado es: " + raiz);
    }
}
