package model;

public class ServicioFactory {

    public Servicio crearServicio(String tipoServicio) {
        if (tipoServicio.equalsIgnoreCase("Agua")) {
            return new Agua();
        } else if (tipoServicio.equalsIgnoreCase("Gas")) {
            return new Gas();
        } else if (tipoServicio.equalsIgnoreCase("Energia")) {
            return new Energia();
        } else if (tipoServicio.equalsIgnoreCase("Telefonía")) {
            return new Telefonia();
        } else if (tipoServicio.equalsIgnoreCase("Internet")) {
            return new Internet();
        } else {
            return null;
        }
    }
}
