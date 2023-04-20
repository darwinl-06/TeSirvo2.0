package model;

public class PlanControler {

    private IPlanComercial plan;
    private PlanContainer comertialPlan=new PlanContainer();

    public void sellPlancomercial(Cliente cliente,String planName) {

        if (comertialPlan.getPlan(planName)!=null){

            switch (planName){

                case "SuperEnergy":
                    plan=new SuperEnergy();
                    plan.sellPlanComercial(cliente,comertialPlan.getPlan(planName));
                    break;

                case "HomeConnect":
                    plan=new HomeConnect();
                    plan.sellPlanComercial(cliente,comertialPlan.getPlan(planName));
                    break;

                case "HomeService":
                    plan=new HomeService();
                    plan.sellPlanComercial(cliente,comertialPlan.getPlan(planName));
                    break;
            }

        }

    }

}
