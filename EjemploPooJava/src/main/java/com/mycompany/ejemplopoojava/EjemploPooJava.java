package com.mycompany.ejemplopoojava;

import Entity.Vendedor;
import Service.VendedorService;

public class EjemploPooJava {

    public static void main(String[] args) {

        VendedorService vs = new VendedorService();
        Vendedor v1 = vs.altaVendedor();
        vs.sueldoMensual(v1);
        vs.vacaciones(v1);

    }
}
