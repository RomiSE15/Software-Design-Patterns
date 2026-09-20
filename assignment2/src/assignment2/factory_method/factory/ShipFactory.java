package assignment2.factory_method.factory;

import assignment2.factory_method.model.Transport;
import assignment2.factory_method.model.Ship;

public class ShipFactory extends TransportFactory {
    @Override
    public Transport createTransport() {
        return new Ship();
    }
}