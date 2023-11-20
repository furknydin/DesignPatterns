package CreationalPatterns.AbstractFactory.Hotel;

public class TimeShareHotelFactory implements AbstractHotelFactory{
    @Override
    public Service createCustomer() {
        return new OwnerCustomer();
    }

    @Override
    public Service createRoom() {
        return new NormalRoom();
    }

    @Override
    public Service createReservation() {
        return new OnlineReservation();
    }

    @Override
    public Service createPayment() {
        return new MobilePayment();
    }
}
