package ui;

import model.*;



public class Main {
    public static void main(String[] args) {

        ContenedoraGeneral controller = new ContenedoraGeneral();

        controller.createService("1", "1", "WATER", "Sur", "20/04/2023",
                "20/03/2023", EstadoServicio.ACTIVO, "100", 72000, 0,
                TipoPlan.ILIMITADO, 63, 0, 0, 0,
                0, 0);

        controller.createClient("Messi","1109114877", "01/05/2004", "123",
                "Norte","123432","correo", EstadoCliente.POTENCIAL);


        System.out.println("-----------------------------------------------------------------------------------------");
        Facturador facturador = new Facturador(new ConsultaClientesFac());
        facturador.ejecutarConsulta();

        System.out.println("-----------------------------------------------------------------------------------------");

        facturador.establecerEstrategia(new ConsultaClientesPA());
        facturador.ejecutarConsulta();

        System.out.println("-----------------------------------------------------------------------------------------");

        facturador.establecerEstrategia(new ConsultaPA());
        facturador.ejecutarConsulta();
        System.out.println("-----------------------------------------------------------------------------------------");

    }

}