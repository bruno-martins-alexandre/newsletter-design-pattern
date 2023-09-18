package design.pattern.observer;

/**
 * Represents a subject of the Observer pattern
 */
public interface Subject {

    /**
     * Registers the given observer in the observers list of the subject
     *
     * @param observer observer to be registered
     */
    void register(Observer observer);

    /**
     * Unregisters the given observer from the observers list of the subject
     *
     * @param observer observer to be unregistered
     */
    void unregister(Observer observer);

    /**
     * Notifies all observers that there is a new change/update on the subject
     */
    <T> void notifyAllObservers(T notification);
}
