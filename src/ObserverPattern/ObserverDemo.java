package ObserverPattern;

public class ObserverDemo {


    public static void main (String []args) {

        StreamingPlatform Netflix = new StreamingPlatform();

        Device device1 = new Device("pc");
        Device device2 = new Device("tv");
        Device device3 = new Device("tablet");
        Device device4 = new Device("mobile");

        Netflix.subscribe(device1);
        Netflix.subscribe(device2);
        Netflix.subscribe(device3);
        Netflix.subscribe(device4);

        Netflix.publishContent("Dark");
        Netflix.notifySubscribers();




    }





}
