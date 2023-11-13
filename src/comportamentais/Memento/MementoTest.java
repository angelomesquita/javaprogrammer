package comportamentais.Memento;

public class MementoTest {

    public static void main(String[] args) {

        Employee employee = new Employee("Name", "Position", 50000);
        CareTaker careTaker = new CareTaker();

        careTaker.saveMemento(employee.save());

        employee.promote("new Position");
        employee.increaseSalary(2000);

        careTaker.saveMemento(employee.save());

        System.out.println("Current state: " + employee);

        employee.restore(careTaker.getMemento(0));
        System.out.println("After restoring to initial state: " + employee);

    }

}
