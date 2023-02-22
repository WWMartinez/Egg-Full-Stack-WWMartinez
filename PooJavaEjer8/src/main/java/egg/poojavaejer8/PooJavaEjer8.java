/*
  Realizar una clase llamada Cadena que tenga como atributos una frase (de tipo de
  String) y su longitud. En el main se creará el objeto y se le pedirá al usuario que ingrese
  una frase que puede ser una palabra o varias palabras separadas por un espacio en
  blanco y a través de los métodos set, se guardará la frase y la longitud de manera
  automática según la longitud de la frase ingresada. Deberá además implementar los
  siguientes métodos:

-a) Método mostrarVocales(), deberá contabilizar la cantidad de vocales que tiene la
     frase ingresada.

-b) Método invertirFrase(), deberá invertir la frase ingresada y mostrarla por pantalla. Por
     ejemplo: Entrada: "casa blanca", Salida: "acnalb asac".

-c) Método vecesRepetido(String letra), recibirá un carácter ingresado por el usuario y
     contabilizar cuántas veces se repite el carácter en la frase, por ejemplo:
      (Entrada: frase = "casa blanca". Salida: El carácter 'a' se repite 4 veces)

-e) Método compararLongitud(String frase), deberá comparar la longitud de la frase que
     compone la clase con otra nueva frase ingresada por el usuario.

-f) Método unirFrases(String frase), deberá unir la frase contenida en la clase Cadena
     con una nueva frase ingresada por el usuario y mostrar la frase resultante.

-g) Método reemplazar(String letra), deberá reemplazar todas las letras “a” que se
     encuentren en la frase, por algún otro carácter seleccionado por el usuario y mostrar
      la frase resultante.

-h) Método contiene(String letra), deberá comprobar si la frase contiene una letra que
     ingresa el usuario y devuelve verdadero si la contiene y falso si no.
 */
package egg.poojavaejer8;

import Entity.Cadena;
import Service.ServiceCadena;
import java.util.Scanner;

public class PooJavaEjer8 {

    public static void main(String[] args) {

        Scanner leer = new Scanner(System.in);
        ServiceCadena SC = new ServiceCadena();
        Cadena C1 = SC.crearCadena();
        int opc;
        
        C1.getFrase();
        C1.getLongitud();

        do {
            System.out.println();
            System.out.println("Ingrese que desea hacer");
            System.out.println("1- Mostrar vocales");
            System.out.println("2- Invertir frase");
            System.out.println("3- Ingresar caracter y ver cuantas veces se repite");
            System.out.println("4- Comparar longitud con otra frase ingresada");
            System.out.println("5- Unir frase ingresada con la frase ya ingresada");
            System.out.println("6- Reemplazar la letra a con otro caracter ingresado");
            System.out.println("7- Revisar si la frase contiene el caracter ingresado");
            System.out.println("8- SALIR");
            opc = leer.nextInt();

            switch (opc) {
                case 1:
                    SC.mostrarVocales(C1);
                    System.out.println();
                    break;
                case 2:
                    SC.invertirFrase(C1);
                    System.out.println();
                    break;
                case 3:
                    SC.vecesRepetido(C1);
                    System.out.println();
                    break;
                case 4:
                    SC.compararLongitud(C1);
                    System.out.println();
                    break;
                case 5:
                    SC.unirFrases(C1);
                    System.out.println();
                    break;
                case 6:
                    SC.reemplazar(C1);
                    System.out.println();
                    break;
                case 7:
                    SC.contiene(C1);
                    System.out.println();
                    break;
                default:
                    System.out.println("Número ingresado no valido...");
              }
            } while (opc != 8);
    }
}