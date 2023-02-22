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
package Service;

import Entity.Cafetera;
import java.util.Scanner;

public class CafeteraService {

    Scanner leer = new Scanner(System.in);
    Cafetera C1 = new Cafetera();

    public Cafetera crearCafetera() {
        Cafetera Caf1 = new Cafetera();

        System.out.println("Ingrese la capacidad máxima de su cafetera: ");
        C1.setCapacidadMaxima(leer.nextInt());
        System.out.println("Ingrese la capacidad actual de su cafetera:");
        C1.setCantidadActual(leer.nextInt());
        System.out.println();
        System.out.println("La capacidad máxima de su cafetera es: " + C1.getCapacidadMaxima());
        System.out.println("La capacidad actual de su cafetera es: " + C1.getCantidadActual());
        System.out.println();

        return Caf1;
    }

    public void llenarCafetera(Cafetera Caf1) {
        C1.setCantidadActual(C1.getCapacidadMaxima());
        System.out.println(C1.getCantidadActual());
    }

    public void servirTaza(Cafetera Caf1) {
        System.out.println("Su cafetera tiene: " + C1.getCantidadActual() + " de cafe.");
        System.out.println("Cuanta es la capacidad de su taza?");
        int taza = leer.nextInt();
        int cantiCafe = C1.getCantidadActual();
        int total = cantiCafe -= taza;
        if (C1.getCantidadActual() < 0) {
            System.out.println("No se pudo llenar la taza");
            System.out.println("Para llenar la taza falto: " + total * -1);
            C1.setCantidadActual(0);
        } else {
            System.out.println("Su taza esta llena.");
        }
        System.out.println("La capacidad actual de su cafetera es: " + C1.getCantidadActual());
    }

    public void vaciarCafetera(Cafetera Caf1) {
        C1.setCantidadActual(0);
        System.out.println("Su cafetera a sido vaciada con exito = " + C1.getCantidadActual());
    }

    public void agregarCafe(Cafetera Caf1) {
        System.out.println("Agregue la cantidad de cafe que desee.");
        int agregado = leer.nextInt();
        int cantiCafe = C1.getCantidadActual();
        int total = cantiCafe += agregado;
        System.out.println("Su cafetera ahora tiene un total de " + total + " Litros");
    }

}
