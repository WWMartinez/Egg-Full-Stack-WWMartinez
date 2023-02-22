/* 
 Crear una clase Rectángulo que modele rectángulos por medio de un atributo privado
 base y un atributo privado altura. La clase incluirá un método para crear el rectángulo
 con los datos del Rectángulo dados por el usuario. También incluirá un método para
 calcular la superficie del rectángulo y un método para calcular el perímetro del
 rectángulo. Por último, tendremos un método que dibujará el rectángulo mediante
 asteriscos usando la base y la altura. Se deberán además definir los métodos getters,
 setters y constructores correspondientes.
 Superficie = base * altura / Perímetro = (base + altura) * 2. 
 */
package Service;

import Entity.Rectangulo;
import java.util.Scanner;

public class RectaService {

    Scanner leer = new Scanner(System.in);

    //Creo el rectangulo
    public Rectangulo crearRectangulo() {
        Rectangulo R1 = new Rectangulo();
        do {
            System.out.println("Ingrese la base y altura del rectángulo a construir");
            System.out.println("Base: ");
            R1.setBase(leer.nextInt());
            System.out.println("Altura: ");
            R1.setAltura(leer.nextInt());
            if (R1.getBase() <= 0 || R1.getAltura() <= 0) {
                System.out.println("Los valores ingresador no son válidos...");
                System.out.println("Intente de nuevo");
            }
        } while (R1.getBase() <= 0 || R1.getAltura() <= 0);
        return R1;
    }

    //Área del rectángulo
    public void calcularArea(Rectangulo R1) {
        int area = R1.getBase() * R1.getAltura();
        System.out.println("El área del rectángulo creado es: " + area);
    }

    //Perímetro
    public void calcularPerimetro(Rectangulo R1) {
        int perimetro = 2 * (R1.getBase() + R1.getAltura());
        System.out.println("El perímetro del rectángulo creado es: " + perimetro);
    }

    //Imprimo el Rectángulo
    public void imprRectangulo(Rectangulo R1) {
        for (int i = 0; i < R1.getAltura(); i++) {
            for (int j = 0; j < R1.getBase(); j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
