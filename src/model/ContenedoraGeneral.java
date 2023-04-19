package model;

import java.util.ArrayList;

public class ContenedoraGeneral {

    private ArrayList<Cliente> clients;


    public ContenedoraGeneral(){

        clients = new ArrayList<>();
    }

    public ArrayList<Cliente> getClients() {
        return clients;
    }

    public void setClients(ArrayList<Cliente> clients) {
        this.clients = clients;
    }


}
