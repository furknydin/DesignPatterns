package Decorator.Salary;

public class Main {
    public static void main(String[] args) {
        ISalary salary = new Salary();

        salary = new Disability(70,salary);
        salary = new Certificate(salary);
        salary = new MasterPhd("Master",salary);
        salary = new Certificate(salary);

        System.out.println("Calculated salary: "+salary.calculateSalary());
    }
}
