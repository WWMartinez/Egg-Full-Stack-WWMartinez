/*
    Siguiendo el ejercicio anterior, en el main vamos a crear un ArrayList de Electrodomésticos
      para guardar 4 electrodomésticos, ya sean lavadoras o televisores, con valores ya asignados.
       Luego, recorrer este array y ejecutar el método precioFinal() en cada electrodoméstico. Se
        deberá también mostrar el precio de cada tipo de objeto, es decir, el precio de todos los
       televisores y el de las lavadoras. Una vez hecho eso, también deberemos mostrar, la suma del
      precio de todos los Electrodomésticos. Por ejemplo, si tenemos una lavadora con un precio de
     2000 y un televisor de 5000, el resultado final será de 7000 (2000+5000) para
    electrodomésticos, 2000 para lavadora y 5000 para televisor.
 */
package egg.herenciaejer3java;

import Entity.Electrodomestico;
import Entity.Lavadora;
import Entity.Televisor;
import Service.ServiceLavadora;
import Service.ServiceTelevisor;
import java.util.ArrayList;

public class HerenciaEjer3Java {

    public static void main(String[] args) {

        ArrayList<Electrodomestico> electrodomestico = new ArrayList<>(4);

        /* Lavadora(int carga, Double precio, String color, char consumoEnergetico, Double peso) */
        electrodomestico.add(new Lavadora(35, 0d, "Blanco", 'A', 75d));
        /* Televisor(int pulgadas, boolean tdt, Double precio, String color, char consumoEnergetico, Double peso) */
        electrodomestico.add(new Televisor(45, true, 0d, "Azul", 'A', 45d));
        electrodomestico.add(new Lavadora(35, 0d, "Amarillo", 'A', 85d));
        electrodomestico.add(new Televisor(50, false, 0d, "Negro", 'A', 40d));

        double precioAllLavadoras = 0d;
        double precioAllTelevisores = 0d;

        for (Electrodomestico aux : electrodomestico) {
            if (aux instanceof Lavadora) {
                Lavadora lavadora = (Lavadora) aux;
                ServiceLavadora servicioLavadora = new ServiceLavadora();
                double precioLavadora = servicioLavadora.precioFinal(lavadora);

                System.out.println("El precio de la lavadora de color " + lavadora.getColor() + " es: " + precioLavadora);
                precioAllLavadoras += precioLavadora;
            }
            if (aux instanceof Televisor) {
                Televisor televisor = (Televisor) aux;
                ServiceTelevisor servicioTelevisor = new ServiceTelevisor();
                double precioTelevisor = servicioTelevisor.precioFinal(televisor);
                System.out.println("El precio del televisor de color " + televisor.getColor() + " es: " + precioTelevisor);
                precioAllTelevisores += precioTelevisor;
            }
        }

        System.out.print("\nEl precio de las lavadoras es: " + precioAllLavadoras);
        System.out.println("\nEl precio de los televisores es: " + precioAllTelevisores);
        System.out.println("\nEl precio de todos los electrodomesticos es: " + (precioAllLavadoras + precioAllTelevisores));

    }
}
