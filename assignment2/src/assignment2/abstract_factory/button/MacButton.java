package assignment2.abstract_factory.button;

public class MacButton implements Button {
    @Override
    public void render() {
        System.out.println("[macOS] Rendering smooth rounded button.");
    }

    @Override
    public void onClick() {
        System.out.println("[macOS] Button click event handled with animation.");
    }
}