package CreationalPatterns.AbstractFactory.MazeFactory;

public interface AbstractMazeFactory {
    Maze makeMaze();
    Wall makeWall();
    Room makeRoom(int n);
    Door makeDoor(Room r1, Room r2);
}
