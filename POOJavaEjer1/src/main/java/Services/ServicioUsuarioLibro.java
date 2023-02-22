/*
 Crear una clase llamada Libro que contenga los siguientes atributos: ISBN, Título, Autor,
 Número de páginas, y un constructor con todos los atributos pasados por parámetro y un
 constructor vacío. Crear un método para cargar un libro pidiendo los datos al usuario y
 luego informar mediante otro método el número de ISBN, el título, el autor del libro y el
 numero de páginas.
 */
package Services;

import entidades.Libros;
import entidades.Usuario;
import java.util.Scanner;

public class ServicioUsuarioLibro {
    
    private Scanner leer = new Scanner(System.in).useDelimiter("\n");
    
    public Usuario crearUsuario() {
        
        System.out.println("Nombre: ");
        String nombre = leer.next();
        System.out.println("Apellido: ");
        String apellido = leer.next();
        System.out.println("Edad: ");
        int edad = leer.nextInt();
        System.out.println("DNI: ");
        String dni = leer.next();
        
        return new Usuario(nombre, apellido, edad, dni);
    }
    
    public Libros crearLibro() {
        
        System.out.println("ISBN: ");
        int isbn = leer.nextInt();
        System.out.println("Título: ");
        String titulo = leer.next();
        System.out.println("Autor: ");
        String Autor = leer.next();
        System.out.println("Paginas en total: ");
        int pags = leer.nextInt();
        
        return new Libros(isbn, titulo, Autor, pags, pags);
    }
    
}
