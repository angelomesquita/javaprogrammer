package comportamentais.Memento;

public class EmployeeMemento {
    private String name;
    private String position;
    private int salary;

    public EmployeeMemento(String name, String position, int salary) {
        this.name = name;
        this.position = position;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public String getPosition() {
        return position;
    }

    public int getSalary() {
        return salary;
    }
}
