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
package Service;

import Entity.Alumno;
import java.util.ArrayList;
import java.util.Scanner;

public class ServiceAlumno {

    private ArrayList<Alumno> nuevaLista;
    private Scanner leer;

    public ServiceAlumno() {
        this.nuevaLista = new ArrayList<>();
        this.leer = new Scanner(System.in).useDelimiter("\n");
    }

    //Metodo para crear el alumno con sus datos de forma manuel
    public void crearAlumnos() {
        
        System.out.println("Ingrese el nombre: ");
        String nombreIngresado = leer.next();
        nombreIngresado = nombreIngresado.toUpperCase();

        System.out.println("Ingrese su 1ra nota: ");
        Integer nota1 = leer.nextInt();

        System.out.println("Ingrese su 2da nota: ");
        Integer nota2 = leer.nextInt();

        System.out.println("Ingrese su 3ra nota: ");
        Integer nota3 = leer.nextInt();

        nuevaLista.add(new Alumno(nombreIngresado, nota1, nota2, nota3));
    }

    public void imprimirAlumnoNotas() {
        // Utilizo el FOR EACH
        for (Alumno notaAlumno : nuevaLista) {
            System.out.println(notaAlumno.toString());
        }
    }

    public void buscarAlumnoNota() {
        // Calcular la nota de final de un estudiante 
        // Preguntamos el alumno que queremos saber su nota final
        System.out.println("Ingrese el nombre del alumno que desea saber su nota final: ");
        String alumSelect = leer.next();
        alumSelect = alumSelect.toUpperCase();

        for (Alumno alumno : nuevaLista) {
            //Validamos si está el alumno que queremos calcular la nota final
            if (alumno.getNombre().equalsIgnoreCase(alumSelect)) {

                //Usamos el objeto alumno creado en el FOR EACH para llamar el metodo para calular la nota final
                System.out.println("La nota final de "
                        + alumSelect + " es " + alumno.notaFinal());
            }
        }
    }

}
