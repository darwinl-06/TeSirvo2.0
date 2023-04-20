package model;

import java.util.ArrayList;

public class PlanContainer {

    private ArrayList<PlanComercial> planes;

    public PlanContainer() {
        planes =new ArrayList<>();
        planes.add(new PlanComercial("SuperEnergy",300,100,2,"Energia","300"));
        planes.add(new PlanComercial("HomeConnect",500,300,6,"Telefonia,Internet","400,300"));
        planes.add(new PlanComercial("HomeService",1000,100,4,"Agua,Gas,Energia","400,300,200"));
    }

    public void addPlan( String name, int valueToPay, int aditionalConsumeValue, int validityRange, String services, String capacityValue) {
        planes.add(new PlanComercial(name,valueToPay,aditionalConsumeValue,validityRange,services,capacityValue));
    }

    public PlanComercial getPlan(String name) {
        PlanComercial plan=null;
        for (int i = 0; i< planes.size(); i++){
            if (planes.get(i).getName().equals(name)){
                plan= planes.get(i);
            }
        }
        return plan;
    }

    public String toStringPlans(){
        String msg = "";

        for (int i = 0; i < planes.size(); i++) {
            msg += planes.get(i).toString()+"\n";
        }

        return msg;
    }


}
