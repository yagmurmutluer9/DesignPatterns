package FactoryPattern;

public class UbuntuWindow implements Window {

    @Override
    public void setHeader(String label) {
        System.out.println("Ubuntu window header is set as "+label);
    }

    @Override
    public void openWindow() {
        System.out.println("Ubuntu window is opened");
    }

    @Override
    public void closeWindow() {
        System.out.println("Ubuntu window is closed");
    }
}
