/*
 Crea una aplicación que le pida dos números al usuario y este pueda elegir entre sumar,
  restar, multiplicar y dividir. La aplicación debe tener una función para cada operación
   matemática y deben devolver sus resultados para imprimirlos en el main.
 */
package JavaExtraEjercicios;

import java.util.Scanner;

public class Ejer15ExtraJava {

    public static void main(String[] args) {
        
        Scanner leer = new Scanner(System.in);
        
        int resultado;
        double div;
        
        System.out.println("Ingrese el 1er número:");
        int num = leer.nextInt();
        System.out.println("Ingrese el 2do número:");
        int num2 = leer.nextInt();
        
        System.out.println("¿Que operacion desea realizar?");
        System.out.println("1- SUMAR");
        System.out.println("2- RESTAR");
        System.out.println("3- MULTIPLICAR");
        System.out.println("4- DIVIDIR");
        
        
        int opc = leer.nextInt();
        
        switch(opc) {
            case 1:
                resultado = num + num2;
                System.out.println("La suma es: " + resultado);
                break;
            case 2:
                resultado = num - num2;
                System.out.println("La resta es: " + resultado);
                break;
            case 3:
                resultado = num * num2;
                System.out.println("La multiplicacion es: " + resultado);
                break;
            case 4:
                div = num / num2;
                System.out.println("La division es: " + div);
                break;
            default:
                System.out.println("No selecciono ninguna de las opciones disponibles...");
        }
        
    }
    
}
