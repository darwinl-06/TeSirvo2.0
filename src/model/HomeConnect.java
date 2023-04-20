package model;

public class HomeConnect implements  IPlanComercial {


    @Override
    public void sellPlanComercial(Cliente cliente, PlanComercial planComercial) {

        Servicio telefonia = new Telefonia("123", cliente.getCodigoContrato(), "12-12-12", "12-12-12", "12-12-12", EstadoServicio.ACTIVO, TipoPlan.LIMITADO, 12, 12, 12, 12);
        Servicio internet = new Internet("123", "123", cliente.getCodigoContrato(), "12-12-12", "12-12-12", EstadoServicio.ACTIVO, 12, 12);

        Contrato contrato = new Contrato("123", planComercial);
        contrato.addService(telefonia);
        contrato.addService(internet);
        cliente.setContrato(contrato);


    }



}
