package assignment2.factory_method.model;

public class Ship implements Transport {
    @Override
    public void deliver() {
        System.out.println("[Logistics] Delivering cargo by sea in an international container ship.");
    }

    @Override
    public String getCapacity() {
        return "50,000 Tons";
    }
}