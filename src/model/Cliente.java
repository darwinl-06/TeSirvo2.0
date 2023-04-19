package model;

import java.util.List;

public class Cliente {

    private String nombre;
    private String id;
    private String fechaRegistro;
    private String codigoContrato;
    private String direccionFacturacion;
    private String telefonoContacto;
    private String email;
    private EstadoCliente estado;

    public Cliente(String nombre, String identificacion, String fechaRegistro, String codigoContrato, String direccionFacturacion,
                   String telefonoContacto, String email, EstadoCliente estado) {

        this.nombre = nombre;
        this.id = identificacion;
        this.fechaRegistro = fechaRegistro;
        this.codigoContrato = codigoContrato;
        this.direccionFacturacion = direccionFacturacion;
        this.telefonoContacto = telefonoContacto;
        this.email = email;
        this.estado = estado;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
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

    @Override
    public String toString() {
        return "Cliente" +
                "nombre='" + nombre + '\'' +
                ", identificacion='" + id + '\'' +
                ", fechaRegistro='" + fechaRegistro + '\'' +
                ", codigoContrato='" + codigoContrato + '\'' +
                ", direccionFacturacion='" + direccionFacturacion + '\'' +
                ", telefonoContacto='" + telefonoContacto + '\'' +
                ", email='" + email + '\'' +
                ", estado=" + estado ;
    }
}
