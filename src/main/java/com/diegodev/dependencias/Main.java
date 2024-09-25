package com.diegodev.dependencias;

import com.diegodev.dependencias.dependencias.ServicioEnvio;
import com.diegodev.dependencias.dependencias.ServicioPDF;

public class Main {
    public static void main(String[] args) {
        ServicioImpresion servicioImpresion = new ServicioImpresion(new ServicioEnvio(), new
                ServicioPDF());
        servicioImpresion.imprimir();
    }
}