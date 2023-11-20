package CreationalPatterns.AbstractFactory.Hotel;

import CreationalPatterns.AbstractFactory.GUI.AbstractGUIFactory;
import CreationalPatterns.AbstractFactory.GUI.Component;

public class Client {

    public Client(AbstractHotelFactory factory){
        Service customer = factory.createCustomer();
        customer.giveInformation();

        Service room = factory.createRoom();
        room.giveInformation();

        Service reservation = factory.createReservation();
        reservation.giveInformation();

        Service payment = factory.createPayment();
        payment.giveInformation();
    }
}
