package model;
// Constructor concreto para construir paquetes de servicios
public class ServicePackageBuilder implements Builder{

    public ServicePackageBuilder() {}

    @Override
    public Servicio construirServicio(String tipoServicio, String id, String codigoContrato, String direccionInstalacion, String fechaInstalacion, String fechaFacturacion, EstadoServicio estado, String codigoMedidor, int contadorActual, int contadorAnterior, TipoPlan tipoContrato, int cantidadConsumoIncluido, int cantidadConsumoConsumido, int minutosLocalesIncluidos, int minutosLocalesConsumidos, int minutosLargaDistanciaIncluidos, int minutosLargaDistanciaConsumidos) {

        return new ServicioFactory().crearServicio(tipoServicio, id, codigoContrato, direccionInstalacion, fechaInstalacion,
                fechaFacturacion, estado, codigoMedidor, contadorActual, contadorAnterior, tipoContrato, cantidadConsumoIncluido,
                cantidadConsumoConsumido, minutosLocalesIncluidos, minutosLocalesConsumidos, minutosLargaDistanciaIncluidos, minutosLargaDistanciaConsumidos);

    }
}
