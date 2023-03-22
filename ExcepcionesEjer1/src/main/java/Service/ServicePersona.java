/*
    Inicializar un objeto de la clase Persona ejercicio 7 de la guía POO, a null y tratar de invocar el
    método esMayorDeEdad() a través de ese objeto. Luego, englobe el código con una cláusula
    try-catch para probar la nueva excepción que debe ser controlada.
 */
package Service;

import Entity.Persona;
import java.util.Scanner;

public class ServicePersona {

    Scanner leer = new Scanner(System.in).useDelimiter("\n");

    public Persona crearPersona() {
        System.out.print("Nombre: ");
        String nombre = leer.nextLine();
        System.out.print("Edad: ");
        int edad = leer.nextInt();
        String sexo;

            do {
                System.out.print("Sexo (h->Hombre) (m->Mujer) (o->Otro): ");
                sexo = leer.next();
            } while (!(sexo.equalsIgnoreCase("h") || sexo.equalsIgnoreCase("m") || sexo.equalsIgnoreCase("o")));

        System.out.print("Peso(KG): ");
        double peso = leer.nextDouble();
        System.out.print("Altura (Metro): ");
        double altura = leer.nextDouble();

        Persona p = new Persona(nombre, edad, sexo, peso, altura);

        return p;
    }

    public int calcularIMC(Persona p) {
        double imc = p.getPeso() / Math.pow(p.getAltura(), 2);
        if (imc < 20) {
            return -1;
        } else if (imc <= 25) {
            return 0;
        } else {
            return 1;
        }
    }

    public boolean esMayorDeEdad(Persona p) {
        return p.getEdad() >= 18;
    }

}
