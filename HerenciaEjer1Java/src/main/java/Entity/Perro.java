/*
    Tenemos una clase padre Animal junto con sus 3 clases hijas Perro, Gato, Caballo.
    La clase Animal tendrá como atributos el nombre, alimento, edad y raza del Animal.
    Crear un método en la clase Animal a través del cual cada clase hija deberá mostrar luego un
    mensaje por pantalla informando de que se alimenta. Generar una clase Main que realice lo
    siguiente:
 */
package Entity;

public class Perro extends Animal {

    public Perro() {
    }

    public Perro(String nombre, String alimento, Integer edad, String raza) {
        super(nombre, alimento, edad, raza);
    }

    @Override
    public void alimentarse() {
        System.out.println(nombre + " se alimenta de: " + alimento);
    }

}
