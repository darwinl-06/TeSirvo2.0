package model;

import java.util.ArrayList;
import java.util.List;

public class ContenedoraGeneral {

    ContenedoraGeneral contenedoraGeneral = new ContenedoraGeneral();
    private ArrayList<Cliente> clients;


    public ContenedoraGeneral(){

        clients = new ArrayList<>();
    }

    public void createClient (String nombre, String identificacion, String fechaRegistro, String codigoContrato, String direccionFacturacion,
                                       String telefonoContacto, String email, EstadoCliente estado) {

        Cliente cliente = new Cliente(nombre, identificacion, fechaRegistro, codigoContrato, direccionFacturacion, telefonoContacto, email, estado);
        contenedoraGeneral.getClients().add(cliente);
    }

    public ArrayList<Cliente> getClients() {
        return clients;
    }

    public void setClients(ArrayList<Cliente> clients) {
        this.clients = clients;
    }


}
