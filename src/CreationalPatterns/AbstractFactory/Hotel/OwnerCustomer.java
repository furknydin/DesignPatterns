package CreationalPatterns.AbstractFactory.Hotel;

public class OwnerCustomer extends Customer{
    @Override
    public void giveInformation() {
        System.out.println("I am a Owner customer!!!");
    }
}
