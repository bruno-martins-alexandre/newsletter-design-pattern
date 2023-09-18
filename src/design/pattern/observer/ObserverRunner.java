package design.pattern.observer;

public class ObserverRunner {

    public static void main(String... args) {

        Subject newsletterPlatform = new NewsletterPlatform();

        //Registers 2 new followers
        Observer follower1 = new NewsletterFollower("WinterIsComing2023");
        Observer follower2 = new NewsletterFollower("1995IsTheBestYear");
        newsletterPlatform.register(follower1);
        newsletterPlatform.register(follower2);

        //notifies all followers that a new newsletter version is available
        newsletterPlatform.notifyAllObservers(
            "A new Newsletter edition (July version) was published!"
        );

        //unregisters follower 2
        newsletterPlatform.unregister(follower2);

        //notifies all followers that another new newsletter version is available
        newsletterPlatform.notifyAllObservers(
            "A new Newsletter edition (September) was published!"
        );

    }

}
