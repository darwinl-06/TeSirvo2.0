package model;

import java.util.ArrayList;

public class Contrato {

    private ArrayList<Servicio> services;
    private PlanComercial plan;
    private String id;

    public Contrato(String id, PlanComercial plan) {
        this.id = id;
        this.plan = plan;
        this.services = new ArrayList<>();
    }

    public String printContrac(){


        String print="";
        for (int i=0;i<services.size();i++){
            print=print+" "+services.get(i).toString();
        }

        print=print+"\n"+plan.getName();

        return print;
    }



    public boolean addService(Servicio service){
        services.add(service);
        return true;
    }

    public boolean updateService(String whichService, Servicio updatedService) {
        for (int i = 0; i < services.size(); i++) {
            if(services.get(i).getId().equalsIgnoreCase(whichService)){
                services.set(i, updatedService);
                return true;
            }
        }
        return false;
    }

    public Servicio consultService(String whichService) {
        for (int i = 0; i < services.size(); i++) {
            if(services.get(i).getId().equalsIgnoreCase(whichService)){
                return services.get(i);
            }
        }
        return null;
    }

    /*
    public boolean inactivateService(String whichService) {
        for (int i = 0; i < services.size(); i++) {
            if(services.get(i).getId().equalsIgnoreCase(whichService)){
                return services.get(i).inactivateService();
            }
        }
        return false;
    }

     */

    public ArrayList<Servicio> getServices() {
        return services;
    }

    public void setServices(ArrayList<Servicio> services) {
        this.services = services;
    }

    public PlanComercial getPlan() {
        return plan;
    }

    public void setPlan(PlanComercial plan) {
        this.plan = plan;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }


}
