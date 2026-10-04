package assignment3;

public class Main {
    public static void main(String[] args) {
        Renderer vectorRenderer = new VectorRenderer();
        Renderer rasterRenderer = new RasterRenderer();

        Shape circle = new Circle(10.0, vectorRenderer);
        Shape square = new Square(5.0, rasterRenderer);

        circle.draw();
        square.draw();

        circle.setRenderer(rasterRenderer);
        circle.draw();
    }
}