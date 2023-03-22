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

import Entity.Lavadora;
import java.util.Locale;
import java.util.Scanner;

public class ServiceLavadora {

    public Lavadora crearLavadora() {
        Scanner leer = new Scanner(System.in).useDelimiter("\n").useLocale(Locale.US);

        Lavadora lavadora = new Lavadora();
        lavadora.crearElectrodomestico();
        System.out.print("Carga: ");
        lavadora.setCarga(leer.nextInt());
        System.out.println("\nCOLOR\tCONSUMO\tPESO\tCARGA");
        System.out.println(lavadora.toString());

        return lavadora;
    }

    public double precioFinal(Lavadora lavadora) {
        double precioElectro = lavadora.precioFinal(lavadora);
        double precioCarga = 0;
        if (lavadora.getCarga() > 30) {
            precioCarga = 500d;
        }
        return precioElectro + precioCarga;
    }

}
