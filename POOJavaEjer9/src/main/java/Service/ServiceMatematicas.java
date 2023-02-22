/*
  Realizar una clase llamada Matemática que tenga como atributos dos números reales con
   los cuales se realizarán diferentes operaciones matemáticas. La clase deber tener un
    constructor vacío, parametrizado y get y set. En el main se creará el objeto y se usará el
     Math.random para generar los dos números y se guardaran en el objeto con su
      respectivos set. Deberá además implementar los siguientes métodos:

- a) Método devolverMayor() para retornar cuál de los dos atributos tiene el mayor valor
- b) Método calcularPotencia() para calcular la potencia del mayor valor de la clase
      elevado al menor número. Previamente se deben redondear ambos valores.
- c) Método calculaRaiz(), para calcular la raíz cuadrada del menor de los dos valores.
      Antes de calcular la raíz cuadrada se debe obtener el valor absoluto del número.
 */
package Service;

import Entity.Matematicas;
import java.util.Scanner;

public class ServiceMatematicas {

    public Matematicas crearOperacion() {

        Matematicas M1 = new Matematicas();
        Scanner leer = new Scanner(System.in);

        System.out.println("Ingrese el 1er número real: ");
        M1.setNum1(leer.nextFloat());
        System.out.println("Ingrese el 2do número real: ");
        M1.setNum2(leer.nextFloat());

        return M1;

    }

    public void devolverMayor(Matematicas M1) {

    }

    public void calcularPotencia(Matematicas M1) {

    }

    public void calcularRaiz(Matematicas M1) {

    }

}
