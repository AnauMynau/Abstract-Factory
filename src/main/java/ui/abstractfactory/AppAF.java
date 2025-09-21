package ui.abstractfactory;

import ui.abstractfactory.api.GUIFactory;
import ui.abstractfactory.mac.MacFactory;
import ui.abstractfactory.win.WinFactory;


public class AppAF {
    public static void main(String[] args) {
        demo(new WinFactory());
        demo(new MacFactory());
    }

    private static void demo(GUIFactory factory) {
        System.out.println("== " + factory.getClass().getSimpleName() + " ==");
        Application app = new Application(factory);
        app.render();
        System.out.println();
    }

}
