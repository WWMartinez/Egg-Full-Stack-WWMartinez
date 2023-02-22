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
import Entity.Persona;
import java.util.ArrayList;
import java.util.Locale;
import java.util.Scanner;

public class ServicePersona {

    private Scanner leer = new Scanner(System.in).useDelimiter("\n").useLocale(Locale.US);

    public ArrayList<Persona> crearListaPersonas() {
        ArrayList<Persona> personas = new ArrayList<>();
        String s = "s";
        do {
            System.out.println("Ingrese los datos de la persona...");
            personas.add(crearPersona());
            do {
                System.out.println("Desea ingresar otra persona? (s/n): ");
                s = leer.next();
                System.out.println();
            } while (!(s.equalsIgnoreCase("s") || s.equalsIgnoreCase("n")));
        } while (s.equalsIgnoreCase("s"));

        return personas;

    }

    public Persona crearPersona() {
        Persona persona = new Persona();

        System.out.println("Nombre: ");
        persona.setNombre(leer.next());
        System.out.println("Apellido: ");
        persona.setApellido(leer.next());
        System.out.println("Edad: ");
        persona.setEdad(leer.nextInt());
        System.out.println("DNI: ");
        persona.setDocumento(leer.nextDouble());

        return persona;

    }

    public void elegirPerro(ArrayList<Persona> listaPersonas, ArrayList<Perro> jauria) {

        int i = 0;
        while (jauria.size() > 0 && listaPersonas.size() > i) {

            System.out.println("\n lista de perros a elegir: ");
            for (Perro aux : jauria) {
                System.out.println(aux.toString());
            }
            boolean stock = false;
            do {
                System.out.println("\n" + listaPersonas.get(i).getNombre() + " "
                        + listaPersonas.get(i).getApellido() + ", ingrese el nombre del perro que quiere: ");
                String nombrePerro = leer.next();

                for (int j = 0; j < jauria.size(); j++) {
                    if (jauria.get(j).getNombre().equalsIgnoreCase(nombrePerro)) {
                        listaPersonas.get(i).setPerro(jauria.get(j));
                        jauria.remove(j);
                        stock = true;
                    }
                }

                if (!stock) {
                    System.out.println("La mascota no se encuentra en la lista...");
                }

            } while (!stock);

            i++;
        }

        if (jauria.isEmpty()) {
            System.out.println("\n No quedan perros para elegir...");
        } else {
            System.out.println("\n No quedas más personas en la lista...");
        }
    }

    public void mostarPersonaPerro(ArrayList<Persona> listaPersonas) {
        for (Persona aux : listaPersonas) {
            System.out.println(aux.toString() + "\n");
        }
    }

}
