package FactoryPattern;

public class WindowsButton implements Button {

    @Override
    public void click() {
        System.out.println("WindowsButton is  Clicked");

    }

    @Override
    public void setLabel(String label) {

        System.out.println("WindowsButton label is setted as " + label);


    }
}
