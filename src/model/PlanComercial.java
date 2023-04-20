package model;

public class PlanComercial {
    private String name;
    private int valueToPay;
    private int aditionalConsumeValue;
    private int validityRange;
    private String services;
    private String capacityValue;

    public PlanComercial( String name, int valueToPay, int aditionalConsumeValue, int validityRange, String services, String capacityValue) {

        this.name = name;
        this.valueToPay = valueToPay;
        this.aditionalConsumeValue = aditionalConsumeValue;
        this.validityRange = validityRange;
        this.services = services;
        this.capacityValue = capacityValue;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getValueToPay() {
        return valueToPay;
    }

    public void setValueToPay(int valueToPay) {
        this.valueToPay = valueToPay;
    }

    public int getAditionalConsumeValue() {
        return aditionalConsumeValue;
    }

    public void setAditionalConsumeValue(int aditionalConsumeValue) {
        this.aditionalConsumeValue = aditionalConsumeValue;
    }

    public int getValidityRange() {
        return validityRange;
    }

    public void setValidityRange(int validityRange) {
        this.validityRange = validityRange;
    }

    public String getServices() {
        return services;
    }

    public void setServices(String services) {
        this.services = services;
    }

    public String getCapacityValue() {
        return capacityValue;
    }

    public void setCapacityValue(String capacityValue) {
        this.capacityValue = capacityValue;
    }

    @Override
    public String toString() {
        return "-----------------------------------" + '\n' +
                "PlanComercial"+ '\n' +
                "name='" + name + '\n' +
                "valueToPay=" + valueToPay + '\n' +
                "aditionalConsumeValue=" + aditionalConsumeValue + '\n' +
                "validityRange=" + validityRange + '\n' +
                "services='" + services + '\n' +
                "capacityValue='" + capacityValue + '\n';
    }
}
