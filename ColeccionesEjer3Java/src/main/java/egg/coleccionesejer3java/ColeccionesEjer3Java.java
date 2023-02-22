/*
 Crear una clase llamada Alumno que mantenga información sobre las notas de distintos
  alumnos. La clase Alumno tendrá como atributos, su nombre y una lista de tipo Integer
   con sus 3 notas.
    En el servicio de Alumno deberemos tener un bucle que crea un objeto Alumno. Se pide
     toda la información al usuario y ese Alumno se guarda en una lista de tipo Alumno y se le
     pregunta al usuario si quiere crear otro Alumno o no.
    Después de ese bucle tendremos el siguiente método en el servicio de Alumno:
   Método notaFinal(): El usuario ingresa el nombre del alumno que quiere calcular su nota
  final y se lo busca en la lista de Alumnos. Si está en la lista, se llama al método. Dentro
 del método se usará la lista notas para calcular el promedio final de alumno. Siendo este
promedio final, devuelto por el método y mostrado en el main.
 */
package egg.coleccionesejer3java;

import Service.ServiceAlumno;
import java.util.Scanner;

public class ColeccionesEjer3Java {

    public static void main(String[] args) {

        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        String resp = "";

        ServiceAlumno a1 = new ServiceAlumno();

        do {
            a1.crearAlumnos();
            System.out.println("¿Desea ingresar otro alumno?");
            resp = leer.next();
        } while (resp.equalsIgnoreCase("si"));

        System.out.println();
        a1.imprimirAlumnoNotas();
        System.out.println();
        
        do {
            a1.buscarAlumnoNota();
            System.out.println("¿Desea saber la nota final de otro alumno?");
            resp = leer.next();
        } while (resp.equalsIgnoreCase("si"));
   
    }
}
