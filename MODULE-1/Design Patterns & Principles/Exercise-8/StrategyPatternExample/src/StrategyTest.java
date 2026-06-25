public class StrategyTest {

    public static void main(String[] args) {

        PaymentContext paymentContext = new PaymentContext();

        System.out.println("Credit Card Payment:");

        paymentContext.setPaymentStrategy(
                new CreditCardPayment()
        );

        paymentContext.makePayment(2500);

        System.out.println();

        System.out.println("PayPal Payment:");

        paymentContext.setPaymentStrategy(
                new PayPalPayment()
        );

        paymentContext.makePayment(5000);
    }
}