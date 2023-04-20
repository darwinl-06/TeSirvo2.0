package model;

public class Internet extends Servicio {

    protected int cantidadConsumoIncluido;
    protected int cantidadConsumoConsumido;

    public Internet(String id, String codigoContrato, String direccionInstalacion, String fechaInstalacion,
                    String fechaFacturacion, EstadoServicio activo, int cantidadConsumoIncluido, int cantidadConsumoConsumido) {

        super(id, codigoContrato, direccionInstalacion, fechaInstalacion, fechaFacturacion, activo);
        this.cantidadConsumoIncluido = cantidadConsumoIncluido;
        this.cantidadConsumoConsumido = cantidadConsumoConsumido;
    }

    public int getCantidadConsumoIncluido() {
        return cantidadConsumoIncluido;
    }

    public void setCantidadConsumoIncluido(int cantidadConsumoIncluido) {
        this.cantidadConsumoIncluido = cantidadConsumoIncluido;
    }

    public int getCantidadConsumoConsumido() {
        return cantidadConsumoConsumido;
    }

    public void setCantidadConsumoConsumido(int cantidadConsumoConsumido) {
        this.cantidadConsumoConsumido = cantidadConsumoConsumido;
    }

    @Override
    public String toString() {
        return "Internet{" +
                "cantidadConsumoIncluido=" + cantidadConsumoIncluido + '\''+
                ", cantidadConsumoConsumido=" + cantidadConsumoConsumido;
    }
}
