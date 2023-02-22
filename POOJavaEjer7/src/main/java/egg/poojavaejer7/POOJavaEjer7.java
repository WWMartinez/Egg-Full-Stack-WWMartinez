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
package egg.poojavaejer7;

import Entity.Persona;
import Service.ServicePersona;

public class POOJavaEjer7 {

    public static void main(String[] args) {
        ServicePersona Pers1 = new ServicePersona();
        System.out.println("1er Persona: ");
        Persona P1 = Pers1.crearPersona();

        int IMC1 = Pers1.calcularIMC(P1);
        int ideal1 = 0;
        int sobre1 = 0;
        int debajo1 = 0;
        switch (IMC1) {
            case 1:
                System.out.println("la persona " + P1.getNombre() + " tiene sobrepeso");
                sobre1 = 1;
                break;
            case 0:
                System.out.println("la persona " + P1.getNombre() + " está en su peso ideal");
                ideal1 = 1;
                break;
            case -1:
                System.out.println("la persona " + P1.getNombre() + " está por debajo de su peso ideal");
                debajo1 = 1;
                break;
            default:
                System.out.println("No se Realizo el Calculo");
        }
        //Metodo esMayorDeEdad
        //Variables auxilares que alojan de la primera persona el dato de edad mayor
        int mayor1 = 0;
        int menor1 = 0;
        if (Pers1.esMayorDeEdad(P1)) {
            System.out.println("La persona " + P1.getNombre() + " es de mayor Edad");
            mayor1 = 1;
        } else {
            System.out.println("La persona " + P1.getNombre() + " es de menor Edad");
            menor1 = 1;
        }
    }
}
