package assignment2.factory_method.factory;

import assignment2.factory_method.model.Transport;
import assignment2.factory_method.model.Truck;

public class TruckFactory extends TransportFactory {
    @Override
    public Transport createTransport() {
        return new Truck();
    }
}