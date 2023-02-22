/*
  Realizar una clase llamada Cuenta (bancaria) que debe tener como mínimo los atributos:
  numeroCuenta (entero), el DNI del cliente (entero largo) y el saldo actual (entero).
  Las operaciones asociadas a dicha clase son:
- a) Constructor por defecto y constructor con DNI, saldo, número de cuenta e interés.
- b) Agregar los métodos getters y setters correspondientes
- c) Metodo para crear un objeto Cuenta, pidiéndole los datos al usuario.
- d) Método ingresar(double ingreso): el método recibe una cantidad de dinero a ingresar
      y se la sumara a saldo actual.
- e) Método retirar(double retiro): el método recibe una cantidad de dinero a retirar y se
      la restará al saldo actual. Si la cuenta no tiene la cantidad de dinero a retirar, se
       pondrá el saldo actual en 0.
- f) Método extraccionRapida(): le permitirá sacar solo un 20% de su saldo. Validar que el
      usuario no saque más del 20%.
- g) Método consultarSaldo(): permitirá consultar el saldo disponible en la cuenta.
- h) Método consultarDatos(): permitirá mostrar todos los datos de la cuenta
 */
package egg.poojavaejer5;

import Entity.CuentaBancaria;
import Service.CuentaService;
import java.util.Scanner;

public class POOJavaEjer5 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        //Se Crea una objeto mediante la clase servicioCuenta
        CuentaService AU = new CuentaService();
        //Se crea una cuenta mediante la clase cuenta y se le asigna los valores del objeto antes creado
        CuentaBancaria C1 = AU.crearCuenta();
        //Varible que hace de salida y entrada para el bucle Menu
        boolean Salir = true;
        do {
            System.out.println("---------------------------");
            System.out.println("¿Que deseas Realizar?");
            System.out.println("1-Ingreso");
            System.out.println("2-Retiro");
            System.out.println("3-Retiro Rapido");
            System.out.println("4-Consultar Datos y Saldo");
            System.out.println("5-Salir");
            System.out.println("---------------------------");
            int var = leer.nextInt();
            switch (var) {
                case 1:
                    System.out.println("Indique cuanto desea Ingresar");
                    int ingreso = leer.nextInt();
                    AU.ingresar(ingreso, C1);
                    break;
                case 2:
                    System.out.println("Indique cuanto desea Retirar");
                    int retiro = leer.nextInt();
                    AU.retirar(retiro, C1);
                    break;
                case 3:
                    System.out.println("Indique cuanto desea Retirar(No se puede retirar mas del 20%)");
                    int Rapido = leer.nextInt();
                    AU.extraccionRapida(Rapido, C1);
                    break;
                case 4:
                    System.out.println("Los Datos Ingresados Son:");
                    AU.consultarDatos(C1);
                    System.out.println("***************************");
                    AU.consultarSaldo(C1);
                    break;
                case 5:
                    System.out.println("¿Esta Seguro de Salir?(S/N)");
                    String letra = leer.next();
                    if (letra.equals("S")) {
                        Salir = false;
                    }
                    break;
            }
        } while (Salir);
    }
}
