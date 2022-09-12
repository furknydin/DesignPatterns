package Decorator.Salary;

public class Disability extends Competence{
    private double disabilityPercentage;

    public Disability(double disabilityPercentage, ISalary salaryExtras) {
        super("Disability", 1250, salaryExtras);
        this.disabilityPercentage = disabilityPercentage;
    }

    @Override
    public double calculateSalary() {
        return salaryExtras.calculateSalary()+(compensation*(disabilityPercentage/100.0));
    }
}
