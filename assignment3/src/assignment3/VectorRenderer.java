package assignment3;

public class VectorRenderer implements Renderer {
    @Override
    public void renderCircle(double radius) {
        System.out.println("Drawing Circle as vectors with radius " + radius);
    }

    @Override
    public void renderSquare(double side) {
        System.out.println("Drawing Square as vectors with side " + side);
    }
}