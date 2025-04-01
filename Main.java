public class Main {
    public static void main(String[] args) {
        OrderManager manager = new OrderManager();
        manager.processOrder("ABC123", "123 Main Street");

        PaymentMethod payment = new CreditCardAdapter();
        payment.makePayment(100.0);
    }
}

