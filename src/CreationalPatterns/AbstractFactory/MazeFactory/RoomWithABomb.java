package CreationalPatterns.AbstractFactory.MazeFactory;

public class RoomWithABomb extends Room{
    private boolean bomb;

    public RoomWithABomb(boolean bomb) {
        this.bomb = bomb;
    }

    public RoomWithABomb(int roomNo, boolean bomb) {
        super(roomNo);
        this.bomb = bomb;
    }
    public RoomWithABomb(int roomNo) {
        super(roomNo);
    }

    public boolean hasABomb(){
        return this.bomb;
    }

    @Override
    public void enter() {
        System.out.println("Enter the bombed room");
    }
}
