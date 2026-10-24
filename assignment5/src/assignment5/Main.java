package assignment5;

public class Main {
    public static void main(String[] args) {
        Navigator navigator = new Navigator(new CarStrategy());
        System.out.println(navigator.buildRoute("Khan Shatyr", "Mega Silk Way"));

        navigator.setStrategy(new WalkingStrategy());
        System.out.println(navigator.buildRoute("Khan Shatyr", "Mega Silk Way"));

        navigator.setStrategy(new BicycleStrategy());
        System.out.println(navigator.buildRoute("Khan Shatyr", "Mega Silk Way"));
    }
}