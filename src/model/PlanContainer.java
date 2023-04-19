package model;

import java.util.ArrayList;

public class PlanContainer {

    private ArrayList<PlanComercial> plans;

    public PlanContainer() {
        plans=new ArrayList<>();
        plans.add(new PlanComercial("SuperEnergy",300,100,2,"Energia","300"));
        plans.add(new PlanComercial("HomeConnect",500,300,6,"Telefonia,Internet","400,300"));
        plans.add(new PlanComercial("HomeService",1000,100,4,"Agua,Gas,Energia","400,300,200"));
    }

    public void addPlan( String name, int valueToPay, int aditionalConsumeValue, int validityRange, String services, String capacityValue) {
        plans.add(new PlanComercial(name,valueToPay,aditionalConsumeValue,validityRange,services,capacityValue));
    }

    public PlanComercial getPlan(String name) {
        PlanComercial plan=null;
        for (int i=0;i<plans.size();i++){
            if (plans.get(i).getName().equals(name)){
                plan=plans.get(i);
            }
        }
        return plan;
    }


}
