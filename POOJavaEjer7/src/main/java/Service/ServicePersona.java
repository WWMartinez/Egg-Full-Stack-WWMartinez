/*
Realizar una clase llamada Persona que tenga los siguientes atributos: nombre, edad,
sexo ('H' hombre, 'M' mujer, 'O' otro), peso y altura. Si el alumno desea añadir algún otro
atributo, puede hacerlo. Los métodos que se implementarán son:
- Un constructor por defecto.

- Un constructor con todos los atributos como parámetro.

- Métodos getters y setters de cada atributo.

- Metodo crearPersona(): el método crear persona, le pide los valores de los atributos
    al usuario y después se le asignan a sus respectivos atributos para llenar el objeto
      Persona. Además, comprueba que el sexo introducido sea correcto, es decir, H, M o
        O. Si no es correcto se deberá mostrar un mensaje

- Método calcularIMC(): calculara si la persona está en su peso ideal (peso en
   kg/(altura^2 en mt2)). Si esta fórmula da por resultado un valor menor que 20,
    significa que la persona está por debajo de su peso ideal y la función devuelve un -1.
     Si la fórmula da por resultado un número entre 20 y 25 (incluidos), significa que la
    persona está en su peso ideal y la función devuelve un 0. Finalmente, si el resultado
  de la fórmula es un valor mayor que 25 significa que la persona tiene sobrepeso, y la
función devuelve un 1.

- Método esMayorDeEdad(): indica si la persona es mayor de edad. La función
   devuelve un booleano.
---------------------------------------------------------------------------------------------------
    A continuación, en la clase main hacer lo siguiente:
     Crear 4 objetos de tipo Persona con distintos valores, a continuación, llamaremos todos
      los métodos para cada objeto, deberá comprobar si la persona está en su peso ideal,
       tiene sobrepeso o está por debajo de su peso ideal e indicar para cada objeto si la
      persona es mayor de edad.
     Por último, guardaremos los resultados de los métodos calcularIMC y esMayorDeEdad en
    distintas variables, para después en el main, calcular un porcentaje de esas 4 personas
   cuantas están por debajo de su peso, cuantas en su peso ideal y cuantos, por encima, y
  también calcularemos un porcentaje de cuantos son mayores de edad y cuantos menores
 */
package Service;

import Entity.Persona;
import java.util.Scanner;

public class ServicePersona {

    Scanner leer = new Scanner(System.in);

    public Persona crearPersona() {

        boolean salir = true;

        System.out.println("Cual es el nombre de la persona?");
        String name = leer.next();

        int num1;

        do {
            System.out.println("Edad?");
            num1 = leer.nextInt();
            if ((num1 < 0) || (num1 > 99)) {
                System.out.println("Valor ingresado no valido...");
            } else {
                salir = false;
            }
        } while (salir);

        System.out.println("Cual es el genero de la persona? (H) (M) (O)");
        String gen = leer.next();

        if (!(gen.equalsIgnoreCase("H") || gen.equalsIgnoreCase("M") || gen.equalsIgnoreCase("O"))) {
            do {
                System.out.println("Ingrese un valor valido...");
                gen = leer.next();
            } while (!(gen.equalsIgnoreCase("H") || gen.equalsIgnoreCase("M") || gen.equalsIgnoreCase("O")));
        }

        //Atributo Peso
        salir = true;
        int num2;
        do {
            System.out.println("El peso? ");
            num2 = leer.nextInt();

            if ((num2 < 25 || num2 > 650) && (num1 > 27)) {
                System.out.println("Valores ingresados no valido...");

            } else if ((num1 >= 12 || num1 < 20) && (num2 < 20)) {
                System.out.println("Indique un peso acorde a la edad de un adolecente...");
            } else if ((num1 < 12) && (num2 < 0 || num2 >= 100)) {
                System.out.println("Indique un peso acorde a la edad infantil...");
            } else {
                salir = false;
            }
        } while (salir);

        //Altura
        salir = true;
        double num3;
        do {
            System.out.println("altura?");
            num3 = leer.nextDouble();
            if (num3 < 0 || num3 > 2.44) {
                System.out.println("Indique una altura coherente");
            } else {
                salir = false;
            }
        } while (salir);
        //Retornamos los valores que el usuario indicó
        return new Persona(name, num1, gen, num2, num3);
    }

    /*
    5) Método calcularIMC(): calculara si la persona está en su peso ideal (peso en 
    kg/(altura^2 en mt2)). Si esta fórmula da por resultado un valor menor que 20, 
    significa que la persona está por debajo de su peso ideal y la función devuelve un -1. 
    Si la fórmula da por resultado un número entre 20 y 25 (incluidos), significa que la 
    persona está en su peso ideal y la función devuelve un 0. Finalmente, si el resultado 
    de la fórmula es un valor mayor que 25 significa que la persona tiene sobrepeso, y la 
    función devuelve un 1. 
     */
    public int calcularIMC(Persona valorActual) {
        //Calculamos si la persona está en su peso ideal (peso en kg/(altura^2 en mt2))
        double IMC = valorActual.getPeso() / Math.pow(valorActual.getAltura(), 2);
        int valor = 0;
        //Comparamos el resultado de la operacion
        if (IMC < 20) {

            valor = -1;
        } else if (IMC >= 20 || IMC <= 25) {

            valor = 0;
        } else if (IMC > 25) {
            valor = 1;
        }
        //Retornamos el valor de la comparacion
        return valor;
    }

    /*
    6) Método esMayorDeEdad(): indica si la persona es mayor de edad. La función 
    devuelve un booleano.
     */
    public boolean esMayorDeEdad(Persona ValorActual) {
        //Para saber si es mayor de edad comparamos la edad>=18
        boolean Mayor = false;
        if (ValorActual.getEdad() >= 18) {
            Mayor = true;
        }
        return Mayor;
    }
}
