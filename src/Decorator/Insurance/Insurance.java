package Decorator.Insurance;

import java.util.List;

public interface Insurance {
    public double calculateInsurance();
    public List<Insurance> getContext();
}
