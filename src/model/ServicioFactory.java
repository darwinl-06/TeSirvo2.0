package model;

public class ServicioFactory {

    public Servicio crearServicio(String tipoServicio, String id, String codigoContrato, String direccionInstalacion, String fechaInstalacion,
                                  String fechaFacturacion, EstadoServicio estado, String codigoMedidor, int contadorActual, int contadorAnterior, TipoPlan tipoContrato, int cantidadConsumoIncluido,
                                  int cantidadConsumoConsumido, int minutosLocalesIncluidos, int minutosLocalesConsumidos, int minutosLargaDistanciaIncluidos, int minutosLargaDistanciaConsumidos) {

        if (tipoServicio.equalsIgnoreCase("Agua")) {
            return new Agua(id,  codigoContrato,  direccionInstalacion,
                     fechaInstalacion, fechaFacturacion,  estado, codigoMedidor,  contadorActual,  contadorAnterior);

        } else if (tipoServicio.equalsIgnoreCase("Gas")) {
            return new Gas(id,  codigoContrato,  direccionInstalacion,
                    fechaInstalacion, fechaFacturacion,  estado, codigoMedidor,  contadorActual,  contadorAnterior);

        } else if (tipoServicio.equalsIgnoreCase("Energia")) {
            return new Energia(id,  codigoContrato,  direccionInstalacion,
                    fechaInstalacion, fechaFacturacion,  estado, codigoMedidor,  contadorActual,  contadorAnterior);

        } else if (tipoServicio.equalsIgnoreCase("Telefonía")) {
            return new Telefonia( id, codigoContrato, direccionInstalacion, fechaInstalacion, fechaFacturacion, estado,tipoContrato,
                    minutosLocalesIncluidos, minutosLocalesConsumidos, minutosLargaDistanciaIncluidos, minutosLargaDistanciaConsumidos);

        } else if (tipoServicio.equalsIgnoreCase("Internet")) {
            return new Internet(id, codigoContrato, direccionInstalacion, fechaInstalacion,
                    fechaFacturacion, estado, cantidadConsumoIncluido, cantidadConsumoConsumido);
        } else {
            return null;
        }
    }
}
