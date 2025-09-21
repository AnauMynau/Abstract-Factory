package ui.abstractfactory.api;

//import ui.abstractfactory.api.Button;
//import ui.abstractfactory.api.Checkbox;

public interface GUIFactory {
    Button createButton();
    Checkbox createCheckbox();
}
