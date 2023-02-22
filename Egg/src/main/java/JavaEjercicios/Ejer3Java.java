 //Escribir un programa que pida una frase y la muestre toda en mayúsculas y después toda
//en minúsculas. Nota: investigar la función toUpperCase() y toLowerCase() en Java.

package JavaEjercicios;

import java.util.Scanner;

public class Ejer3Java {

    public static void main(String[] args) {

        Scanner leer = new Scanner(System.in);

        String var1;

        System.out.println("Ingrese la frase que quiere en mayuscula y miniscula.");
        var1 = leer.nextLine();
        
        System.out.println("---------------------------------------");
        System.out.println(var1.toUpperCase());
        System.out.println(var1.toLowerCase());
        
    }

}
