package model;

import java.util.ArrayList;

public class Facturador {

    private IConsultaStrategy estrategia;

    public Facturador(IConsultaStrategy estrategia) {
        this.estrategia = estrategia;
    }

    public void establecerEstrategia(IConsultaStrategy estrategia) {
        this.estrategia = estrategia;
    }

    public void ejecutarConsulta(ArrayList<Cliente> cliente) {
        this.estrategia.ejecutarConsulta(cliente);

    }
}
