public class CreditCardAdapter implements PaymentMethod {
    private CreditCardService creditCardService;

    public CreditCardAdapter() {
        this.creditCardService = new CreditCardService();
    }

    @Override
    public boolean makePayment(double amount) {
        return creditCardService.chargeCard("1234-5678-9012-3456", amount);
    }
}
