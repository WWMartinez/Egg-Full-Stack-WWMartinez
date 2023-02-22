/*
Crea una aplicación que a través de una función nos convierta una cantidad de euros
introducida por teclado a otra moneda, estas pueden ser a dólares, yenes o libras. La
función tendrá como parámetros, la cantidad de euros y la moneda a converir que será
una cadena, este no devolverá ningún valor y mostrará un mensaje indicando el cambio
(void).
El cambio de divisas es:
- 0.86 libras es un 1 €
- 1.28611 $ es un 1 €
- 129.852 yenes es un 1 €
 */
package JavaEjercicios;

import java.util.Scanner;

public class Ejer14Java {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        
        System.out.println("Ingrese la cantidad de euros: ");
        float euros = leer.nextFloat();
        System.out.println();
        convertidor(euros);
    }

    public static void convertidor(float euros) {
        System.out.println(euros + "€ en libras son: £" + (euros * 0.86));
        System.out.println(euros + "€ en dolares son: $" + (euros * 1.28611));
        System.out.println(euros + "€ en yenes son: ¥" + (euros * 129.852));
    }
}