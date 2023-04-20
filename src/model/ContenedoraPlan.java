package model;

import java.util.ArrayList;

public class ContenedoraPlan {

    private ArrayList<Plan> planes;

    public ContenedoraPlan() {
        this.planes = new ArrayList<>();
    }

    public ArrayList<Plan> getPlanes() {
        return planes;
    }

    public void setPlanes(ArrayList<Plan> planes) {
        this.planes = planes;
    }

    public String toStringPlans(){
        String msg = "";

        for (int i = 0; i < planes.size(); i++) {
            msg += planes.get(i).toString()+"\n";
        }

        return msg;
    }
}
