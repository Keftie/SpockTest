package nl.kevin.spock.chapter1.billing;

public class CreditCardBilling {

    public void charge(Client client, double amount) {
        client.setBonus(amount > 100);
    }
}
