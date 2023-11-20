package CreationalPatterns.AbstractFactory.Hotel;

public class EconomicalCustomer extends Customer{
    @Override
    public void giveInformation() {
        System.out.println("I am a Economical customer!!!");
    }
}
