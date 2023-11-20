package CreationalPatterns.AbstractFactory.Hotel;

public class NormalRoom extends Room{
    @Override
    public void giveInformation() {
        System.out.println("I am in a normal room!!!");
    }
}
