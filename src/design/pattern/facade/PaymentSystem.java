package design.pattern.facade;

/**
 * System responsible for making payments.

 */
public class PaymentSystem {

    /**
     * Makes a payment for travel to a country.
     * @param country country to make a payment for.
     */
    public void makePayment(String country) {
        System.out.println(String.format("Travel payment to %s has been made", country));
    }
}
