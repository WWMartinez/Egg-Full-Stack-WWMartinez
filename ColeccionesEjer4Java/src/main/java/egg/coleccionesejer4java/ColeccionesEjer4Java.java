/*
 Un cine necesita implementar un sistema en el que se puedan cargar peliculas. Para esto,
  tendremos una clase Pelicula con el título, director y duración de la película (en horas).
   Implemente las clases y métodos necesarios para esta situación, teniendo en cuenta lo
    que se pide a continuación:
     En el servicio deberemos tener un bucle que crea un objeto Pelicula pidiéndole al usuario
    todos sus datos y guardándolos en el objeto Pelicula.
   Después, esa Pelicula se guarda una lista de Peliculas y se le pregunta al usuario si quiere
  crear otra Pelicula o no.
 Después de ese bucle realizaremos las siguientes acciones:

• Mostrar en pantalla todas las películas.

• Mostrar en pantalla todas las películas con una duración mayor a 1 hora.

• Ordenar las películas de acuerdo a su duración (de mayor a menor) y mostrarlo en
pantalla.

• Ordenar las películas de acuerdo a su duración (de menor a mayor) y mostrarlo en
pantalla.

• Ordenar las películas por título, alfabéticamente y mostrarlo en pantalla.

• Ordenar las películas por director, alfabéticamente y mostrarlo en pantalla.
 */
package egg.coleccionesejer4java;

import Service.ServicePeliculas;
import java.util.Scanner;

public class ColeccionesEjer4Java {

    public static void main(String[] args) {

        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        String resp = "";
        int opc;

        ServicePeliculas p1 = new ServicePeliculas();

        do {
            p1.crearPelicula();
            System.out.println("¿Desea ingresar otra pelicula?");
            resp = leer.next();
        } while (resp.equalsIgnoreCase("si"));

        do {
            System.out.println("Ingrese la opcion que desea visualizar: ");
            System.out.println("1 - Mostrar en pantalla todas las peliculas");
            System.out.println("2 - Mostrar en pantalla las películas con una duracion mayor a 1 hora");
            System.out.println("3 - Mostrar en pantalla las peliculas ordenas por duracion de mayor a menor");
            System.out.println("4 - Mostrar en pantalla las peliculas ordenas por duracion de menor a mayor");
            System.out.println("5 - Mostrar en pantalla las peliculas por título, alfabeticamente y mostrarlo en pantalla");
            System.out.println("6 - Mostrar en pantalla las peliculas por director, alfabeticamente y mostrarlo en pantalla.");
            System.out.println("7 - Cerrar el programa");
            opc = leer.nextInt();

            switch (opc) {
                case 1:
                    System.out.println();
                    p1.imprimirPeliculas();
                    System.out.println();
                    break;
                case 2:
                    System.out.println();
                    break;
            }

        } while (opc != 7);

    }
}
