package estruturais.Decorator;

public class BaseEmployee implements Employee {

    private double baseSalary;

    public BaseEmployee(double baseSalary) {
        this.baseSalary = baseSalary;
    }

    @Override
    public double calculateSalary() {
        return baseSalary;
    }
}
