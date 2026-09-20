package assignment2;

import assignment2.factory_method.factory.ShipFactory;
import assignment2.factory_method.factory.TransportFactory;
import assignment2.factory_method.factory.TruckFactory;
import assignment2.abstract_factory.app.Application;
import assignment2.abstract_factory.factory.GUIFactory;
import assignment2.abstract_factory.factory.MacFactory;
import assignment2.abstract_factory.factory.WindowsFactory;

public class Main {
    public static void main(String[] args) {
        System.out.println("PART A:FACTORY METHOD");
        TransportFactory truckFactory = new TruckFactory();
        truckFactory.planDelivery();

        System.out.println();

        TransportFactory shipFactory = new ShipFactory();
        shipFactory.planDelivery();

        System.out.println("\nPART B:ABSTRACT FACTORY");
        GUIFactory windowsFactory = new WindowsFactory();
        Application winApp = new Application(windowsFactory);
        winApp.renderUI();
        winApp.triggerActions();

        System.out.println();

        GUIFactory macFactory = new MacFactory();
        Application macApp = new Application(macFactory);
        macApp.renderUI();
        macApp.triggerActions();
    }
}