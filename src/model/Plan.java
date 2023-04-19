package model;

import java.util.ArrayList;

public abstract class Plan {

    private String nombre;
    private String planId;
    private double valorAPagar;
    private double valorConsumoAdicional;
    private String fecha;
    private ArrayList<String> services;

    public Plan(String nombre, String planId, double valorAPagar, double valorConsumoAdicional, String fecha, ArrayList<String> services) {
        this.nombre = nombre;
        this.planId = planId;
        this.valorAPagar = valorAPagar;
        this.valorConsumoAdicional = valorConsumoAdicional;
        this.fecha = fecha;
        this.services = services;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getPlanId() {
        return planId;
    }

    public void setPlanId(String planId) {
        this.planId = planId;
    }

    public double getValorAPagar() {
        return valorAPagar;
    }

    public void setValorAPagar(double valorAPagar) {
        this.valorAPagar = valorAPagar;
    }

    public double getValorConsumoAdicional() {
        return valorConsumoAdicional;
    }

    public void setValorConsumoAdicional(double valorConsumoAdicional) {
        this.valorConsumoAdicional = valorConsumoAdicional;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public ArrayList<String> getServices() {
        return services;
    }

    public void setServices(ArrayList<String> services) {
        this.services = services;
    }

    @Override
    public String toString() {
        return "Plan" +
                "nombre='" + nombre + '\'' +
                ", planId='" + planId + '\'' +
                ", valorAPagar=" + valorAPagar +
                ", valorConsumoAdicional=" + valorConsumoAdicional + '\'' +
                ", fecha='" + fecha + '\'' +
                ", services=" + services;
    }
}
