package design.pattern.facade;

/**
 * System responsible for booking flights.
 */
public class FlightBookingSystem {

    /**
     * Books a flight to a country.
     * @param country country to book a flight to.
     */
    public void bookFlight(String country) {
        System.out.println(String.format("Flight to %s has been booked", country));
    }
}
