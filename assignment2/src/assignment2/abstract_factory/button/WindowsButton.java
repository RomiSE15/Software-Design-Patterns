package assignment2.abstract_factory.button;

public class WindowsButton implements Button {
    @Override
    public void render() {
        System.out.println("[Windows] Rendering styled rectangular button.");
    }

    @Override
    public void onClick() {
        System.out.println("[Windows] Button click event handled.");
    }
}