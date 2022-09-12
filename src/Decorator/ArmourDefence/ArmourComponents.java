package Decorator.ArmourDefence;

import java.util.List;

public interface ArmourComponents {
    public int calculatePrice();
    public double calculateWeight();
    List<Accessories> getAccessories();

}
