/*
3- Defina una clase llamada DivisionNumero. En el método main utilice un Scanner para leer dos
    números en forma de cadena. A continuación, utilice el método parseInt() de la clase Integer,
     para convertir las cadenas al tipo int y guardarlas en dos variables de tipo int. Por ultimo realizar
      una división con los dos numeros y mostrar el resultado.

4- Todas estas operaciones puede tirar excepciones a manejar, el ingreso por teclado puede
    causar una excepción de tipo InputMismatchException, el método Integer.parseInt() si la cadena
     no puede convertirse a entero, arroja una NumberFormatException y además, al dividir un
      número por cero surge una ArithmeticException. Manipule todas las posibles excepciones
       utilizando bloques try/catch para las distintas excepciones
 */
package egg.excepcionesejer3y4;

import java.util.InputMismatchException;
import java.util.Locale;
import java.util.Scanner;

public class ExcepcionesEjer3y4 {

    public static void main(String[] args) {

        Scanner leer = new Scanner(System.in).useDelimiter("\n").useLocale(Locale.US);
        System.out.println("Ingrese Dos Número Enteros");
        String a = "";
        String b = "";

        try {
            a = leer.next();
            b = leer.next();
        } catch (InputMismatchException e) {
            System.out.println("Los Números Ingresados no son correctos...");
        }

        DivisionNumero divNum = new DivisionNumero();

        try {
            divNum.convertirCadenas();
            try {
                System.out.printf("La división entre ambos numeros es: %.2f\n", divNum.division());
            } catch (ArithmeticException e) {
                e.getMessage();
            }
        } catch (NumberFormatException e) {
            e.getMessage();
        }
    }

}
