package StructruralPatterns.Decorator.Salary;

public class OverseasOffice extends Competence{
    public OverseasOffice(ISalary salaryExtras) {
        super("Overseas office", 10000, salaryExtras);
    }
}
