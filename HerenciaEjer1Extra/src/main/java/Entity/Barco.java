/*
    En un puerto se alquilan amarres para barcos de distinto tipo. Para cada Alquiler se guarda: el
    nombre, documento del cliente, la fecha de alquiler, fecha de devolución, la posición del
    amarre y el barco que lo ocupará.
    Un Barco se caracteriza por: su matrícula, su eslora en metros y año de fabricación.
    Sin embargo, se pretende diferenciar la información de algunos tipos de barcos especiales:
    
    • Número de mástiles para veleros.
    • Potencia en CV para barcos a motor.
    • Potencia en CV y número de camarotes para yates de lujo.

    Un alquiler se calcula multiplicando el número de días de ocupación (calculado con la fecha de
    alquiler y devolución), por un valor módulo de cada barco (obtenido simplemente
    multiplicando por 10 los metros de eslora).

    En los barcos de tipo especial el módulo de cada barco se calcula sacando el módulo normal y
    sumándole el atributo particular de cada barco. En los veleros se suma el número de mástiles,
    en los barcos a motor se le suma la potencia en CV y en los yates se suma la potencia en CV y
    el número de camarotes.

    Utilizando la herencia de forma apropiada, deberemos programar en Java, las clases y los
    métodos necesarios que permitan al usuario elegir el barco que quiera alquilar y mostrarle el
    precio final de su alquiler.
 */
package Entity;

import java.util.Locale;
import java.util.Scanner;

public class Barco {

    protected String matricula;
    protected double eslora;
    protected int anioFabricacion;
    protected Scanner leer;

    public Barco() {
        this.leer = new Scanner(System.in).useDelimiter("\n").useLocale(Locale.US);
    }

    public Barco(String matricula, double eslora, int anioFabricacion) {
        this.leer = new Scanner(System.in).useDelimiter("\n").useLocale(Locale.US);
        this.matricula = matricula;
        this.eslora = eslora;
        this.anioFabricacion = anioFabricacion;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public double getEslora() {
        return eslora;
    }

    public void setEslora(double eslora) {
        this.eslora = eslora;
    }

    public int getAnioFabricacion() {
        return anioFabricacion;
    }

    public void setAnioFabricacion(int anioFabricacion) {
        this.anioFabricacion = anioFabricacion;
    }

    public void crearBarco() {
        System.out.println("\nDatos del barco: ");
        System.out.print("\tMatricula: ");
        this.setMatricula(leer.next());
        System.out.print("\tEslora: ");
        this.setEslora(leer.nextDouble());
        System.out.print("\tAño de fabricacion: ");
        this.setAnioFabricacion(leer.nextInt());
    }

    public double costoAlquiler(Barco barco) {
        return barco.getEslora() * 10;
    }

    @Override
    public String toString() {
        return "Matricula: " + matricula + " \tEslora: " + eslora + "\tAño de Fabricacion: " + anioFabricacion;
    }

}
