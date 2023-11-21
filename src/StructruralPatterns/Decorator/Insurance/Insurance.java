package StructruralPatterns.Decorator.Insurance;

import java.util.List;

public interface Insurance {
    public double calculateInsurance() throws InValidAgeException;
    public List<Insurance> getContext();
}
