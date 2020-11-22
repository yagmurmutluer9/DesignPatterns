package ObserverPattern;

public class Device implements Subscriber {

    String deviceName = null;

    Device(String deviceName) {

        this.deviceName = deviceName;
    }
    @Override
    public void update(String name) {
        System.out.println("New content published" + name + "on the " + deviceName);
    }
}
