package ui.abstractfactory.win;

import ui.abstractfactory.api.Checkbox;

public class WinCheckbox implements Checkbox {
    private boolean checked;

    @Override public void render() {
        System.out.println("[Win] Render Checkbox (checked=" + checked + ")");
    }


    @Override public void setChecked(boolean value) {
        this.checked = value;
    }

    @Override public boolean isChecked() { return checked; }


    @Override public String toString() {
        return "WinCheckbox";
    }
}
