package FactoryPattern;

public interface AbstractUIFactory {
    public Button createButton();
    public Window createWindow();
}
