/*
 Crear una clase llamada Libro que contenga los siguientes atributos: ISBN, Título, Autor,
 Número de páginas, y un constructor con todos los atributos pasados por parámetro y un
 constructor vacío. Crear un método para cargar un libro pidiendo los datos al usuario y
 luego informar mediante otro método el número de ISBN, el título, el autor del libro y el
 numero de páginas.
 */
package entidades;

public class Usuario {

    private String nombre;
    private String Apellido;
    private int edad;
    private String dni;

    public Usuario() {

    }

    public Usuario(String nombre, String Apellido, int edad, String dni) {
        this.nombre = nombre;
        this.Apellido = Apellido;
        this.edad = edad;
        this.dni = dni;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public void setApellido(String Apellido) {
        this.Apellido = Apellido;
    }
    public void setEdad(int edad) {
        this.edad = edad;
    }
    public void setDni(String dni) {
        this.dni = dni;
    }

    public String getNombre() {
        return nombre;
    }
    public String getApellido() {
        return Apellido;
    }
    public int getEdad() {
        return edad;
    }
    public String getDni() {
        return dni;
    }

    @Override
    public String toString() {
        return 
                "---(Datos Del Usuario)--- \n"
                + "Nombre: " + nombre + "\n"
                + "Apellido: " + Apellido + "\n" 
                + "Edad: " + edad + "\n"
                + "DNI: " + dni + "\n";
    } 
}
