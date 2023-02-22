/*
Escribir un programa que lea un número entero y devuelva el número de dígitos que
componen ese número. Por ejemplo, si introducimos el número 12345, el programa
deberá devolver 5. Calcular la cantidad de dígitos matemáticamente utilizando el operador
de división. Nota: recordar que las variables de tipo entero truncan los números o
resultados.
 */
package JavaExtraEjercicios;

import java.util.Scanner;

public class Ejer11ExtraJava {

    public static void main(String[] args) {

        Scanner leer = new Scanner(System.in);
        int num;
        int digitos = 0;
        
        System.out.println("Ingrese la cantidad de digitos que desea operar");
        num = leer.nextInt();
        
        System.out.println("Usted ingreso " + num);
        
        while (num != 0) {
            num = num / 10;
            digitos++;
        }
        
        System.out.println("Total de digitos: " + digitos);
        
    }

}
