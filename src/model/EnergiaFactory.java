package model;

public class EnergiaFactory implements ServiceFactory{
    @Override
    public ServicioPublico crearServicio() {
        return new Energia();
    }
}
