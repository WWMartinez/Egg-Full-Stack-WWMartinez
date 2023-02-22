/*
  Declarar una clase llamada Circunferencia que tenga como atributo privado el radio de
   tipo real. A continuación, se deben crear los siguientes métodos:
 - a) Método constructor que inicialice el radio pasado como parámetro.
 - b) Métodos get y set para el atributo radio de la clase Circunferencia.
 - c) Método para crearCircunferencia(): que le pide el radio y lo guarda en el atributo del
      objeto.
 - d) Método area(): para calcular el área de la circunferencia (area = pi * (radio*radio)).
 - e) Método perimetro(): para calcular el perímetro (perimetro = 2 * pi * radio).
 
 */
package Entity;

public class Circunferencia {

    private double Radio;

    public Circunferencia() {

    }

    public Circunferencia(double Radio) {
        this.Radio = Radio;
    }

    public double getRadio() {
        return Radio;
    }

    public void setRadio(double Radio) {
        this.Radio = Radio;
    }

    @Override
    public String toString() {
        return "Circunferencia{" + "Radio=" + Radio + '}';
    }

}
