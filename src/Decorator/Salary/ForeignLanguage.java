package Decorator.Salary;

public class ForeignLanguage extends Competence{
    public ForeignLanguage(ISalary salaryExtras) {
        super("Foreign Language", 1000.0, salaryExtras);
    }

}
