// src/main/java/ui/abstractfactory/mac/MacButton.java
package ui.abstractfactory.mac;

import ui.abstractfactory.api.Button;

public class MacButton implements Button {
    @Override public void render() {
        System.out.println("[Mac] Render Button");
    }
    @Override public String toString() { return "MacButton"; }
}
