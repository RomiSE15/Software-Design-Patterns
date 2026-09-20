package assignment2.abstract_factory.factory;

import assignment2.abstract_factory.button.Button;
import assignment2.abstract_factory.button.MacButton;
import assignment2.abstract_factory.checkbox.Checkbox;
import assignment2.abstract_factory.checkbox.MacCheckbox;

public class MacFactory implements GUIFactory {
    @Override
    public Button createButton() {
        return new MacButton();
    }

    @Override
    public Checkbox createCheckbox() {
        return new MacCheckbox();
    }
}