// src/main/java/ui/abstractfactory/mac/MacFactory.java
package ui.abstractfactory.mac;

import ui.abstractfactory.api.Button;
import ui.abstractfactory.api.Checkbox;
import ui.abstractfactory.api.GUIFactory;

public class MacFactory implements GUIFactory {
    @Override public Button createButton() { return new MacButton(); }
    @Override public Checkbox createCheckbox() { return new MacCheckbox(); }
}
