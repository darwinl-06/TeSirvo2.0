package model;

import java.util.ArrayList;
import java.util.List;

public class ConsultaClientesPA implements IConsultaStrategy {

    public void ejecutarConsulta(ArrayList<Cliente> clientes) {


        for (Cliente cliente : clientes) {
            System.out.println("Cliente: " + cliente.getNombre());
            List<Servicio> serviciosActivos = cliente.getContrato().getServices();
            System.out.println("Servicio activo: " + cliente.getContrato().getPlan().toString());

        }
    }
}
