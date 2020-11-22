package FactoryPattern;

public class WindowsUIFactory implements AbstractUIFactory {

    @Override
    public Button createButton() {
        return new WindowsButton();
    }

    @Override
    public Window createWindow() {
        return new WindowsWindow();
    }
}
