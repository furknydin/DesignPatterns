package CreationalPatterns.AbstractFactory.Hotel;

public class EconomicalHotelFactory implements AbstractHotelFactory{
    @Override
    public Service createCustomer() {
        return new EconomicalCustomer();
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
        return new CashPayment();
    }
}
