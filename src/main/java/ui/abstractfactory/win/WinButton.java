package ui.abstractfactory.win;

import ui.abstractfactory.api.Button;

public class WinButton implements Button {

    @Override public void render() {
        System.out.println("[Win] Render Button");
    }

    @Override public String toString() {
        return "WinButton";
    }


}
