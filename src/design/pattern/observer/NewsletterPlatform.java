package design.pattern.observer;

import java.util.ArrayList;
import java.util.List;

public class NewsletterPlatform implements Subject {

    List<Observer> newsletterFollowers = new ArrayList<>();

    @Override
    public void register(Observer observer) {
        newsletterFollowers.add(observer);
    }

    @Override
    public void unregister(Observer observer) {
        newsletterFollowers.remove(observer);
    }

    @Override
    public <T> void notifyAllObservers(T notification) {
        newsletterFollowers.forEach(observer ->
            observer.updateNewsletterFollower(notification)
        );
    }


}
