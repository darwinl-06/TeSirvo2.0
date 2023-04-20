package model;

public class HomeService implements  IPlanComercial{


    @Override
    public void sellPlanComercial(Cliente cliente,PlanComercial planComercial) {

        Servicio agua= new Agua("123",cliente.getCodigoContrato(),"12-12-12","12-12-12","12-12-12",EstadoServicio.ACTIVO,"1231231",4234,242);
        Servicio gas= new Gas("123",cliente.getCodigoContrato(),"12-12-12","12-12-12","12-12-12",EstadoServicio.ACTIVO,"1231231",4234,242);
        Servicio energia= new Energia("123",cliente.getCodigoContrato(),"12-12-12","12-12-12","12-12-12",EstadoServicio.ACTIVO,"1231231",4234,242);

        Contrato contrato=new Contrato("123",planComercial);
        contrato.addService(agua);
        contrato.addService(gas);
        contrato.addService(energia);

        cliente.setContrato(contrato);
    }



}
