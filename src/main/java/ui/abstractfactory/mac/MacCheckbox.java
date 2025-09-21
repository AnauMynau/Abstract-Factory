// src/main/java/ui/abstractfactory/mac/MacCheckbox.java
package ui.abstractfactory.mac;

import ui.abstractfactory.api.Checkbox;

public class MacCheckbox implements Checkbox {
    private boolean checked;

    @Override public void render() {
        System.out.println("[Mac] Render Checkbox (checked=" + checked + ")");
    }

    @Override public void setChecked(boolean value) { this.checked = value; }
    @Override public boolean isChecked() { return checked; }

    @Override public String toString() { return "MacCheckbox"; }
}
