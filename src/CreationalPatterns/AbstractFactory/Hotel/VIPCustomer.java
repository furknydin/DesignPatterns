package CreationalPatterns.AbstractFactory.Hotel;

public class VIPCustomer extends Customer{
    @Override
    public void giveInformation() {
        System.out.println("I am a VIP customer!!!");
    }
}
