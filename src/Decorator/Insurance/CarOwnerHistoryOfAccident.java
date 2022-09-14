package Decorator.Insurance;

import java.util.List;

public class CarOwnerHistoryOfAccident implements Insurance{
    private int carAccidentCount;
    private double defectRateAverage;

    private Insurance insurance;

    public CarOwnerHistoryOfAccident(int carAccidentCount,
                                     double defectRateAverage, Insurance insurance) {
        this.carAccidentCount = carAccidentCount;
        this.defectRateAverage = defectRateAverage;
        this.insurance = insurance;
    }

    @Override
    public double calculateInsurance() throws InValidAgeException {

        double extraChange =(double) carAccidentCount * defectRateAverage;

        return extraChange+insurance.calculateInsurance();
    }

    @Override
    public List<Insurance> getContext() {
        List<Insurance> insurances = insurance.getContext();
        insurances.add(this);
        return insurances;
    }
}
