package estruturais.Decorator;

public class BonusDecorator extends EmployeeDecorator {
    private double bonus;

    public BonusDecorator(Employee employeeDecorated, double bonus) {
        super(employeeDecorated);
        this.bonus = bonus;
    }

    @Override
    public double calculateSalary() {
        return super.calculateSalary() + bonus;
    }
}
