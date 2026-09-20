package assignment2.abstract_factory.app;

import assignment2.abstract_factory.button.Button;
import assignment2.abstract_factory.checkbox.Checkbox;
import assignment2.abstract_factory.factory.GUIFactory;

public class Application {
    private final Button button;
    private final Checkbox checkbox;

    public Application(GUIFactory factory) {
        this.button = factory.createButton();
        this.checkbox = factory.createCheckbox();
    }

    public void renderUI() {
        button.render();
        checkbox.render();
    }

    public void triggerActions() {
        button.onClick();
        checkbox.toggle();
    }
}