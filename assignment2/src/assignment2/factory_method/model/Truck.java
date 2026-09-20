package assignment2.factory_method.model;

public class Truck implements Transport {
    @Override
    public void deliver() {
        System.out.println("[Logistics] Delivering cargo by land in a heavy-duty container truck.");
    }

    @Override
    public String getCapacity() {
        return "20 Tons";
    }
}