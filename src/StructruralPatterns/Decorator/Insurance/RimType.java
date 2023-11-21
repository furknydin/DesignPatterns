package StructruralPatterns.Decorator.Insurance;

import java.util.List;

public class RimType implements Insurance{
    private String rimName;
    private Insurance insurance;

    public RimType(String rimName, Insurance insurance) {

        this.rimName = rimName;
        this.insurance = insurance;
    }

    @Override
    public double calculateInsurance() throws InValidAgeException {

        double sum;

        if(rimName.equals("steel")){
            sum = -1000.0;
        }else if(rimName.equals("aluminum")){
            sum = 500.0;
        }else{
            throw new InValidAgeException("undefined rim type");
        }

        return sum+insurance.calculateInsurance();
    }

    @Override
    public List<Insurance> getContext() {
        List<Insurance> insurances = insurance.getContext();
        insurances.add(this);
        return insurances;
    }
}
