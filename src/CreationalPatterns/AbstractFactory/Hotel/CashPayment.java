package CreationalPatterns.AbstractFactory.Hotel;

public class CashPayment extends Payment{
    @Override
    public void giveInformation() {
        System.out.println("I pay the cost with cash !!!");
    }
}
