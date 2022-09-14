package Decorator.Insurance;

import java.util.List;

public class CarAccessories implements Insurance{
    private int carAccessoriesCount;
    private Insurance insurance;

    public CarAccessories(int carAccessoriesCount, Insurance insurance) {
        this.carAccessoriesCount = carAccessoriesCount;
        this.insurance = insurance;
    }

    @Override
    public double calculateInsurance() throws InValidAgeException{
        return (double) carAccessoriesCount*125.75 + insurance.calculateInsurance();
    }

    @Override
    public List<Insurance> getContext() {
        List<Insurance> insurances = insurance.getContext();
        insurances.add(this);
        return insurances;
    }
}
