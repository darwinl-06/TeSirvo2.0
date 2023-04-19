package model;

public class AguaFactory implements ServiceFactory{
    @Override
    public ServicioPublico crearServicio() {
        return new Agua();
    }
}
