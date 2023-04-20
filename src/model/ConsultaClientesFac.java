package model;

import java.util.ArrayList;
import java.util.List;

public class ConsultaClientesFac implements IConsultaStrategy {

    public void ejecutarConsulta() {

        List<Cliente> clientes = obtenerClientesActivos();

        for (Cliente cliente : clientes) {
            System.out.println("Cliente: " + cliente.getNombre());
            List<Servicio> serviciosActivos = cliente.getContrato().getServices();
            for (Servicio servicio : serviciosActivos) {
                System.out.println("Servicio activo: " + servicio.toString());
            }
        }
    }

    private List<Cliente> obtenerClientesActivos() {

        ContenedoraGeneral clientes = new ContenedoraGeneral();

        List<Cliente> clientesAFacturar = new ArrayList<>();

        List<Cliente> todosLosClientes = clientes.getClients();

        for (Cliente cliente : todosLosClientes) {
            List<Servicio> serviciosActivos = cliente.getContrato().getServices();
            List<Servicio> serviciosAFacturar = new ArrayList<>();
            for (Servicio servicio : serviciosActivos) {
                serviciosAFacturar.add(servicio);
            }
            if (!serviciosAFacturar.isEmpty()) {
                clientesAFacturar.add(cliente);
            }
        }
        return clientesAFacturar;
    }

}
