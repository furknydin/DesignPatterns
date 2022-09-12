package Decorator.Insurance;

import java.util.List;

public class AydinInsurance implements Insurance{

    private String name;

    @Override
    public double calculateInsurance() {
        return 0;
    }

    @Override
    public List<Insurance> getContext() {
        return null;
    }
}
