package assignment5;

public class Navigator {
    private RouteStrategy strategy;

    public Navigator(RouteStrategy strategy) {
        this.strategy = strategy;
    }

    public void setStrategy(RouteStrategy strategy) {
        this.strategy = strategy;
    }

    public String buildRoute(String start, String end) {
        if (strategy == null) {
            throw new IllegalStateException("Strategy is not set");
        }
        return strategy.buildRoute(start, end);
    }
}