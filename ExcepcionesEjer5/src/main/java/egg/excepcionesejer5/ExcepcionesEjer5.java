/*
 5. Escribir un programa en Java que juegue con el usuario a adivinar un número. La computadora
     debe generar un número aleatorio entre 1 y 500, y el usuario tiene que intentar adivinarlo. Para
      ello, cada vez que el usuario introduce un valor, la computadora debe decirle al usuario si el
       número que tiene que adivinar es mayor o menor que el que ha introducido el usuario. Cuando
        consiga adivinarlo, debe indicárselo e imprimir en pantalla el número de veces que el usuario
       ha intentado adivinar el número. Si el usuario introduce algo que no es un número, se debe
      controlar esa excepción e indicarlo por pantalla. En este último caso también se debe contar el
    carácter fallido como un intento.
 */
package egg.excepcionesejer5;

import java.util.InputMismatchException;
import java.util.Locale;
import java.util.Scanner;

public class ExcepcionesEjer5 {

    private final static Scanner SCANNER = new Scanner(System.in).useDelimiter("\n").useLocale(Locale.US);

    public static void main(String[] args) {
        int cantidadIntentos = 0;
        int numIngresado;
        try {
            int numAleatorio = (int) (Math.random() * 500) + 1;
            do {
                cantidadIntentos++;
                numIngresado = preguntarNumero(numAleatorio);

            } while (numIngresado != numAleatorio);

        } catch (InputMismatchException ime) {
            ime.getMessage();
        } catch (Exception e) {
            e.getMessage();
        } finally {
            System.out.println("Intentos realizados: " + cantidadIntentos);
        }
    }

    private static int preguntarNumero(int numAleatorio) throws InputMismatchException {
        int num;
        try {
            System.out.print("Ingrese un número entero a adivinar entre 0 y 500: ");
            num = SCANNER.nextInt();
            if (num == numAleatorio) {
                System.out.println("Ha adivinado!!");
            } else if (num > numAleatorio) {
                System.out.println("El número es menor");
            } else {
                System.out.println("El número es mayor");
            }
            return num;
        } catch (InputMismatchException ime) {
            System.out.println("No ha ingresado un entero!");
            SCANNER.nextLine();
            return 0;
        }
    }
}
