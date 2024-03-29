/*
    Se plantea desarrollar un programa que nos permita calcular el área y el perímetro de formas
    geométricas, en este caso un círculo y un rectángulo. Ya que este cálculo se va a repetir en las
    dos formas geométricas, vamos a crear una Interfaz, llamada calculosFormas que tendrá, los
    dos métodos para calcular el área, el perímetro y el valor de PI como constante.
    Desarrollar el ejercicio para que las formas implementen los métodos de la interfaz y se
    calcule el área y el perímetro de los dos. En el main se crearán las formas y se mostrará el
    resultado final.
    Área circulo: PI * radio ^ 2 / Perímetro circulo: PI * diámetro.
    Área rectángulo: base * altura / Perímetro rectángulo: (base + altura) * 2.
 */
package Service;

import Entity.Rectangulo;
import java.util.Locale;
import java.util.Scanner;

public class ServiceRectangulo {

    public Rectangulo crearRectangulo() {
        Scanner leer = new Scanner(System.in).useDelimiter("\n").useLocale(Locale.US);

        Rectangulo rectangulo = new Rectangulo();
        System.out.println("\n---Rectangulo---");
        System.out.print("Ingrese la altura: ");
        rectangulo.setAltura(leer.nextDouble());
        System.out.print("Ingrese la base: ");
        rectangulo.setBase(leer.nextDouble());

        return rectangulo;
    }

    public void mostrarPerimetro(Rectangulo rectangulo) {
        System.out.printf("\nEl perímetro del rectángulo es: %.4f", rectangulo.calcularPerimetro());
    }

    public void mostrarArea(Rectangulo rectangulo) {
        System.out.printf("\nEl área del rectángulo es: %.4f\n", rectangulo.calcularArea());
    }

}
