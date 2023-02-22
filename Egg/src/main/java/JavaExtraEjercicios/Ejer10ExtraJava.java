/*
Realice un programa para que el usuario adivine el resultado de una multiplicación entre
dos números generados aleatoriamente entre 0 y 10. El programa debe indicar al usuario
si su respuesta es o no correcta. En caso que la respuesta sea incorrecta se debe permitir
al usuario ingresar su respuesta nuevamente. Para realizar este ejercicio investigue como
utilizar la función Math.random() de Java.
 */
package JavaExtraEjercicios;

import java.util.Scanner;

public class Ejer10ExtraJava {

    public static void main(String[] args) {
        
        Scanner leer = new Scanner(System.in);
        
        int a = (int) (Math.random() * 10);
        int b = (int) (Math.random() * 10);
        
        int resul = a * b;
        
        System.out.println("ADIVINA EL NÚMERO");
        System.out.println("Elegi un número entre el 0 y 100");
        
        for(int i = 0;; i++) {
           int respu = leer.nextInt();
            
            if(resul < respu) {
                System.out.println("El número a adivinar es menor al ingresado");
            }else if(resul > respu){
                System.out.println("El número a adivinar es mayor al ingresado");
            }else if(resul == respu) {
                System.out.println("Número acertado lo hiciste en " + i + " intentos");
                break;
            }else if(respu < 0) {
                System.out.println("Número ingresado no valido...");
            }
        }
    }

}
