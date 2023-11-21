package StructruralPatterns.Decorator.Salary;

import java.util.List;

public abstract class Competence implements ISalary{

    private String competenceName;
    protected double compensation;                // Default özellikler için tanımlayalım
    protected ISalary salaryExtras;

    public Competence(String competenceName, double compensation, ISalary salaryExtras) {
        this.competenceName = competenceName;
        this.compensation = compensation;
        this.salaryExtras = salaryExtras;
    }

    @Override
    public double calculateSalary() {
        return salaryExtras.calculateSalary()+compensation;
    }

    @Override
    public List<Competence> getCompetence() {
        List<Competence> competences = salaryExtras.getCompetence();
        competences.add(this);
        return competences;
    }

    public double getCompensation(){
        return compensation;
    }

    public String getCompetenceName(){return competenceName;}
}
