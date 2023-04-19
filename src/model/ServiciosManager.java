package model;

public class ServiciosManager {
    public ServicioPublico crearServicio(String tipo) {
        ServiceFactory factory;

        if (tipo.equalsIgnoreCase("agua")) {
            factory = new AguaFactory();
        } else if (tipo.equalsIgnoreCase("gas")) {
            factory = new GasFactory();
        } else if (tipo.equalsIgnoreCase("energia")) {
            factory = new EnergiaFactory();
        } else {
            throw new IllegalArgumentException("Tipo de servicio no válido.");
        }

        return factory.crearServicio();
    }
}

