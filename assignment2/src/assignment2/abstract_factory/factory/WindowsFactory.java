package assignment2.abstract_factory.factory;

import assignment2.abstract_factory.button.Button;
import assignment2.abstract_factory.button.WindowsButton;
import assignment2.abstract_factory.checkbox.Checkbox;
import assignment2.abstract_factory.checkbox.WindowsCheckbox;

public class WindowsFactory implements GUIFactory {
    @Override
    public Button createButton() {
        return new WindowsButton();
    }

    @Override
    public Checkbox createCheckbox() {
        return new WindowsCheckbox();
    }
}