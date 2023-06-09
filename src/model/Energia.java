package model;

public class Energia extends Servicio {

    protected String codigoMedidor;
    protected int contadorActual;
    protected int contadorAnterior;

    public Energia(String id, String codigoContrato, String direccionInstalacion, String fechaInstalacion,
                   String fechaFacturacion, EstadoServicio activo, String codigoMedidor, int contadorActual, int contadorAnterior) {

        super(id, codigoContrato, direccionInstalacion, fechaInstalacion, fechaFacturacion, activo);
        this.codigoMedidor = codigoMedidor;
        this.contadorActual = contadorActual;
        this.contadorAnterior = contadorAnterior;
    }

    public String getCodigoMedidor() {
        return codigoMedidor;
    }

    public void setCodigoMedidor(String codigoMedidor) {
        this.codigoMedidor = codigoMedidor;
    }

    public int getContadorActual() {
        return contadorActual;
    }

    public void setContadorActual(int contadorActual) {
        this.contadorActual = contadorActual;
    }

    public int getContadorAnterior() {
        return contadorAnterior;
    }

    public void setContadorAnterior(int contadorAnterior) {
        this.contadorAnterior = contadorAnterior;
    }

    @Override
    public String toString() {
        return "-----------------------------------" + '\n' +
                "Energia" + '\n' +
                "codigoMedidor='" + codigoMedidor + '\n' +
                "contadorActual=" + contadorActual + '\n' +
                "contadorAnterior=" + contadorAnterior+ '\n';
    }
}
