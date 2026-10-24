package assignment5;

public class BicycleStrategy implements RouteStrategy {
    @Override
    public String buildRoute(String start, String end) {
        return "Bicycle route from " + start + " to " + end + " via bike lanes (40 min)";
    }
}