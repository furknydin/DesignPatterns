package CreationalPatterns.AbstractFactory.MazeFactory;

public abstract class Wall implements MapSite{
    public Wall() {
    }

    @Override
    public abstract void enter();

}
