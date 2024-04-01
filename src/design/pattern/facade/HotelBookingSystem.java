package design.pattern.facade;

/**
 * System responsible for booking hotels.

 */
public class HotelBookingSystem {

    /**
     * Books a hotel in a country.
     * @param country country to book a hotel in.
     */
    public void bookHotel(String country) {
        System.out.println(String.format("Hotel in %s has been booked", country));
    }

}
