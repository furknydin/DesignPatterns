package StructruralPatterns.Decorator.ArmourDefence;

import java.util.ArrayList;
import java.util.List;

public class Tor implements ArmourComponents {
    private String name;
    private int price;
    private double weight;

    public Tor() {
        this.name = "Tor";
        this.price = 5000;
        this.weight = 50;
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
