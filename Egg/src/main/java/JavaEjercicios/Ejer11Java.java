package JavaEjercicios;

import java.util.Scanner;

public class Ejer11Java {

    public static void main(String[] args) {

        Scanner leer = new Scanner(System.in);
        int num1, num2, resul, opc;
        boolean tf = true;
        String respu;

        while (tf == true) {

            System.out.println("Menu");
            System.out.println("1.- Sumar");
            System.out.println("2.- Resta");
            System.out.println("3.- multiplicar");
            System.out.println("4.- dividir");
            System.out.println("5.- Salir");
            System.out.println("Seleccione una opcion: ");

            opc = leer.nextInt();

            switch (opc) {
                case 1:
                    System.out.println("Ingrese el 1er Valor");
                    num1 = leer.nextInt();
                    System.out.println("Ingrese el 2do Valor");
                    num2 = leer.nextInt();
                    resul = num1 + num2;
                    System.out.println("");
                    System.out.println("La suma es: " + resul);
                    System.out.println("");
                    break;
                case 2:
                    System.out.println("Ingrese el 1er Valor");
                    num1 = leer.nextInt();
                    System.out.println("Ingrese el 2do Valor");
                    num2 = leer.nextInt();
                    resul = num1 - num2;
                    System.out.println("");
                    System.out.println("La resta es: " + resul);
                    System.out.println("");
                    break;
                case 3:
                    System.out.println("Ingrese el 1er Valor");
                    num1 = leer.nextInt();
                    System.out.println("Ingrese el 2do Valor");
                    num2 = leer.nextInt();
                    resul = num1 * num2;
                    System.out.println("");
                    System.out.println("La multiplicacion es: " + resul);
                    System.out.println("");
                    break;
                case 4:
                    System.out.println("Ingrese el 1er Valor");
                    num1 = leer.nextInt();
                    System.out.println("Ingrese el 2do Valor");
                    num2 = leer.nextInt();
                    resul = num1 / num2;
                    System.out.println("");
                    System.out.println("La division es: " + resul);
                    System.out.println("");
                    break;
                case 5:

                    tf = false;
                    break;

                default:
                    System.out.println("Opcion no valida.....");
                    System.out.println("");
            }

            if (tf == false) {
                System.out.println("¿Seguro que desea salir?");
                System.out.println("S/N");
                respu = leer.next().toLowerCase();
                if ("s".equals(respu)) {
                    System.out.println("Saliendo del programa.");
                    tf = false;
                } else if ("n".equals(respu)) {
                    tf = true;
                }
            }
        }
    }
}
