package CreationalPatterns.AbstractFactory.MazeFactory;


public class EnchantedRoom extends Room {

    public EnchantedRoom() {

    }

    public EnchantedRoom(int roomNumber) {
        super(roomNumber);


    }

    @Override
    public void enter() {
        System.out.println("Enter the Enchanted room");
    }
}