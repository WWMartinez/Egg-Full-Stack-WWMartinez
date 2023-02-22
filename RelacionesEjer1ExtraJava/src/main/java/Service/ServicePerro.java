/*
  Ahora se debe realizar unas mejoras al ejercicio de Perro y Persona. Nuestro programa va a
   tener que contar con muchas personas y muchos perros. El programa deberá preguntarle a
    cada persona, que perro según su nombre, quiere adoptar. Dos personas no pueden adoptar
   al mismo perro, si la persona eligió un perro que ya estaba adoptado, se le debe informar a la
  persona.
 Una vez que la Persona elige el Perro se le asigna, al final deberemos mostrar todas las
personas con sus respectivos perros.
 */
package Service;

import Entity.Perro;
import java.util.ArrayList;
import java.util.Locale;
import java.util.Scanner;

public class ServicePerro {
    
    private final Scanner leer = new Scanner(System.in).useDelimiter("\n").useLocale(Locale.US);
    
    public ArrayList<Perro> crearJauria() {
        ArrayList<Perro> jauria = new ArrayList();
        String s = "si";
        do {
            System.out.println("Ingrese los datos del perro...");
            jauria.add(crearPerro());
            do{
                System.out.println("Desea ingresar otro perro? (s/n): ");
                s = leer.next();
                System.out.println();
            } while (!(s.equalsIgnoreCase("s") || s.equalsIgnoreCase("n")));
        
        } while (s.equalsIgnoreCase("s"));
        return jauria;
    }
    
    public Perro crearPerro() {
        Perro perro = new Perro();
        
        System.out.println("Nombre: ");
        perro.setNombre(leer.next());
        System.out.println("Raza: ");
        perro.setRaza(leer.next());
        System.out.println("Edad: ");
        perro.setEdad(leer.nextInt());
        System.out.println("Tamaño: ");
        perro.setTamaño(leer.next());
        
        return perro;
     
    }
    
    
    
}
