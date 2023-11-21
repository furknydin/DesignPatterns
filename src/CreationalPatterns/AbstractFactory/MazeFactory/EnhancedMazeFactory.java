package CreationalPatterns.AbstractFactory.MazeFactory;

public class EnhancedMazeFactory implements AbstractMazeFactory{
    public EnhancedMazeFactory() {
    }

    @Override
    public Maze makeMaze() {
        return new Maze();
    }

    @Override
    public Wall makeWall() {
        return new NormalWall();
    }

    @Override
    public Room makeRoom(int n) {
        return new EnchantedRoom(n);
    }

    @Override
    public Door makeDoor(Room r1, Room r2) {
        return new DoorNeedingSpell(r1,r2);
    }
}
