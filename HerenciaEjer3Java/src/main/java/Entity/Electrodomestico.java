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
package Entity;

import java.util.Locale;
import java.util.Scanner;

public class Electrodomestico {

    protected Double precio;
    protected String color;
    protected char consumoEnergetico;
    protected Double peso;

    public final Scanner leer;

    public Electrodomestico() {
        this.leer = new Scanner(System.in).useDelimiter("\n").useLocale(Locale.US);
    }

    public Electrodomestico(Double precio, String color, char consumoEnergetico, Double peso) {
        this.leer = new Scanner(System.in).useDelimiter("\n").useLocale(Locale.US);
        this.precio = precio;
        this.color = color;
        this.consumoEnergetico = consumoEnergetico;
        this.peso = peso;
    }

    public Double getPrecio() {
        return precio;
    }

    public void setPrecio(Double precio) {
        this.precio = precio;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public char getConsumoEnergetico() {
        return consumoEnergetico;
    }

    public void setConsumoEnergetico(char consumoEnergetico) {
        this.consumoEnergetico = consumoEnergetico;
    }

    public Double getPeso() {
        return peso;
    }

    public void setPeso(Double peso) {
        this.peso = peso;
    }

    private char comprobarConsumoEnergetico(char letra) {
        if ((letra >= 'a' && letra <= 'f') || (letra >= 'A' && letra <= 'F')) {
            return letra;
        }
        return 'f';
    }

    private String comprobarColor(String color) {
        String[] colores = new String[]{"blanco", "negro", "rojo", "azul", "gris"};

        for (String aux : colores) {
            if (aux.equalsIgnoreCase(color)) {
                return color;
            }
        }
        return "Blanco";
    }

    public Electrodomestico crearElectrodomestico() {

        Electrodomestico electrodomestico = new Electrodomestico();
        System.out.print("Color: ");
        electrodomestico.setColor(comprobarColor(leer.next()));
        System.out.print("Consumo Energético: ");
        electrodomestico.setConsumoEnergetico(comprobarConsumoEnergetico(leer.next().charAt(0)));
        System.out.print("Peso: ");
        electrodomestico.setPeso(leer.nextDouble());

        return electrodomestico;
    }

    public double precioFinal(Electrodomestico electrodomestico) {
        double precioElectro = electrodomestico.getPrecio();

        double precioConsumo = 0;
        String consumo = Character.toString(this.getConsumoEnergetico()).toUpperCase();
        switch (consumo) {
            case "A":
                this.setPrecio(this.getPrecio() + 1000d);
                break;
            case "B":
                this.setPrecio(this.getPrecio() + 800d);
                break;
            case "C":
                this.setPrecio(this.getPrecio() + 600d);
                break;
            case "D":
                this.setPrecio(this.getPrecio() + 500d);
                break;
            case "E":
                this.setPrecio(this.getPrecio() + 300d);
                break;
            case "F":
                this.setPrecio(this.getPrecio() + 100d);
                break;
            default:
                System.out.println("Error en el (Precio Consumo)");
        }

        double precioPeso;
        double pesoElectro = electrodomestico.getPeso();
        if (pesoElectro > 1 && pesoElectro <= 19) {
            precioPeso = 100d;
        } else if (pesoElectro <= 49) {
            precioPeso = 500d;
        } else if (pesoElectro <= 79) {
            precioPeso = 800d;
        } else {
            precioPeso = 1000d;
        }

        return precioElectro + precioConsumo + precioPeso;

    }

    @Override
    public String toString() {
        return color + "\t" + consumoEnergetico + "\t" + peso;
    }

}
