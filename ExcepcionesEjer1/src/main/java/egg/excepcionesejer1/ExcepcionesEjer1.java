/*
    Inicializar un objeto de la clase Persona ejercicio 7 de la guía POO, a null y tratar de invocar el
    método esMayorDeEdad() a través de ese objeto. Luego, englobe el código con una cláusula
    try-catch para probar la nueva excepción que debe ser controlada.
 */
package egg.excepcionesejer1;

import Entity.Persona;
import Service.ServicePersona;

public class ExcepcionesEjer1 {

    public static void main(String[] args) {

        Persona persona = new Persona();
        ServicePersona servPers = new ServicePersona();

        try {
            servPers.crearPersona();
            servPers.calcularIMC(persona);
            servPers.esMayorDeEdad(persona);
        } catch (NullPointerException e) {
            System.out.println("No se pudo calcular la edad de la persona ingresada...");
        }

    }
}
