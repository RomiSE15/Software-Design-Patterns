package assignment2.abstract_factory.checkbox;

public class MacCheckbox implements Checkbox {
    private boolean checked = false;

    @Override
    public void render() {
        System.out.println("[macOS] Rendering rounded toggle checkbox. Checked: " + checked);
    }

    @Override
    public void toggle() {
        checked = !checked;
        System.out.println("[macOS] Checkbox state changed to: " + checked);
    }
}