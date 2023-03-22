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
package Service;

import Entity.Televisor;
import java.util.Locale;
import java.util.Scanner;

public class ServiceTelevisor {

    public Televisor crearTelevisor() {
        Scanner leer = new Scanner(System.in).useDelimiter("\n").useLocale(Locale.US);

        Televisor televisor = new Televisor();
        televisor.crearElectrodomestico();
        System.out.print("Pulgadas: ");
        televisor.setPulgadas(leer.nextInt());
        System.out.print("TDT True/False:");
        televisor.setTdt(leer.nextBoolean());
        System.out.println("\nCOLOR\tCONSUMO\tPGD\tTDT");
        System.out.println(this.toString());

        return televisor;
    }

    public double precioFinal(Televisor televisor) {
        double precioPulgadas = televisor.precioFinal(televisor);
        if (televisor.getPulgadas() > 40) {
            precioPulgadas *= 1.3;
        }
        double precioTdt = 0;
        if (televisor.isTdt()) {
            precioTdt = 500d;
        }

        return precioPulgadas = precioTdt;
    }

}
