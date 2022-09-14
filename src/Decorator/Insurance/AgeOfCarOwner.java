package Decorator.Insurance;

import java.util.List;

public class AgeOfCarOwner implements Insurance{
    private int carOwnerAge;
    private Insurance insurance;

    public AgeOfCarOwner(int carOwnerAge, Insurance insurance) {
        this.carOwnerAge = carOwnerAge;
        this.insurance = insurance;
    }

    @Override
    public double calculateInsurance() throws InValidAgeException {
        if(carOwnerAge < 18){
            throw new InValidAgeException("Vehicle owner is too young");
        }
        else if(carOwnerAge > 18 && carOwnerAge <= 25){
            return 3000.0+insurance.calculateInsurance();
        }else if(carOwnerAge > 25 && carOwnerAge < 35){
            return 2000.0+insurance.calculateInsurance();
        }else{
            return 1000.0+insurance.calculateInsurance();
        }
    }

    @Override
    public List<Insurance> getContext() {
        List<Insurance> insurances = insurance.getContext();
        insurances.add(this);
        return insurances;
    }
}
