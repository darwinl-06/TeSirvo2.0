package model;

import java.util.ArrayList;
import java.util.List;

public class ConsultaPA implements IConsultaStrategy {

    public void ejecutarConsulta(ArrayList<Cliente> clientes) {

        for (Cliente cliente: clientes) {
            System.out.println("Plan comercial: " + cliente.getContrato().getPlan().toString());
        }
    }
}
