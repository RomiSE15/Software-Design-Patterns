package assignment2.factory_method.factory;

import assignment2.factory_method.model.Transport;

public abstract class TransportFactory {
    public abstract Transport createTransport();

    public void planDelivery() {
        Transport transport = createTransport();
        System.out.println("--- Dispatching Logistics Order ---");
        System.out.println("Assigned Transport Capacity: " + transport.getCapacity());
        transport.deliver();
    }
}