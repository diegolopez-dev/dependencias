package com.diegodev.dependencias;

import com.diegodev.dependencias.dependencias.ServicioEnvio;
import com.diegodev.dependencias.dependencias.ServicioPDF;

public class ServicioImpresion {

    ServicioEnvio servicioEnvio;
    ServicioPDF servicioPDF;

    public ServicioImpresion(ServicioEnvio servicioEnvio, ServicioPDF servicioPDF) {
        this.servicioEnvio = new ServicioEnvio();
        this.servicioPDF = new ServicioPDF();
    }

    public void imprimir() {
        servicioEnvio.envio();
        servicioPDF.pdf();
    }

}
