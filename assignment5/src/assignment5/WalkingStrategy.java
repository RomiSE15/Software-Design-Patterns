package assignment5;

public class WalkingStrategy implements RouteStrategy {
    @Override
    public String buildRoute(String start, String end) {
        return "Walking route from " + start + " to " + end + " via pedestrian paths (75 min)";
    }
}