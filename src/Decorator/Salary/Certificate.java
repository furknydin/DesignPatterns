package Decorator.Salary;

public class Certificate extends Competence{
    public Certificate(ISalary salaryExtras) {
        super("Certificate", 1000, salaryExtras);
    }
}
