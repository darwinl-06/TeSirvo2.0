package model;

public interface Builder {

    public Servicio construirServicio(

            String tipoServicio,
            String id,
            String codigoContrato,
            String direccionInstalacion,
            String fechaInstalacion,
            String fechaFacturacion,
            EstadoServicio estado,
            String codigoMedidor,
            int contadorActual,
            int contadorAnterior,
            TipoPlan tipoContrato,
            int cantidadConsumoIncluido,
            int cantidadConsumoConsumido,
            int minutosLocalesIncluidos,
            int minutosLocalesConsumidos,
            int minutosLargaDistanciaIncluidos,
            int minutosLargaDistanciaConsumidos
    );

    public Contrato construirContrato (String id, PlanComercial plan);
}
