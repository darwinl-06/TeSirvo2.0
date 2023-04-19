package model;

public class Facturador {

    private IConsultaStrategy estrategia;

    public Facturador(IConsultaStrategy estrategia) {
        this.estrategia = estrategia;
    }

    public void establecerEstrategia(IConsultaStrategy estrategia) {
        this.estrategia = estrategia;
    }

    public void ejecutarConsulta() {
        this.estrategia.ejecutarConsulta();

    }
}
