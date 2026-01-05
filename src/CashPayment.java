/**
 * Implementation of the Payment interface for Cash transactions.
 * Handles simple cash payments upon delivery.
 */
public class CashPayment implements Payment {
    @Override
    public void pay(double amount) {
        System.out.println("Paid " + amount + " in Cash.");
    }
}
