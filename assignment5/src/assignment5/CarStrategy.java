package assignment5;

public class CarStrategy implements RouteStrategy {
    @Override
    public String buildRoute(String start, String end) {
        return "Car route from " + start + " to " + end + " via highway (25 min)";
    }
}