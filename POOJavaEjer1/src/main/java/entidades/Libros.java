/*
 Crear una clase llamada Libro que contenga los siguientes atributos: ISBN, Título, Autor,
 Número de páginas, y un constructor con todos los atributos pasados por parámetro y un
 constructor vacío. Crear un método para cargar un libro pidiendo los datos al usuario y
 luego informar mediante otro método el número de ISBN, el título, el autor del libro y el
 numero de páginas.
 */
package entidades;

public class Libros {

    private int isbn;
    private String titulo;
    private String Autor;
    private int pags;

    public Libros() {

    }

    public Libros(int ISBN, String titulo, String Autor, int pags, int vacio) {
        this.isbn = ISBN;
        this.titulo = titulo;
        this.Autor = Autor;
        this.pags = pags;
    }

    public void setISBN(int ISBN) {
        this.isbn = ISBN;
    }
    public void setTítulo(String titulo) {
        this.titulo = titulo;
    }
    public void setAutor(String Autor) {
        this.Autor = Autor;
    }
    public void setPags(int pags) {
        this.pags = pags;
    }

    public int getISBN() {
        return isbn;
    }
    public String getTitulo() {
        return titulo;
    }
    public String getAutor() {
        return Autor;
    }
    public int getPags() {
        return pags;
    }

    @Override
    public String toString() {
        return 
                "---(Datos Del Libro)---\n"
                + "ISBN: " + isbn + "\n"
                + "Titulo: " + titulo + "\n" 
                + "Autor: " + Autor + "\n"
                + "Paginas: " + pags + " pags \n";
    }
}
