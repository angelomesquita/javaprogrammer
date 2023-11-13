package estruturais.Decorator;

public class BenefitsDecorator extends EmployeeDecorator {

    private double benefits;

    public BenefitsDecorator(Employee employeeDecorated, double benefits) {
        super(employeeDecorated);
        this.benefits = benefits;
    }

    @Override
    public double calculateSalary() {
        return super.calculateSalary() + benefits;
    }
}
