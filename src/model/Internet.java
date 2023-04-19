package model;

public class Internet extends ServicioPublico {

    protected int cantidadConsumoIncluido;
    protected int cantidadConsumoConsumido;


    public Internet(String codigoContrato, String direccionInstalacion, String fechaInstalacion,
                    String fechaFacturacion, EstadoServicio activo, int cantidadConsumoIncluido, int cantidadConsumoConsumido) {

        super(codigoContrato, direccionInstalacion, fechaInstalacion, fechaFacturacion, activo);
        this.cantidadConsumoIncluido = cantidadConsumoIncluido;
        this.cantidadConsumoConsumido = cantidadConsumoConsumido;
    }
    public Internet(){

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
                "cantidadConsumoIncluido=" + cantidadConsumoIncluido +
                ", cantidadConsumoConsumido=" + cantidadConsumoConsumido +
                '}';
    }
}
