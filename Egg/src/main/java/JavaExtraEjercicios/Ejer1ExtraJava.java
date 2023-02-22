/*
 Dado un tiempo en minutos, calcular su equivalente en días y horas. Por ejemplo, si el
 usuario ingresa 1600 minutos, el sistema debe calcular su equivalente: 1 día, 2 horas.
 */
package JavaExtraEjercicios;

import java.util.Scanner;

public class Ejer1ExtraJava {

    public static void main(String[] args) {
       
        Scanner leer = new Scanner(System.in);

        System.out.println("Ingrese la cantidad de minutos");
        float min = leer.nextInt();
        
        float horas = min / 60;
        float dias = horas / 24;
        
        System.out.println(min + " Minutos en dias son: " + dias);
        System.out.println(min + " Minutos en horas son: " + horas);
        
    }

}
