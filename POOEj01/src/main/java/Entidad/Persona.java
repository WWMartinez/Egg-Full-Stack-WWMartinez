package Entidad;

    // Creo la clase Persona
public class Persona {

    private String nombre;
    private String apellido;
    private int edad;
    private String pais;

    // Creo las variables 
    public Persona(String nombre, String apellido, int edad, String pais) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
        this.pais = pais;
    }

    // Set Persona
    public void setNombre(String nombre) {

        if (nombre.length() > 0) {
            this.nombre = nombre;
        }
    }
    public void setApellido(String apellido) {
        this.apellido = apellido;
    }
    public void setEdad(int edad) {
        this.edad = edad;
    }
    public void setPais(String pais) {
        this.pais = pais;
    }
 
    // Get Persona
    public String getNombre() {
        return nombre;
    }
    public String getApellido() {
        return apellido;
    }
    public int getEdad() {
        return edad;
    }
    public String getPais() {
        return pais;
    }

    // Imprimir Persona
    @Override
    public String toString() {
        return "Persona{" + "nombre=" + nombre + ", apellido=" + apellido + ", edad=" + edad + ", pais=" + pais + '}';
    }
    
}
