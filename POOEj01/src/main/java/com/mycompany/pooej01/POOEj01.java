package com.mycompany.pooej01;

import Entidad.Persona;
import java.util.Scanner;

public class POOEj01 {

    public static void main(String[] args) {
        
        Scanner leer = new Scanner(System.in);
        
        // Solicito al usuario los datos...
        System.out.println("Ingrese su Nombre, Apellido, Edad, y País de origen: ");
          Persona per1 = new Persona(leer.next(), leer.next(), leer.nextInt(), leer.next());
          
        // Imprimo la clase Persona
        System.out.println(per1);
        
    }
}
