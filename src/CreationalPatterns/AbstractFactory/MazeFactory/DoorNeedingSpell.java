package CreationalPatterns.AbstractFactory.MazeFactory;

public class DoorNeedingSpell extends Door{
    public DoorNeedingSpell(Room room1, Room room2) {
        super(room1, room2);
    }

    @Override
    public void enter() {
        System.out.println("Enter the door needing spell");
    }
}
