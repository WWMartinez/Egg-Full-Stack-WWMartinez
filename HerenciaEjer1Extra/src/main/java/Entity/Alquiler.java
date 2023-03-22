/*
    En un puerto se alquilan amarres para barcos de distinto tipo. Para cada Alquiler se guarda: el
    nombre, documento del cliente, la fecha de alquiler, fecha de devolución, la posición del
    amarre y el barco que lo ocupará.
    Un Barco se caracteriza por: su matrícula, su eslora en metros y año de fabricación.
    Sin embargo, se pretende diferenciar la información de algunos tipos de barcos especiales:
    
    • Número de mástiles para veleros.
    • Potencia en CV para barcos a motor.
    • Potencia en CV y número de camarotes para yates de lujo.

    Un alquiler se calcula multiplicando el número de días de ocupación (calculado con la fecha de
    alquiler y devolución), por un valor módulo de cada barco (obtenido simplemente
    multiplicando por 10 los metros de eslora).

    En los barcos de tipo especial el módulo de cada barco se calcula sacando el módulo normal y
    sumándole el atributo particular de cada barco. En los veleros se suma el número de mástiles,
    en los barcos a motor se le suma la potencia en CV y en los yates se suma la potencia en CV y
    el número de camarotes.

    Utilizando la herencia de forma apropiada, deberemos programar en Java, las clases y los
    métodos necesarios que permitan al usuario elegir el barco que quiera alquilar y mostrarle el
    precio final de su alquiler.
 */
package Entity;

import Service.ServiceCliente;
import Service.ServiceVelero;
import Service.ServiceYate;
import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.Locale;
import java.util.Scanner;

public class Alquiler {

    private Cliente cliente;
    private LocalDate fechaAlquiler;
    private LocalDate fechaDevolucion;
    private int posicionAmarre;
    private Barco barco;
    private final Scanner leer = new Scanner(System.in).useDelimiter("\n").useLocale(Locale.US);

    public Alquiler() {

    }

    public Alquiler(Cliente cliente, LocalDate fechaAlquiler, LocalDate fechaDevolucion, int posicionAmarre, Barco barco) {
        this.cliente = cliente;
        this.fechaAlquiler = fechaAlquiler;
        this.fechaDevolucion = fechaDevolucion;
        this.posicionAmarre = posicionAmarre;
        this.barco = barco;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public LocalDate getFechaAlquiler() {
        return fechaAlquiler;
    }

    public void setFechaAlquiler(LocalDate fechaAlquiler) {
        this.fechaAlquiler = fechaAlquiler;
    }

    public LocalDate getFechaDevolucion() {
        return fechaDevolucion;
    }

    public void setFechaDevolucion(LocalDate fechaDevolucion) {
        this.fechaDevolucion = fechaDevolucion;
    }

    public int getPosicionAmarre() {
        return posicionAmarre;
    }

    public void setPosicionAmarre(int posicionAmarre) {
        this.posicionAmarre = posicionAmarre;
    }

    public Barco getBarco() {
        return barco;
    }

    public void setBarco(Barco barco) {
        this.barco = barco;
    }

    public Alquiler crearAlquiler() {

        Alquiler alquiler = new Alquiler();
        System.out.println("---ALQUILER---");

        // Creamos el Cliente
        ServiceCliente servicioCliente = new ServiceCliente();
        System.out.println("Datos del Cliente: ");
        alquiler.setCliente(servicioCliente.CrearCliente());

        // Solicitamos Fecha de salida, fecha de devolucion y posicion amarre
        alquiler.setFechaAlquiler(fechaAlquiler());
        alquiler.setFechaDevolucion(fechaDevolucion());
        System.out.print("Posicion de amarre: ");
        alquiler.setPosicionAmarre(leer.nextInt());

        // Creo el barco que se alquilo en el método barcoAlquilado()
        alquiler.setBarco(barcoAlquilado());

        return alquiler;
    }

    /**
     * Se ingresa la fecha en que se comenzó a alquilar el Barco
     *
     * @return diaAlquilar
     */
    private LocalDate fechaAlquiler() {

        System.out.println("Fecha de alquiler: ");
        System.out.print("\tDia: ");
        int dia = leer.nextInt();
        System.out.print("\tMes: ");
        int mes = leer.nextInt();
        System.out.print("\tAño: ");
        int anio = leer.nextInt();

        LocalDate diaAlquiler = LocalDate.of(anio, mes, dia);
        return diaAlquiler;

    }

    private LocalDate fechaDevolucion() {

        System.out.println("Fecha de devolución: ");
        System.out.print("\tDia: ");
        int dia = leer.nextInt();
        System.out.print("\tMes: ");
        int mes = leer.nextInt();
        System.out.print("\tAño: ");
        int anio = leer.nextInt();

        LocalDate diaDevolucion = LocalDate.of(anio, mes, dia);
        return diaDevolucion;
    }

    private Barco barcoAlquilado() {
        int opc;
        do {
            System.out.println("\nElija la opción del Barco Alquilado");
            System.out.println("1- Barco sin motor ni velas");
            System.out.println("2- Barco de vela");
            System.out.println("3- Barco con Motor");
            System.out.println("4- Yate");
            opc = leer.nextInt();
        } while (opc < 1 || opc > 4);

        switch (opc) {
            case 1:
                Barco barcoAlquilado = new Barco();
                barcoAlquilado.crearBarco();
                return barcoAlquilado;
            case 2:
                ServiceVelero servicioVelero = new ServiceVelero();
                Velero velero = servicioVelero.crearVelero();
                return velero;
            case 3:
                BarcoMotor barcoMotor = new BarcoMotor();
                barcoMotor.crearBarco();
                return barcoMotor;
            case 4:
                ServiceYate servicioYate = new ServiceYate();
                Yate yate = servicioYate.crearYate();
                return yate;
        }
        return null;
    }

    public double CostoAlquiler(Barco barco) {
        if (barco instanceof Barco) {
            return diasAlquilados(this.getFechaAlquiler(), this.getFechaDevolucion()) * barco.costoAlquiler(barco);
        } else if (barco instanceof Velero) {
            Velero velero = (Velero) barco;
            return diasAlquilados(this.getFechaAlquiler(), this.getFechaDevolucion()) * velero.costoAlquiler(barco);
        } else if (barco instanceof BarcoMotor) {
            BarcoMotor barcoMotor = (BarcoMotor) barco;
            return diasAlquilados(this.getFechaAlquiler(), this.getFechaDevolucion()) * barcoMotor.costoAlquiler(barco);
        } else if (barco instanceof Yate) {
            Yate yate = (Yate) barco;
            return diasAlquilados(this.getFechaAlquiler(), this.getFechaDevolucion()) * yate.costoAlquiler(barco);
        }
        return 0;
    }

    private long diasAlquilados(LocalDate diaInicio, LocalDate diaFin) {
        return ChronoUnit.DAYS.between(diaInicio, diaFin);
    }

    @Override
    public String toString() {
        return "\nCliente: " + cliente.toString() + "\n\tFecha de Alquiler: " + fechaAlquiler.toString() + "\n\tFecha de Devolución: " + fechaDevolucion.toString()
                + "\n\tPosición de Amarre: " + posicionAmarre + "\n\tBarco: \n\t\t" + barco.toString();
    }

}
