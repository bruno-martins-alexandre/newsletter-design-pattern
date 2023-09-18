package design.pattern.observer;

/**
 * Represents an observer of the Observer pattern
 */
public interface Observer {

    /**
     * Receives a notification from a subject
     *
     * @param message message of the notification
     * @param <T>     generic type of the message
     */
    <T> void updateNewsletterFollower(T message);

}
