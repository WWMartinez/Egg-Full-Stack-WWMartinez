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
package Service;

import Entity.Perros;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.Scanner;

public class ServicePerros {

    private ArrayList<Perros> nuevaLista; // Creo la lista
    private Scanner leer; // Creo el Scanner para utilizar en toda mi clase de manera global

    //Buena practica
    public ServicePerros() {
        this.nuevaLista = new ArrayList<>(); //Creo el espacio en memoria
        this.leer = new Scanner(System.in).useDelimiter("\n");// Cuando se invoca la clase, habilita el flujo de datos
    }

    //Metodo para que el usuario cargue los DATOS de forma manual
    public void CargarPerros() {
        System.out.println("Ingrese el nombre del Perro: ");
        String nombreIngresado = leer.next();
        nombreIngresado = nombreIngresado.toUpperCase();

        System.out.println("Ingrese la RAZA del Perro: ");
        String razaIngresada = leer.next();
        razaIngresada = razaIngresada.toUpperCase();

        System.out.println();

        nuevaLista.add(new Perros(razaIngresada, nombreIngresado));
    }

    public void imprimirTodos() {
        for (Perros aux : nuevaLista) {
            System.out.println(aux.toString());
        }
    }

    public void buscarEliminar(String perroSelect) {
        // Uso el Iterator, porque si uso FOREACH me da error
        Iterator<Perros> it = nuevaLista.iterator();
        while (it.hasNext()) {
            if (it.next().getRaza().equals(perroSelect)) {  // Si se cumple esta condicion, elimina la raza
                it.remove();
            } else {
                System.out.println("ERROR");
                System.out.println("La raza ingresada no se encuentra en la base de datos...");
                System.out.println();
            }
        }
    }

    public void ordenarRazasAlfabet() {
        Collections.sort(nuevaLista,
                (Perros objeto1, Perros objeto2) -> objeto1.getRaza().compareTo(objeto2.getRaza()));
    }

}
