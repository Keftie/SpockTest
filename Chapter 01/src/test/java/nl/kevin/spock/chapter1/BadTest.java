package nl.kevin.spock.chapter1;

import nl.kevin.spock.chapter1.billing.Client;
import nl.kevin.spock.chapter1.billing.CreditCardBilling;
import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class BadTest {

    @Test
    public void scenario1() {
        CreditCardBilling billing = new CreditCardBilling();
        Client client = new Client();
        billing.charge(client, 150);
        assertTrue("expect bonus", client.hasBonus());
    }

    @Test
    public void scenario2() {
        CreditCardBilling billing = new CreditCardBilling();
        Client client = new Client();
        billing.charge(client, 150);
        client.rejectsCharge();
        assertFalse("expect bonus", client.hasBonus());
    }
}
