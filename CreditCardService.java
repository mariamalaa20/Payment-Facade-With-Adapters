public class CreditCardService {
    public boolean chargeCard(String cardNumber, double amount) {
        System.out.println("Charged " + amount + " TL from card " + cardNumber);
        return true;
    }
}
