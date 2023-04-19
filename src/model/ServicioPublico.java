package model;

public abstract class ServicioPublico {

    private String codigoContrato;
    private String direccionInstalacion;
    private String fechaInstalacion;
    private String fechaFacturacion;
    private EstadoServicio activo;

    public ServicioPublico(String codigoContrato, String direccionInstalacion, String fechaInstalacion, String fechaFacturacion,
                           EstadoServicio activo) {
        this.codigoContrato = codigoContrato;
        this.direccionInstalacion = direccionInstalacion;
        this.fechaInstalacion = fechaInstalacion;
        this.fechaFacturacion = fechaFacturacion;
        this.activo = activo;
    }
    public ServicioPublico(){

    }

    public String getCodigoContrato() {
        return codigoContrato;
    }

    public void setCodigoContrato(String codigoContrato) {
        this.codigoContrato = codigoContrato;
    }

    public String getDireccionInstalacion() {
        return direccionInstalacion;
    }

    public void setDireccionInstalacion(String direccionInstalacion) {
        this.direccionInstalacion = direccionInstalacion;
    }

    public String getFechaInstalacion() {
        return fechaInstalacion;
    }

    public void setFechaInstalacion(String fechaInstalacion) {
        this.fechaInstalacion = fechaInstalacion;
    }

    public String getFechaFacturacion() {
        return fechaFacturacion;
    }

    public void setFechaFacturacion(String fechaFacturacion) {
        this.fechaFacturacion = fechaFacturacion;
    }

    public EstadoServicio getActivo() {
        return activo;
    }

    public void setActivo(EstadoServicio activo) {
        this.activo = activo;
    }


}
