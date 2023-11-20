package CreationalPatterns.AbstractFactory.Hotel;

public class OnlineReservation extends Reservation{

    @Override
    public void giveInformation() {
        System.out.println("I making a online reservation!!");
    }
}
