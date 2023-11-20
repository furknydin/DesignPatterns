package CreationalPatterns.AbstractFactory.Hotel;

public class LuxeryHotelFactory implements AbstractHotelFactory{
    @Override
    public Service createCustomer() {
        return new VIPCustomer();
    }

    @Override
    public Service createRoom() {
        return new KingSuite();
    }

    @Override
    public Service createReservation() {
        return new FaceToFaceReservation();
    }

    @Override
    public Service createPayment() {
        return new CreditCardPayment();
    }
}
