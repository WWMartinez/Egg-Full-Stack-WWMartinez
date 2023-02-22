/*
 Programa Nespresso. Desarrolle una clase Cafetera con los atributos capacidadMaxima
 (la cantidad máxima de café que puede contener la cafetera) y cantidadActual 
 (la cantidad actual de café que hay en la cafetera). Implemente, al menos, los siguientes
  métodos:

- Constructor predeterminado o vacío

- Constructor con la capacidad máxima y la cantidad actual

- Métodos getters y setters.

- Método llenarCafetera(): hace que la cantidad actual sea igual a la capacidad
máxima.

- Método servirTaza(int): se pide el tamaño de una taza vacía, el método recibe el
tamaño de la taza y simula la acción de servir la taza con la capacidad indicada. Si la
cantidad actual de café “no alcanza” para llenar la taza, se sirve lo que quede. El
método le informará al usuario si se llenó o no la taza, y de no haberse llenado en
cuanto quedó la taza.

- Método vaciarCafetera(): pone la cantidad de café actual en cero.

- Método agregarCafe(int): se le pide al usuario una cantidad de café, el método lo
recibe y se añade a la cafetera la cantidad de café indicada.

 */
package com.mycompany.poojavaejer6;

import Entity.Cafetera;
import Service.CafeteraService;
import java.util.Scanner;

public class POOJavaEjer6 {

    public static void main(String[] args) {

        Scanner leer = new Scanner(System.in);
        CafeteraService Ca1 = new CafeteraService();
        Cafetera CafeteraNew = Ca1.crearCafetera();
        
        int opcion;

        do {
            System.out.println();
            System.out.println("Ingrese la opcion que desea realizar");
            System.out.println("Presione 1 para LLenar cafetera");
            System.out.println("Presione 2 para Servir una taza.");
            System.out.println("Presione 3 para vaciar la cafetera");
            System.out.println("Presione 4 para Agregar cafe");
            System.out.println("Presione 5 para salir del programa");
            opcion = leer.nextInt();

            switch (opcion) {
                case 1:
                    Ca1.llenarCafetera(CafeteraNew);
                    break;
                case 2:
                    Ca1.servirTaza(CafeteraNew);
                    break;
                case 3:
                    Ca1.vaciarCafetera(CafeteraNew);
                    break;
                case 4:
                    Ca1.agregarCafe(CafeteraNew);
                    break;
                case 5:
                    System.out.println("Ha decidido salir");
                    break;
                default:
                    System.out.println("La opcion ingresada es incorrecta, intente otra vez.");
            }
        } while (opcion != 5);
    }
}
