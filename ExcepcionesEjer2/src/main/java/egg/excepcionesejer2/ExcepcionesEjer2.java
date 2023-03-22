/*
    Definir una Clase que contenga algún tipo de dato de tipo array y agregue el código para
    generar y capturar una excepción ArrayIndexOutOfBoundsException (índice de arreglo fuera
    de rango).
 */
package egg.excepcionesejer2;

import Entity.Arreglo;

public class ExcepcionesEjer2 {

    public static void main(String[] args) {

        Arreglo arreglo = new Arreglo();
        try {
            arreglo.llenarNombres();
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Se ha salido del rango del arreglo\n");
        }
    }
}
