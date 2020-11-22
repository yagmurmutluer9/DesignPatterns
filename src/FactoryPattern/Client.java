package FactoryPattern;

public class Client {

    public static void main(String[] args) {


        AbstractUIFactory abstractUiFactory =  createUIFactoryAccordingToOS();

        doButtonOperations(abstractUiFactory);
        doWindowOperations(abstractUiFactory);


    }

    private static void doWindowOperations(AbstractUIFactory abstractUiFactory) {
        Window window = abstractUiFactory.createWindow();
        window.setHeader("Header of Window");
        window.openWindow();
        window.closeWindow();
    }

    private static void doButtonOperations(AbstractUIFactory abstractUiFactory) {
        Button button = abstractUiFactory.createButton();
        button.setLabel("Click me");
        button.click();
    }

    // check system os and return

    private static AbstractUIFactory createUIFactoryAccordingToOS() {
        if (System.getProperty("os.name").startsWith("Window")) {
            return new WindowsUIFactory();
        } else {
            return new UbuntuUIFactory();
        }
    }
}
