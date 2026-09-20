package assignment2.abstract_factory.factory;

import assignment2.abstract_factory.button.Button;
import assignment2.abstract_factory.checkbox.Checkbox;

public interface GUIFactory {
    Button createButton();
    Checkbox createCheckbox();
}