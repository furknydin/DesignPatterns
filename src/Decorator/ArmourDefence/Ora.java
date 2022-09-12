package Decorator.ArmourDefence;

import java.util.ArrayList;
import java.util.List;

public class Ora implements ArmourComponents {
    private String name;
    private int price;

    private double weight;

    public Ora() {
        this.name = "Ora";
        this.price = 1500;
        this.weight = 30;
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
