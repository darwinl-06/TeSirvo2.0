package model;

public class InternetFactory implements ServiceFactory{
    @Override
    public ServicioPublico crearServicio() {
        return new Internet();
    }
}
