/*
  Declarar una clase llamada Circunferencia que tenga como atributo privado el radio de
   tipo real. A continuación, se deben crear los siguientes métodos:
 - a) Método constructor que inicialice el radio pasado como parámetro.
 - b) Métodos get y set para el atributo radio de la clase Circunferencia.
 - c) Método para crearCircunferencia(): que le pide el radio y lo guarda en el atributo del
      objeto.
 - d) Método area(): para calcular el área de la circunferencia (area = pi * (radio*radio)).
 - e) Método perimetro(): para calcular el perímetro (perimetro = 2 * pi * radio).
 
*/

package egg.poojavaejer2;

import Entidades.Circunferencia;
import Service.CircunferenciaService;

public class POOJavaEjer2 {

    public static void main(String[] args) {
        
        CircunferenciaService CS1 = new CircunferenciaService();
        Circunferencia EC1 = CS1.crearCircunferencia();
        
        System.out.println();
        
        CS1.area(EC1);
        CS1.perimetro(EC1);
        
    }
}
