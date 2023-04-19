package model;

import java.util.List;

public class Cliente {

    private String nombre;
    private String identificacion;
    private String fechaRegistro;
    private String codigoContrato;
    private String direccionFacturacion;
    private String telefonoContacto;
    private String email;
    private EstadoCliente estado;
    private List<ServicioPublico> serviciosContratados;

    public Cliente(String nombre, String identificacion, String fechaRegistro, String codigoContrato, String direccionFacturacion,
                   String telefonoContacto, String email, EstadoCliente estado, List<ServicioPublico> serviciosContratados) {

        this.nombre = nombre;
        this.identificacion = identificacion;
        this.fechaRegistro = fechaRegistro;
        this.codigoContrato = codigoContrato;
        this.direccionFacturacion = direccionFacturacion;
        this.telefonoContacto = telefonoContacto;
        this.email = email;
        this.estado = estado;
        this.serviciosContratados = serviciosContratados;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getIdentificacion() {
        return identificacion;
    }

    public void setIdentificacion(String identificacion) {
        this.identificacion = identificacion;
    }

    public String getFechaRegistro() {
        return fechaRegistro;
    }

    public void setFechaRegistro(String fechaRegistro) {
        this.fechaRegistro = fechaRegistro;
    }

    public String getCodigoContrato() {
        return codigoContrato;
    }

    public void setCodigoContrato(String codigoContrato) {
        this.codigoContrato = codigoContrato;
    }

    public String getDireccionFacturacion() {
        return direccionFacturacion;
    }

    public void setDireccionFacturacion(String direccionFacturacion) {
        this.direccionFacturacion = direccionFacturacion;
    }

    public String getTelefonoContacto() {
        return telefonoContacto;
    }

    public void setTelefonoContacto(String telefonoContacto) {
        this.telefonoContacto = telefonoContacto;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public EstadoCliente getEstado() {
        return estado;
    }

    public void setEstado(EstadoCliente estado) {
        this.estado = estado;
    }

    public List<ServicioPublico> getServiciosContratados() {
        return serviciosContratados;
    }

    public void setServiciosContratados(List<ServicioPublico> serviciosContratados) {
        this.serviciosContratados = serviciosContratados;
    }

    @Override
    public String toString() {
        return "Cliente{" +
                "nombre='" + nombre + '\'' +
                ", identificacion='" + identificacion + '\'' +
                ", fechaRegistro='" + fechaRegistro + '\'' +
                ", codigoContrato='" + codigoContrato + '\'' +
                ", direccionFacturacion='" + direccionFacturacion + '\'' +
                ", telefonoContacto='" + telefonoContacto + '\'' +
                ", email='" + email + '\'' +
                ", estado=" + estado +
                ", serviciosContratados=" + serviciosContratados +
                '}';
    }
}
