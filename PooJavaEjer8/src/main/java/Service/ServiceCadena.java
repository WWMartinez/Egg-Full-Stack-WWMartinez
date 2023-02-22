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
package Service;

import Entity.Cadena;
import java.util.Scanner;

public class ServiceCadena {

    Scanner leer = new Scanner(System.in);

    public Cadena crearCadena() {
        Cadena C1 = new Cadena();
        System.out.println("Ingrese la frase: ");
        C1.setFrase(leer.next());
        return C1;
    }

    public void longi(Cadena C1) {
        int longidefrase = C1.getFrase().length();
        System.out.println(longidefrase);
    }

    public void mostrarVocales(Cadena C1) {
        int cont2 = 0;
        for (int i = 0; i < C1.getFrase().length(); i++) {
            if ((C1.getFrase().charAt(i) == 'a') || (C1.getFrase().charAt(i) == 'e')
                    || (C1.getFrase().charAt(i) == 'i') || (C1.getFrase().charAt(i) == 'o')
                    || (C1.getFrase().charAt(i) == 'u')) {
                cont2++;
            }
        }
        System.out.println("Total de Vocales encontradas dentro de la frase ingresada es: " + cont2);
    }

    public void invertirFrase(Cadena C1) {
     char []invertir = C1.getFrase().toCharArray();
     int cont;
        for (cont = C1.getFrase().length()-1; cont >= 0; cont--) {
            System.out.println("" + invertir[cont]);
        }
        System.out.println("\n" + C1.getFrase());
    }
    
    public void vecesRepetido(Cadena C1) {
     char []Arraycadena;
     char caracter;
     int cont = 0;
      Arraycadena = C1.getFrase().toCharArray();
        for (int i = 0; i < Arraycadena.length; i++) {
            caracter = Arraycadena[i];
            for (int j = 0; j < Arraycadena.length; j++) {
                if (Arraycadena[j] == caracter) {
                cont++;
                }
            }
            System.out.println(Arraycadena[i] + " " + cont);
            cont = 0;
        }
    }
    
    public void compararLongitud(Cadena C1) {
        System.out.println("Ingrese la frase para comparar su Longitud: ");
         String fraseNew = leer.next();
        if (C1.getFrase().length() == fraseNew.length()) {
            System.out.println("Las cadenas tienen la misma Longitud");
        } else {
            System.out.println("Las cadenas NO tienen la misma Longitud");
        }
    }
    
    public void unirFrases(Cadena C1) {
        System.out.println("Ingrese la frase que desea unir a la frase ya ingresada: ");
         String fraseNew = leer.next();
          String fraseTotal = C1.getFrase().concat(" " + fraseNew);
           System.out.println("La frase ingresada ahora es: ");
           System.out.println(fraseTotal);
    }
    
    public void reemplazar(Cadena C1) {
        String cadenaFrase = C1.getFrase();
        StringBuilder newCadena = new StringBuilder(cadenaFrase);
        System.out.println("Ingrese el caracter con el que desea reemplazar el caracter a");
        String carac = leer.next();
        char ch = carac.charAt(0);
        newCadena.setCharAt('a', ch);
        cadenaFrase = newCadena.toString();
        System.out.println("Frase con los caracteres reemplazados: ");
        System.out.println("" + cadenaFrase);
    }
    
    public void contiene(Cadena C1) {
        System.out.println("Ingrese la letra que desea comprobar si se encuentra en la frase ingresada: ");
        String subcadena = leer.next();
          if(C1.getFrase().contains(subcadena)) {
            System.out.println("True...");
             } else {
              System.out.println("False...");
            }
    }
    
}
