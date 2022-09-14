package Decorator.Insurance;

import java.util.List;

public class AgeCars implements Insurance{
    private int carAge;
    private Insurance insurance;


    public AgeCars(int carAge, Insurance insurance) {
        this.carAge = carAge;
        this.insurance = insurance;
    }

    @Override
    public double calculateInsurance() throws InValidAgeException {
        return ((double)carAge*2.5)+insurance.calculateInsurance();
    }

    @Override
    public List<Insurance> getContext() {
        List<Insurance> insurances = insurance.getContext();
        insurances.add(this);
        return insurances;
    }
}
