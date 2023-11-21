package CreationalPatterns.AbstractFactory.MazeFactory;

public class BombedWall extends Wall{
    private boolean bomb;

    public BombedWall() {
    }

    public BombedWall(boolean bomb) {
        this.bomb = bomb;
    }



    @Override
    public void enter() {
        System.out.println("Enter the Bombed Wall");
    }
}
