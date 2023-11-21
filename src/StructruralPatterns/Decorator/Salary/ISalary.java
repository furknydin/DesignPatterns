package StructruralPatterns.Decorator.Salary;

import java.util.List;

public interface ISalary {
    public double calculateSalary();
    public List<Competence> getCompetence();
}
