package StructruralPatterns.Decorator.Insurance;

import java.util.ArrayList;
import java.util.List;

public class AydinInsurance implements Insurance{

    private int price;

    public AydinInsurance(int price) {
        this.price = price;
    }

    @Override
    public double calculateInsurance() {
        return price;
    }

    @Override
    public List<Insurance> getContext() {
        return new ArrayList<>();
    }
}
