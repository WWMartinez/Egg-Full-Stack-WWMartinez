/*
 Realizar un programa para que una Persona pueda adoptar un Perro. Vamos a contar de dos
  clases. Perro, que tendrá como atributos: nombre, raza, edad y tamaño; y la clase Persona con
   atributos: nombre, apellido, edad, documento y Perro.
  Ahora deberemos en el main crear dos Personas y dos Perros. Después, vamos a tener que
 pensar la lógica necesaria para asignarle a cada Persona un Perro y por ultimo, mostrar desde
la clase Persona, la información del Perro y de la Persona.
 */
package egg.relacionesejer1java;

import Entity.Perro;
import Entity.Persona;
import Service.ServicePerroPersona;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class RelacionesEjer1Java {

    private static Scanner leer = new Scanner(System.in).useDelimiter("\n");
    private static ServicePerroPersona pps = new ServicePerroPersona();

    public static void main(String[] args) {

        List<Persona> personas = new ArrayList();
        List<Perro> perroadop = new ArrayList();

        System.out.println("Se crean 2 usuarios Persona: ");
        for (int i = 0; i < 2; i++) {
            personas.add(pps.crearPersona());
        }

        System.out.println();
        System.out.println("Se crean 2 mascotas Perros");
        for (int i = 0; i < 2; i++) {
            perroadop.add(pps.crearPerro());
        }

        System.out.println();
        for (Persona aux : personas) {
            System.out.println("Para la persona " + aux.getNombre() + " " + aux.getApellido() + " Edad: " + aux.getEdad() + " Documento: " + aux.getDocumento() + " \n seleccione el nombre de uno de los siguientes perros en adopción: ");
            for (Perro aux2 : perroadop) {
                System.out.println("Nombre: " + aux2.getNombre() + " - Raza: " + aux2.getRaza());
            }
            String adop = leer.next();

            int selec = 0;
            for (int i = 0; i < perroadop.size(); i++) {
                if (adop.equalsIgnoreCase(perroadop.get(i).getNombre())) {
                    aux.setPerro(perroadop.get(i));
                    selec++;
                    perroadop.remove(i);
                }
            }
            if (selec == 0) {
                System.out.println("No se ha adoptado un perro válido: ");
            }
        }

        System.out.println("");
        System.out.println("Las siguientes personas han adoptad: ");
        for (Persona aux : personas) {
            if (aux.getPerro() == null) {
                System.out.println(aux.getNombre() + " " + aux.getApellido() + " Edad: " + aux.getEdad() + " Documento: " + aux.getDocumento() + " no ha adoptado a ningun perro");
            } else {
                System.out.println(aux.getNombre() + " " + aux.getApellido() + " Edad: " + aux.getEdad() + " Documento: " + aux.getDocumento() + " a adoptado a " + aux.getPerro().getNombre() + " de raza " + aux.getPerro().getRaza() + " Edad: " + aux.getPerro().getEdad() + " Tamaño: " + aux.getPerro().getTamano());
            }
        }

    }
}
