/*
  Una obra social tiene tres clases de socios:
- Los socios tipo ‘A’ abonan una cuota mayor, pero tienen un 50% de descuento en
   todos los tipos de tratamientos.

- Los socios tipo ‘B’ abonan una cuota moderada y tienen un 35% de descuento para
   los mismos tratamientos que los socios del tipo A.

- Los socios que menos aportan, los de tipo ‘C’, no reciben descuentos sobre dichos
   tratamientos.

- Solicite una letra (carácter) que representa la clase de un socio, y luego un valor
   real que represente el costo del tratamiento (previo al descuento) y determine el
    importe en efectivo a pagar por dicho socio.
 */
package JavaExtraEjercicios;

import java.util.Scanner;

public class Ejer5ExtraJava {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);

        System.out.println("Ingrese el tipo de obra social...");
        System.out.println("A: Dispone de un 50%");
        System.out.println("B: Dispone de un 35%");
        System.out.println("C: No dispone de beneficios");

        String opc = leer.nextLine().toUpperCase();

        switch (opc) {
            case "A" -> {
                System.out.println("Usted dispone de un 50% de descuento...");
                System.out.println("Ingrese el costo del tratamiento:");
                float precioA = leer.nextFloat();
                float desc = (precioA * 50 / 100);
                float total = precioA - desc;
                System.out.println("Total a pagar " + total);
            }
            case "B" -> {
                System.out.println("Usted dispone de un 35% de descuento...");
                System.out.println("Ingrese el costo del tratamiento:");
                float precioB = leer.nextFloat();
                float descB = (precioB * 35 / 100);
                float totalB = precioB - descB;
                System.out.println("Total a pagar " + totalB);
            }
            case "C" -> {
                System.out.println("Usted no dispone descuentos...");
                System.out.println("Ingrese el costo del tratamiento:");
                float precioC = leer.nextFloat();
                System.out.println("Total a pagar " + precioC);
            }
            default ->
                System.out.println("Ingrese el tipo de obra social...");
        }

    }

}
