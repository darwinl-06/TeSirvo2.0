package model;

import java.util.List;

public class ConsultaPA implements IConsultaStrategy {

    public void ejecutarConsulta() {

        ContenedoraGeneral container = new ContenedoraGeneral();
        List<Cliente> clientes = container.getClients();

        for (Cliente cliente: clientes) {
            System.out.println("Plan comercial: " + cliente.getNombre());
            System.out.println("Plan comercial: " + cliente.getContrato().getPlan().toString());
        }

    }
}
