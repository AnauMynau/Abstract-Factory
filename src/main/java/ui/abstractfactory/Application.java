package ui.abstractfactory;

import ui.abstractfactory.api.Button;
import ui.abstractfactory.api.Checkbox;
import ui.abstractfactory.api.GUIFactory;

public class Application {
    private final Button button;
    private final Checkbox checkbox;

    public Application(GUIFactory factory) {
        this.button = factory.createButton();
        this.checkbox = factory.createCheckbox();
    }

    public void render() {
        button.render();
        checkbox.setChecked(true);
        checkbox.render();
    }
}
