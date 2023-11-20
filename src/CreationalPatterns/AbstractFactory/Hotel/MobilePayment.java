package CreationalPatterns.AbstractFactory.Hotel;

public class MobilePayment extends Payment{
    @Override
    public void giveInformation() {
        System.out.println("I pay the cost with mobile !!!");
    }
}
