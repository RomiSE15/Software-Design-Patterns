package assignment2.abstract_factory.checkbox;

public class WindowsCheckbox implements Checkbox {
    private boolean checked = false;

    @Override
    public void render() {
        System.out.println("[Windows] Rendering square checkbox. Checked: " + checked);
    }

    @Override
    public void toggle() {
        checked = !checked;
        System.out.println("[Windows] Checkbox state changed to: " + checked);
    }
}