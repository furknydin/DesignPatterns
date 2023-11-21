package StructruralPatterns.Decorator.Salary;

import java.util.ArrayList;
import java.util.List;

public class Salary implements ISalary{
    private String name;
    private double salary;

    public Salary() {
        this.name = "Software Developer";
        this.salary = 15700;
    }

    @Override
    public double calculateSalary() {
        return salary;
    }

    @Override
    public List<Competence> getCompetence() {
        return new ArrayList<>();
    }
}
