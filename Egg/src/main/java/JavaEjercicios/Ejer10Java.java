//Escriba un programa en el cual se ingrese un valor límite positivo, y a continuación solicite
//números al usuario hasta que la suma de los números introducidos supere el límite inicial.
package JavaEjercicios;

import java.util.Scanner;

public class Ejer10Java {

    public static void main(String[] args) {

        Scanner leer = new Scanner(System.in);
        int total = 0;

        System.out.println("Ingrese un valor positivo límite.");
        int numTope = leer.nextInt();

        do {
            System.out.println("Ingrese los números...");
            int suma = leer.nextInt();

            total = total + suma;
            System.out.println("Suma en total: " + total);

        } while (numTope > total);
        System.out.println();
        System.out.println("Finalizado!!");
        System.out.println("Alcanzo el numero limite con:" + " [" + total + "]");
    }
}
