package model;

public class Telefonia extends Servicio {

    private TipoPlan tipoContrato;
    private int minutosLocalesIncluidos;
    private int minutosLocalesConsumidos;
    private int minutosLargaDistanciaIncluidos;
    private int minutosLargaDistanciaConsumidos;

    public Telefonia(String id, String codigoContrato, String direccionInstalacion, String fechaInstalacion, String fechaFacturacion, EstadoServicio activo, TipoPlan tipoContrato,
                     int minutosLocalesIncluidos, int minutosLocalesConsumidos, int minutosLargaDistanciaIncluidos, int minutosLargaDistanciaConsumidos) {

        super(id, codigoContrato, direccionInstalacion, fechaInstalacion, fechaFacturacion, activo);

        this.tipoContrato = tipoContrato;
        this.minutosLocalesIncluidos = minutosLocalesIncluidos;
        this.minutosLocalesConsumidos = minutosLocalesConsumidos;
        this.minutosLargaDistanciaIncluidos = minutosLargaDistanciaIncluidos;
        this.minutosLargaDistanciaConsumidos = minutosLargaDistanciaConsumidos;
    }

    public TipoPlan getTipoContrato() {
        return tipoContrato;
    }

    public void setTipoContrato(TipoPlan tipoContrato) {
        this.tipoContrato = tipoContrato;
    }

    public int getMinutosLocalesIncluidos() {
        return minutosLocalesIncluidos;
    }

    public void setMinutosLocalesIncluidos(int minutosLocalesIncluidos) {
        this.minutosLocalesIncluidos = minutosLocalesIncluidos;
    }

    public int getMinutosLocalesConsumidos() {
        return minutosLocalesConsumidos;
    }

    public void setMinutosLocalesConsumidos(int minutosLocalesConsumidos) {
        this.minutosLocalesConsumidos = minutosLocalesConsumidos;
    }

    public int getMinutosLargaDistanciaIncluidos() {
        return minutosLargaDistanciaIncluidos;
    }

    public void setMinutosLargaDistanciaIncluidos(int minutosLargaDistanciaIncluidos) {
        this.minutosLargaDistanciaIncluidos = minutosLargaDistanciaIncluidos;
    }

    public int getMinutosLargaDistanciaConsumidos() {
        return minutosLargaDistanciaConsumidos;
    }

    public void setMinutosLargaDistanciaConsumidos(int minutosLargaDistanciaConsumidos) {
        this.minutosLargaDistanciaConsumidos = minutosLargaDistanciaConsumidos;
    }

    @Override
    public String toString() {
        return "Telefonia" +
                "tipoContrato='" + tipoContrato + '\'' +
                ", minutosLocalesIncluidos=" + minutosLocalesIncluidos + '\''+
                ", minutosLocalesConsumidos=" + minutosLocalesConsumidos + '\''+
                ", minutosLargaDistanciaIncluidos=" + minutosLargaDistanciaIncluidos + '\''+
                ", minutosLargaDistanciaConsumidos=" + minutosLargaDistanciaConsumidos;
    }
}
