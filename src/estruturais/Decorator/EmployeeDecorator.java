package estruturais.Decorator;

abstract public class EmployeeDecorator implements Employee {

    protected Employee employeeDecorated;

    public EmployeeDecorator(Employee employeeDecorated) {
        this.employeeDecorated = employeeDecorated;
    }

    @Override
    public double calculateSalary() {
        return employeeDecorated.calculateSalary();
    }
}
