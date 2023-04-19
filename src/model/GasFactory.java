package model;

public class GasFactory implements ServiceFactory{
    @Override
    public ServicioPublico crearServicio() {
        return new Gas();
    }
}
