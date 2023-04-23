package ui;

import model.*;



public class Main {

    private static ContenedoraGeneral controller;
    private static PlanControler planControler= new PlanControler();

    public static void init() {

        controller = new ContenedoraGeneral();
        planControler= new PlanControler();
    }

    public static void main(String[] args) {


        init();
        crearClientes();
        crearServicios();
        crearPlan();

        System.out.println("-------------------------------------Clientes---------------------------------------------");
        System.out.println(controller.getClients().toString());

        System.out.println("-------------------------------------Servicios--------------------------------------------");
        System.out.println(controller.getClients().get(1).getContrato().getServices());

        System.out.println("--------------------------------------Planes----------------------------------------------");
        System.out.println(controller.getClients().get(1).getContrato().getPlan().toString());


        System.out.println("------------------------------------Contratos---------------------------------------------");
        System.out.println(controller.getClients().get(1).printContract());

        System.out.println("-------------------------------------Facturas---------------------------------------------");
        System.out.println("--------------------------------Clientes a facturar---------------------------------------");
        Facturador facturador = new Facturador(new ConsultaClientesFac());
        facturador.ejecutarConsulta(controller.getClients());

        System.out.println("-----------------------------------Clientes PA--------------------------------------------");
        facturador.establecerEstrategia(new ConsultaClientesPA());
        facturador.ejecutarConsulta(controller.getClients());

        System.out.println("---------------------------------Planes Activos-------------------------------------------");
        facturador.establecerEstrategia(new ConsultaPA());
        facturador.ejecutarConsulta(controller.getClients());


    }

    public static void crearClientes() {

        controller.createClient("Darwin","34", "01/08", "76",
                "Sur","3333","correo", EstadoCliente.POTENCIAL);

        controller.createClient("Mydick","56", "23/11", "54",
                "Este","2222","correo", EstadoCliente.POTENCIAL);

        controller.createClient("Ozzzzzzzza","78", "06/01", "32",
                "Oeste","1111","correo", EstadoCliente.POTENCIAL);
    }

    public static void crearServicios() {

        controller.createService("1", "1", "AGUA", "Sur", "01/08",
                "23/11", EstadoServicio.ACTIVO, "100", 4000, 0,
                TipoPlan.ILIMITADO, 1, 0, 0, 0,
                0, 0);

        controller.createService("1", "1", "ENERGIA", "Norte", "01/08",
                "23/11", EstadoServicio.ACTIVO, "100", 3000, 0,
                TipoPlan.ILIMITADO, 2, 0, 0, 0,
                0, 0);

        controller.createService("1", "1", "TELEFONIA", "Este", "01/08",
                "23/11", EstadoServicio.ACTIVO, "100", 2000, 0,
                TipoPlan.ILIMITADO, 3, 0, 0, 0,
                0, 0);

        controller.createService("1", "1", "INTERNET", "Oeste", "01/08",
                "23/11", EstadoServicio.ACTIVO, "100", 1000, 0,
                TipoPlan.ILIMITADO, 4, 0, 0, 0,
                0, 0);

    }

    public static void crearPlan () {
        planControler.sellPlancomercial(controller.getClients().get(0),"HomeService");
        planControler.sellPlancomercial(controller.getClients().get(1),"HomeConnect");
        planControler.sellPlancomercial(controller.getClients().get(2),"SuperEnergy");
    }

    public static void createContratToClient(){

    }

}