package Decorator.ArmourDefence;

import java.util.ArrayList;
import java.util.List;

public class Dec implements ArmourComponents{

    private String name;
    private int price;

    private double weight;

    public Dec() {
        this.name = "Dec";
        this.price = 500;
        this.weight = 25;
    }

    @Override
    public int calculatePrice() {
        return price;
    }

    @Override
    public double calculateWeight() {
        return weight;
    }

    @Override
    public List<Accessories> getAccessories() {
        return new ArrayList<>();
    }
}
