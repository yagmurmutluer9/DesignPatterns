package FactoryPattern;

public class UbuntuUIFactory implements AbstractUIFactory {

    @Override
    public Button createButton() {
        return new UbuntuButton();
    }

    @Override
    public Window createWindow() {
        return new UbuntuWindow();
    }

}
