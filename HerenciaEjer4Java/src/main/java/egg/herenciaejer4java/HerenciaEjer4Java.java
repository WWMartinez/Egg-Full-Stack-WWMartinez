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
package egg.herenciaejer4java;

import Entity.Circulo;
import Entity.Rectangulo;
import Service.ServiceCirculo;
import Service.ServiceRectangulo;

public class HerenciaEjer4Java {

    public static void main(String[] args) {

        ServiceCirculo serviceCirculo = new ServiceCirculo();
        Circulo circulo = serviceCirculo.crearCirculo();
        serviceCirculo.mostrarPerimetro(circulo);
        serviceCirculo.mostrarArea(circulo);
        
        ServiceRectangulo serviceRectangulo = new ServiceRectangulo();
        Rectangulo rectangulo = serviceRectangulo.crearRectangulo();
        serviceRectangulo.mostrarPerimetro(rectangulo);
        serviceRectangulo.mostrarArea(rectangulo);
    }
}
