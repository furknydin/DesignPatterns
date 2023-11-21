package CreationalPatterns.AbstractFactory.MazeFactory;

public enum Direction {
    NORTH(0),
    SOUTH(1),
    EAST(2),
    WEST(3);

    private int direct;

    Direction(int direct){
        this.direct = direct;
    }

    public int getDirect() {
        return direct;
    }

}
