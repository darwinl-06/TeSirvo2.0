package model;

public class SuperEnergy  implements  IPlanComercial{


    @Override
    public void sellPlanComercial(Cliente cliente,PlanComercial planComercial) {

        Servicio energia=new Energia(cliente.getCodigoContrato(),"cr87","12-07-2024","12-06-2024","12-12-12",EstadoServicio.ACTIVO,"1231231",4234,242);

        Contrato contrato=new Contrato("123",planComercial);

        contrato.addService(energia);
        cliente.setContrato(contrato);
    }



}
