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
package Service;

import Entidades.Circunferencia;
import static java.lang.Math.PI;
import java.util.Scanner;

public class CircunferenciaService {

    Scanner leer = new Scanner(System.in);

    //c) Método para crearCircunferencia(): que le pide el radio y lo guarda en el atributo del objeto.
    public Circunferencia crearCircunferencia() {
        //Instanciamos una circunferencia
        Circunferencia C1 = new Circunferencia();
        //Creo una variable auxiliar que guarde el radio de manera temporal
        double num;
        do {
            System.out.println("Ingrese un radio positivo");
            num = leer.nextDouble();
        } while (num <= 0);

        C1.setRadio((float) num);

        return C1;
    }

    //d) Método area(): para calcular el área de la circunferencia (Area = PI * Radio^2).
    public void area(Circunferencia C1) {
        double Area;

        Area = PI * (C1.getRadio() * C1.getRadio());

        System.out.println("El area es : " + Area);
    }

    //e)Método perimetro(): para calcular el perímetro (Perimetro = 2 * PI * Radio)
    public void perimetro(Circunferencia C1) {
        double Perimetro;

        Perimetro = 2 * PI * C1.getRadio();

        System.out.println("El Perimetro es : " + Perimetro);
    }

}
