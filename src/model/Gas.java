package model;

public class Gas extends ServicioPublico {

    protected String codigoMedidor;
    protected int contadorActual;
    protected int contadorAnterior;

    public Gas(String codigoContrato, String direccionInstalacion, String fechaInstalacion, String fechaFacturacion,
               EstadoServicio activo, String codigoMedidor, int contadorActual, int contadorAnterior) {

        super(codigoContrato, direccionInstalacion, fechaInstalacion, fechaFacturacion, activo);
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
        return "Gas{" +
                "codigoMedidor='" + codigoMedidor + '\'' +
                ", contadorActual=" + contadorActual +
                ", contadorAnterior=" + contadorAnterior +
                '}';
    }
}
