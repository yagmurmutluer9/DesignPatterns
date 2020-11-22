package FactoryPattern;

public class WindowsWindow implements Window {

    @Override
    public void setHeader(String label) {
        System.out.println("Windows window header is set as "+label);
    }

    @Override
    public void openWindow() {
        System.out.println("Windows window is opened");
    }

    @Override
    public void closeWindow() {
        System.out.println("Windows window is closed");
    }
}
