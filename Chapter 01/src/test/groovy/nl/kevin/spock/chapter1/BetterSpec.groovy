package nl.kevin.spock.chapter1

import nl.kevin.spock.chapter1.billing.Client
import nl.kevin.spock.chapter1.billing.CreditCardBilling

class BetterSpec extends spock.lang.Specification {

    def "Client should have a bonus if he spends more than 100 dollars"() {
        when: "a client buys something with value at least 100"
        def client = new Client();
        def billing = new CreditCardBilling();
        billing.charge(client, 150)

        then: "Client should have the bonus option active"
        client.hasBonus() == true;
    }

    def "Client loses bonus if he does not accept the transaction"() {
        when: "a client buys something and later changes mind"
        def client = new Client();
        def billing = new CreditCardBilling();
        billing.charge(client, 150);
        client.rejectsCharge();

        then: "Client should have the bonus option inactive"
        client.hasBonus() == false;
    }
}
