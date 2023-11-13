package comportamentais.Iterator;

import java.util.Iterator;

public class IteratorTest {

    public static void main(String[] args) {
        EmployeeCollection employeeCollection = new EmployeeCollection();
        employeeCollection.addEmployee(new Employee("1", 101));
        employeeCollection.addEmployee(new Employee("2", 102));
        employeeCollection.addEmployee(new Employee("3", 103));

        Iterator<Employee> iterator = employeeCollection.iterator();
        while (iterator.hasNext()) {
            Employee employee = iterator.next();
            System.out.println("Employee: " + employee.getName() + ", ID: " + employee.getEmployeeId());
        }
     }

}
