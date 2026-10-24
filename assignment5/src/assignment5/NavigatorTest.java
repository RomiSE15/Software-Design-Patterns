package assignment5;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class NavigatorTest {

    @Test
    public void testRuntimeStrategySwitching() {
        Navigator navigator = new Navigator(new CarStrategy());

        String carRoute = navigator.buildRoute("A", "B");
        assertTrue(carRoute.contains("Car route"));

        navigator.setStrategy(new WalkingStrategy());
        String walkRoute = navigator.buildRoute("A", "B");
        assertTrue(walkRoute.contains("Walking route"));
    }

    @Test
    public void testNullStrategyThrowsException() {
        Navigator navigator = new Navigator(null);
        assertThrows(IllegalStateException.class, () -> navigator.buildRoute("A", "B"));
    }
}