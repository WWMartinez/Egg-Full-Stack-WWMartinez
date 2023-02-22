/*
 Crear una clase llamada Libro que contenga los siguientes atributos: ISBN, Título, Autor,
 Número de páginas, y un constructor con todos los atributos pasados por parámetro y un
 constructor vacío. Crear un método para cargar un libro pidiendo los datos al usuario y
 luego informar mediante otro método el número de ISBN, el título, el autor del libro y el
 numero de páginas.
 */
package com.mycompany.poojavaejer1;

import Services.ServicioUsuarioLibro;
import entidades.Libros;
import entidades.Usuario;

public class POOJavaEjer1 {

    public static void main(String[] args) {

        ServicioUsuarioLibro sul = new ServicioUsuarioLibro();

        System.out.println("Crear usuario ");
        Usuario usuario1 = sul.crearUsuario();

        System.out.println();

        System.out.println("Ingrese los datos del libro: ");
        Libros libro1 = sul.crearLibro();

        System.out.println();
        System.out.println(usuario1);

        System.out.println(libro1);

    }

}
