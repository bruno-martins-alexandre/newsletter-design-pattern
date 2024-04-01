package design.pattern.facade;

/**
 * Facade for travel booking.

 */
public class TravelFacade {

    private FlightBookingSystem flightBookingSystem;
    private HotelBookingSystem hotelBookingSystem;
    private PaymentSystem paymentSystem;

    /**
     * Creates a new travel facade.
     */
    public TravelFacade() {
        flightBookingSystem = new FlightBookingSystem();
        hotelBookingSystem = new HotelBookingSystem();
        paymentSystem = new PaymentSystem();
    }

    /**
     * Books a travel to a country.
     * @param country country to book a travel to.
     */
    public void bookTravel(String country) {
        flightBookingSystem.bookFlight(country);
        hotelBookingSystem.bookHotel(country);
        paymentSystem.makePayment(country);
    }

}
