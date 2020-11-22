package ObserverPattern;

import java.util.ArrayList;
import java.util.List;

public class StreamingPlatform implements Publisher {

    private List<Subscriber> subscribers = new ArrayList<Subscriber>();
    private String name = null;


    @Override
    public void subscribe(Subscriber subscriber) {
        this.subscribers.add(subscriber);

    }

    @Override
    public void unsubscribe(Subscriber subscriber) {
        subscribers.remove(subscriber);

    }

    @Override
    public void notifySubscribers() {

        for (Subscriber subscriber : subscribers) {
            subscriber.update(name);
        }
    }

    public void publishContent(String name) {
        this.name = name;
    }

}
