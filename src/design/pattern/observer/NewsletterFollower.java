package design.pattern.observer;

public class NewsletterFollower implements Observer {

    private final String name;

    public NewsletterFollower(String name){
        this.name = name;
    }

    @Override
    public <T> void updateNewsletterFollower(T message) {
        System.out.printf("\nFollower %s received a new notification:\n %s%n", this.name, message);
    }

}
