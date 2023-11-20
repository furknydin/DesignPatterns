package CreationalPatterns.AbstractFactory.Hotel;

public interface AbstractHotelFactory {
    Service createCustomer();
    Service createRoom();
    Service createReservation();
    Service createPayment();
}
