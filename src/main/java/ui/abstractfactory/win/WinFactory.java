package ui.abstractfactory.win;

import ui.abstractfactory.api.Button;
import ui.abstractfactory.api.Checkbox;
import ui.abstractfactory.api.GUIFactory;

public class WinFactory implements GUIFactory {
    @Override public Button createButton() { return new WinButton(); }
    @Override public Checkbox createCheckbox() { return new WinCheckbox(); }
}
