package CreationalPatterns.AbstractFactory.Hotel;

public class CreditCardPayment extends Payment{
    @Override
    public void giveInformation() {
        System.out.println("I pay the cost with credit card !!!");
    }
}
