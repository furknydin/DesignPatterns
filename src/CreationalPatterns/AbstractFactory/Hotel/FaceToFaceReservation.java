package CreationalPatterns.AbstractFactory.Hotel;

public class FaceToFaceReservation extends Reservation{

    @Override
    public void giveInformation() {
        System.out.println("I making a Face to face reservation!!");
    }
}
