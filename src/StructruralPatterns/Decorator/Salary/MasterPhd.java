package StructruralPatterns.Decorator.Salary;

public class MasterPhd extends Competence{
    public MasterPhd(String competenceName,ISalary salaryExtras) {
        super(competenceName, 1000, salaryExtras);
    }

    @Override
    public double calculateSalary() {
        if(super.getCompetenceName().equals("Master")){
            return salaryExtras.calculateSalary()+(compensation*2);
        }else{
            return salaryExtras.calculateSalary()+compensation*3;
        }
    }
}
