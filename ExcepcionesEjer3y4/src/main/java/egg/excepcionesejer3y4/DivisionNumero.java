/*
3- Defina una clase llamada DivisionNumero. En el método main utilice un Scanner para leer dos
    números en forma de cadena. A continuación, utilice el método parseInt() de la clase Integer,
     para convertir las cadenas al tipo int y guardarlas en dos variables de tipo int. Por ultimo realizar
      una división con los dos numeros y mostrar el resultado.

4- Todas estas operaciones puede tirar excepciones a manejar, el ingreso por teclado puede
    causar una excepción de tipo InputMismatchException, el método Integer.parseInt() si la cadena
     no puede convertirse a entero, arroja una NumberFormatException y además, al dividir un
      número por cero surge una ArithmeticException. Manipule todas las posibles excepciones
       utilizando bloques try/catch para las distintas excepciones
 */
package egg.excepcionesejer3y4;

public class DivisionNumero {

    private String num1;
    private String num2;
    private int a;
    private int b;

    public DivisionNumero() {
    }

    public DivisionNumero(String num1, String num2) {
        this.num1 = num1;
        this.num2 = num2;
    }

    public String getNum1() {
        return num1;
    }

    public void setNum1(String num1) {
        this.num1 = num1;
    }

    public String getNum2() {
        return num2;
    }

    public void setNum2(String num2) {
        this.num2 = num2;
    }

    public void convertirCadenas() throws NumberFormatException {
        try {
            this.a = Integer.parseInt(this.getNum1());
            this.b = Integer.parseInt(this.getNum2());
        } catch (NumberFormatException e) {
            System.out.println("El/Los número/s no se puede/n convertir a entero...");
        }
    }

    public double division() throws ArithmeticException {
        try {
            return this.a / this.b;
        } catch (ArithmeticException e) {
            System.out.println("No se puede dividir por 0...");
            return -1;
        }
    }

    @Override
    public String toString() {
        return "DivisionNumero{" + "num1=" + num1 + ", num2=" + num2 + ", a=" + a + ", b=" + b + '}';
    }

}
