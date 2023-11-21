package CreationalPatterns.AbstractFactory.MazeFactory;

public abstract class Door implements MapSite{
    private Room room1;
    private Room room2;
    private boolean isOpen;

    public Door(Room room1, Room room2) {
        this.room1 = room1;
        this.room2 = room2;
    }

    protected Room otherSideFrom(Room room){
        if (room != null) {
            if (room == room1) {
                return room2;
            } else if (room == room2) {
                return room1;
            }
        }
        return null;
    }

    @Override
    public abstract void enter();
}
