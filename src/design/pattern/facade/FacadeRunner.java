package design.pattern.facade;

/**
 * Runner for the facade pattern.
 */
public class FacadeRunner {

    /**
     * Main method.
     *
     * @param args arguments.
     */
    public static void main(String[] args) {
        TravelFacade travelFacade = new TravelFacade();
        travelFacade.bookTravel("Japan");
    }
}
