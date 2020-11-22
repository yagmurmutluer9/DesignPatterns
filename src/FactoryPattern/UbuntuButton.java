package FactoryPattern;

public class UbuntuButton implements Button {
    @Override
    public void click() {
        System.out.println("UbuntuButton is  Clicked");

    }

    @Override
    public void setLabel(String label) {

        System.out.println("UbuntuButton label is setted as " + label);


    }
}
