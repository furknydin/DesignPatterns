package CreationalPatterns.AbstractFactory.MazeFactory;

import java.util.ArrayList;
import java.util.List;

public class Maze {
    private final List<Room> rooms;

    public Maze() {
        rooms = new ArrayList<>();
    }

    protected void addRoom(Room room){
        if (room != null )
            rooms.add(room);
    }
    protected Room roomNo(int roomNo){
        return rooms.stream().filter(x -> x.getRoomNumber() == roomNo).findFirst().orElseThrow();
    }
}
