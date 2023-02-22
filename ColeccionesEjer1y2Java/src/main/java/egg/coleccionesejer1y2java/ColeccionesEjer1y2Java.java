/*
 Diseñar un programa que lea y guarde razas de perros en un ArrayList de tipo String. El
  programa pedirá una raza de perro en un bucle, el mismo se guardará en la lista y
   después se le preguntará al usuario si quiere guardar otro perro o si quiere salir. Si decide
    salir, se mostrará todos los perros guardados en el ArrayList.
     2. Continuando el ejercicio anterior, después de mostrar los perros, al usuario se le pedirá
    un perro y se recorrerá la lista con un Iterator, se buscará el perro en la lista. Si el perro
   está en la lista, se eliminará el perro que ingresó el usuario y se mostrará la lista
  ordenada. Si el perro no se encuentra en la lista, se le informará al usuario y se mostrará
 la lista ordenada.
 */
package egg.coleccionesejer1y2java;

import Entity.Perros;
import Service.ServicePerros;
import java.util.Scanner;

public class ColeccionesEjer1y2Java {

    public static void main(String[] args) {

        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        String resp = "";

        ServicePerros razasPerros = new ServicePerros();

        do {
            //Perros p1 = new Perros(); // Creo el objeto en cada vuelta del do while
            razasPerros.CargarPerros();
            System.out.println("¿Desea ingresar otro Perro?");
            resp = leer.next();
        } while (resp.equalsIgnoreCase("si"));

        System.out.println();
        razasPerros.imprimirTodos();
        System.out.println();

        System.out.println("Ingrese la RAZA del Perro que desea eliminar: ");
        String perroSelect = leer.next();
        perroSelect = perroSelect.toUpperCase();
        razasPerros.buscarEliminar(perroSelect); // llamo al metodo y envio a quien quiero eliminar de la lista

        razasPerros.ordenarRazasAlfabet();

        System.out.println();
        razasPerros.imprimirTodos();
        System.out.println();
    }
}
