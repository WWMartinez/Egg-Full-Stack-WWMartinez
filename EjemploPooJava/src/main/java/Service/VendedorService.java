package Service;

import Entity.Vendedor;
import java.util.Date;
import java.util.Scanner;

public class VendedorService {

    Scanner leer = new Scanner(System.in);

    public Vendedor altaVendedor() {

        //Instancian un objeto de tipo vendedor
        Vendedor v1 = new Vendedor();
        //Lleno los atributos
        System.out.println("Ingrese el nombre del vendedor");
        v1.setNombre(leer.next());
        System.out.println("Ingrese el DNI del vendedor");
        v1.setDni(leer.nextInt());
        System.out.println("Ingrese el sueldo básico del vendedor");
        v1.setSueldoBasico(leer.nextDouble());
        System.out.println("Ingrese el día que comenzo a trabajar");
        int dia = leer.nextInt();
        System.out.println("Ingrese el mes en que comenzo a trabajar");
        int mes = leer.nextInt();
        System.out.println("Ingrese el año en que comenzo a trabajar");
        int anio = leer.nextInt();
        Date fecha = new Date(anio - 1900, mes - 1, dia);
        v1.setFechaInicio(fecha);
        return v1;
    }

    public void sueldoMensual(Vendedor v1) {
        System.out.println("Ingrese cuales fueron las ventas totales del vendedor");
        Double ventas = leer.nextDouble();
        v1.setComisiones(ventas * 0.15);
        v1.setSueldoMensual(v1.getSueldoBasico() + v1.getComisiones());
        System.out.println("El sueldo mensual del vendedor: "
                + v1.getNombre() + " es de $ " + v1.getSueldoMensual());
    }

    public void vacaciones(Vendedor v1) {
        Date hoy = new Date();
        int antiguedad = hoy.getYear() - v1.getFechaInicio().getYear();

        if (antiguedad < 5) {
            System.out.println("Le corresponden 14 días de vacaciones...");
        } else if (antiguedad < 10) {
            System.out.println("Le corresponden 21 días de vacaciones...");
        } else if (antiguedad < 20) {
            System.out.println("Le corresponen 28 días de vacaciones...");
        } else if (antiguedad > 20) {
            System.out.println("Le corresponden 35 días de vacaciones...");
        } else {
            System.out.println("El empleado tiene vacaciones proporcionales");
        }
    }

}
