package model;

public class TelefoniaFactory implements ServiceFactory{
    @Override
    public ServicioPublico crearServicio() {
        return new Telefonia();
    }
}
