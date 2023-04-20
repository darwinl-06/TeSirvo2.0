package model;

import java.util.ArrayList;
import java.util.List;

public class ContenedoraGeneral {

    ContenedoraGeneral contenedoraGeneral = new ContenedoraGeneral();
    private ServicePackageBuilder servicePackageBuilder;
    private ArrayList<Cliente> clients;


    public ContenedoraGeneral(){

        clients = new ArrayList<>();
        servicePackageBuilder = new ServicePackageBuilder();
    }

    public void createClient(String nombre, String identificacion, String fechaRegistro, String codigoContrato, String direccionFacturacion,
                             String telefonoContacto, String email, EstadoCliente estado) {

        Cliente cliente = new Cliente(nombre, identificacion, fechaRegistro, codigoContrato, direccionFacturacion, telefonoContacto, email, estado);
        contenedoraGeneral.getClients().add(cliente);
    }

    public void createService(String tipoServicio, String id, String codigoContrato, String direccionInstalacion, String fechaInstalacion,
                              String fechaFacturacion, EstadoServicio estado, String codigoMedidor, int contadorActual, int contadorAnterior,
                              TipoPlan tipoContrato, int cantidadConsumoIncluido, int cantidadConsumoConsumido, int minutosLocalesIncluidos, int minutosLocalesConsumidos,
                              int minutosLargaDistanciaIncluidos, int minutosLargaDistanciaConsumidos) {

        Servicio servicio = contenedoraGeneral.getServicePackageBuilder().construirServicio(tipoServicio, id, codigoContrato, direccionInstalacion, fechaInstalacion,
                fechaFacturacion, estado, codigoMedidor, contadorActual, contadorAnterior, tipoContrato, cantidadConsumoIncluido,
                cantidadConsumoConsumido, minutosLocalesIncluidos, minutosLocalesConsumidos, minutosLargaDistanciaIncluidos, minutosLargaDistanciaConsumidos);

    }

    public ArrayList<Cliente> getClients() {
        return clients;
    }

    public void setClients(ArrayList<Cliente> clients) {
        this.clients = clients;
    }

    public ServicePackageBuilder getServicePackageBuilder() {
        return servicePackageBuilder;
    }


}
