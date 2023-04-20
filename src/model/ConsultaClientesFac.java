package model;

import java.util.ArrayList;
import java.util.List;

public class ConsultaClientesFac implements IConsultaStrategy {

    public void ejecutarConsulta(ArrayList<Cliente> clientes) {


        for (Cliente cliente : clientes) {
            System.out.println("Cliente: " + cliente.getNombre());
            List<Servicio> serviciosActivos = cliente.getContrato().getServices();
            for (Servicio servicio : serviciosActivos) {
                System.out.println("Servicio activo: " + servicio.toString());
            }
        }
    }
}
