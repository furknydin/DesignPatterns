package CreationalPatterns.AbstractFactory.MazeFactory;

public class BombedMazeFactory implements AbstractMazeFactory{
    @Override
    public Maze makeMaze() {
        return new Maze();
    }

    @Override
    public Wall makeWall() {
        return new BombedWall();
    }

    @Override
    public Room makeRoom(int n) {
        return new RoomWithABomb(n);
    }

    @Override
    public Door makeDoor(Room r1, Room r2) {
        return new DoorNeedingSpell(r1,r2);
    }
}
