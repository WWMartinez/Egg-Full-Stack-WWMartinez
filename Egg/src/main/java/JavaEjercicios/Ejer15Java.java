//Realizar un algoritmo que rellene un vector con los 100 primeros números enteros y los
//muestre por pantalla en orden descendente.
package JavaEjercicios;

public class Ejer15Java {

    public static void main(String[] args) {

        int[] vector = new int[101];

        for (int i = 0; i < 100; i++) {
            vector[i] = i + 1;
        }

        System.out.println("Vector del 1 al 100 en orden descendente: ");

        for (int i = 99; i >= 0; i--) {
            System.out.println("[" + vector[i] + "]");
        }

        System.out.println("--------------------------");
        System.out.println("Finalizado...");
        System.out.println("--------------------------");
    }
}
