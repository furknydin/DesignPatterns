package CreationalPatterns.AbstractFactory.MazeFactory;

public abstract class Room implements MapSite{
    private MapSite[] sides = new MapSite[4];
    private Integer roomNumber;

    public Room() {
        this.roomNumber = 0;
    }

    public Room(int roomNo) {
        this.roomNumber = roomNo;
    }

    protected MapSite GetSide(Direction direction){
        return sides[direction.getDirect()];
    }

    protected void setSides(Direction direction, MapSite mapSite){
        this.sides[direction.getDirect()] = mapSite;
    }

    public Integer getRoomNumber() {
        return roomNumber;
    }

    @Override
    public abstract void enter();
}
