package model;

public class Agua extends Servicio {

    private String codigoMedidor;
    private int contadorActual;
    private int contadorAnterior;

    public Agua(String id, String codigoContrato, String direccionInstalacion, String fechaInstalacion,
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
        return "Agua" +
                "codigoMedidor='" + codigoMedidor + '\'' +
                ", contadorActual=" + contadorActual + '\'' +
                ", contadorAnterior=" + contadorAnterior;
    }
}
