package assignment3;

public class RasterRenderer implements Renderer {
    @Override
    public void renderCircle(double radius) {
        System.out.println("Drawing Circle as pixels with radius " + radius);
    }

    @Override
    public void renderSquare(double side) {
        System.out.println("Drawing Square as pixels with side " + side);
    }
}