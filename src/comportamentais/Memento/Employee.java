package comportamentais.Memento;

public class Employee {
    private String name;
    private String position;
    private int salary;

    public Employee(String name, String position, int salary) {
        this.name = name;
        this.position = position;
        this.salary = salary;
    }

    public EmployeeMemento save() {
        return new EmployeeMemento(name, position, salary);
    }

    public void restore(EmployeeMemento memento) {
        this.name = memento.getName();
        this.position = memento.getPosition();
        this.salary = memento.getSalary();
    }

    public void promote(String newPosition) {
        this.position = newPosition;
        this.salary += 5000;
    }

    public void increaseSalary(int amount) {
        this.salary += amount;
    }

    public String toString() {
        return "Employee [name=" + name + ", position=" + position + ", salary=" + salary + "]";
    }
}
