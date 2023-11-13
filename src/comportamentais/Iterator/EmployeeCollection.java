package comportamentais.Iterator;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class EmployeeCollection  implements Iterable<Employee> {
    private List<Employee> employees;

    public EmployeeCollection() {
        this.employees = new ArrayList<>();
    }

    public void addEmployee(Employee employee) {
        employees.add(employee);
    }

    @Override
    public Iterator<Employee> iterator() {
        return new EmployeeIterator();
    }

    private class EmployeeIterator implements Iterator<Employee> {
        private int index;

        @Override
        public boolean hasNext() {
            return index < employees.size();
        }

        @Override
        public Employee next() {
            if (hasNext()) {
                return employees.get(index++);
            } else {
                throw new IndexOutOfBoundsException("No more elements in the collection");
            }
        }
    }
}
