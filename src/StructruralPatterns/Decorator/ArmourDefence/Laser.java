package StructruralPatterns.Decorator.ArmourDefence;

public class Laser extends Accessories{

    public Laser(ArmourComponents components) {
        super(components, "Laser",200,5.5);
    }
}
