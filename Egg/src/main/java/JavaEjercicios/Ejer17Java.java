/*
    Recorrer un vector de N enteros contabilizando cuántos números son de 1 dígito, cuántos
    de 2 dígitos, etcétera (hasta 5 dígitos).
 */
package JavaEjercicios;

import java.util.Scanner;

public class Ejer17Java {

    public static void main(String[] args) {

        Scanner leer = new Scanner(System.in);

        //Ingresar cantidad para crear el vector...
        System.out.println("Ingrese el tamaño del vector");
        int n = leer.nextInt();

        //Creo el vector
        int vector[] = new int[n];

        //Creo el vector con los valores ingresados, y los imprimo.
        //tambien transformo el numero en string para contar sus caracteres.
        //Muestro todo al usuario...
        System.out.println("Creando vector");
        
        int dig1 = 0;
        int dig2 = 0;
        int dig3 = 0;
        int dig4 = 0;
        int dig5 = 0;
        
        for (int i = 0; i < vector.length; i++) {
            System.out.println("Ingrese el número para llenar el vector");
            int num1 = leer.nextInt();
            String numero = Integer.toString(num1);
            vector[i] = num1;
            
            if(numero.length() == 1) {
                dig1++;
            }
            
            if(numero.length() == 2) {
                dig2++;
            }
            
            if(numero.length() == 3) {
                dig3++;
            }
            
            if(numero.length() == 4) {
                dig4++;
            }
            
            if(numero.length() == 5) {
                dig5++;
            }
            System.out.println();
        }

        //Imprimo solo el vector
        System.out.println("Imprimiendo vector");

        for (int i = 0; i < vector.length; i++) {
            System.out.println("Posicion: " + i + " = [" + vector[i] + "]");
        }
        
        System.out.println();
        
        System.out.println("De un solo digito " + dig1);
        System.out.println("De dos digitos " + dig2);
        System.out.println("De tres digitos " + dig3);
        System.out.println("De cuatro digitos " + dig4);
        System.out.println("De cinco digitos " + dig5);
    }
}
