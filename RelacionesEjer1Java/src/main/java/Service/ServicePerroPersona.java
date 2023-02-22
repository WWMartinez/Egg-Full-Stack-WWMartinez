/*
 Realizar un programa para que una Persona pueda adoptar un Perro. Vamos a contar de dos
  clases. Perro, que tendrá como atributos: nombre, raza, edad y tamaño; y la clase Persona con
   atributos: nombre, apellido, edad, documento y Perro.
  Ahora deberemos en el main crear dos Personas y dos Perros. Después, vamos a tener que
 pensar la lógica necesaria para asignarle a cada Persona un Perro y por ultimo, mostrar desde
la clase Persona, la información del Perro y de la Persona.
 */
package Service;

import Entity.Perro;
import Entity.Persona;
import java.util.Scanner;

public class ServicePerroPersona {
    
    private Scanner leer = new Scanner(System.in).useDelimiter("\n");
    
    public Persona crearPersona() {
        Persona p1 = new Persona();
        System.out.println("Ingrese el nombre de la persona: ");
        p1.setNombre(leer.next());
        System.out.println("Ingrese el apellido de la persona: ");
        p1.setApellido(leer.next());
        System.out.println("Ingrese la edad de la persona: ");
        p1.setEdad(leer.nextInt());
        System.out.println("Ingrese el documento de la persona: ");
        p1.setDocumento(leer.nextLong());
        
        return p1;
    }
    
    public Perro crearPerro() {
        Perro dog = new Perro();
        System.out.println("Ingrese el nombre del perro: ");
        dog.setNombre(leer.next());
        System.out.println("Ingrese la raza del perro: ");
        dog.setRaza(leer.next());
        System.out.println("Ingrese la edad del perro: ");
        dog.setEdad(leer.nextInt());
        System.out.println("Ingrese el tamaño del perro: ");
        dog.setTamano(leer.next());
        
        return dog;
    }
    
}
