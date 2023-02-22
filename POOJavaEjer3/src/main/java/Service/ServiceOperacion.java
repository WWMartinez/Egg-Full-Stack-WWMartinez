/*
 Crear una clase llamada Operacion que tenga como atributos privados numero1 y
 numero2. A continuación, se deben crear los siguientes métodos:
 
- a) Método constructor con todos los atributos pasados por parámetro.
- b) Metodo constructor sin los atributos pasados por parámetro.
- c) Métodos get y set.
- d) Método para crearOperacion(): que le pide al usuario los dos números y los guarda
      en los atributos del objeto.
- e) Método sumar(): calcular la suma de los números y devolver el resultado al main.
- f) Método restar(): calcular la resta de los números y devolver el resultado al main
- g) Método multiplicar(): primero valida que no se haga una multiplicación por cero, si
      fuera a multiplicar por cero, el método devuelve 0 y se le informa al usuario el error.
       Si no, se hace la multiplicación y se devuelve el resultado al main
- h) Método dividir(): primero valida que no se haga una división por cero, si fuera a pasar
      una división por cero, el método devuelve 0 y se le informa al usuario el error se le
       informa al usuario. Si no, se hace la división y se devuelve el resultado al main.
 */
package Service;

import Entity.Operacion;
import java.util.Scanner;

public class ServiceOperacion {

    Scanner leer = new Scanner(System.in);

    public Operacion crearOperacion() {
        System.out.println("Ingrese dos numeros");
        int num1 = leer.nextInt();
        System.out.println("Ingrese el 2do Número");
        int num2 = leer.nextInt();
        return new Operacion(num1, num2);
    }
    
    public int sumar(int num1, int num2) {
        int suma = num1 + num2;
        return suma;
    }
    
    public int resta(int num1, int num2) {
        int resta = num1 - num2;
        return resta;
    }
    
    public int multiplicar(int num1, int num2) {
        if (num1 != 0 && num2 != 0) {
        int multiplicar = num1 * num2;
        return multiplicar;
        } else {
            System.out.println("-----------------------------------------------");
            System.out.println("Error, no se permite la multiplicacion con cero");
            System.out.println("-----------------------------------------------");
        }
        return 0;
    }

    public int dividir(int num1, int num2) {
    if (num1 != 0 && num2 != 0) {
            int dividir = num1 / num2;
            return dividir;
        } else {
            System.out.println("-----------------------------------------------");
            System.out.println("Error, no se permite la division con cero");
            System.out.println("-----------------------------------------------");
        }
        return 0;
    }
}
