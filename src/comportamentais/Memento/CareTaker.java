package comportamentais.Memento;

import java.util.ArrayList;
import java.util.List;

public class CareTaker {

    private List<EmployeeMemento> mementos = new ArrayList<>();

    public void saveMemento(EmployeeMemento memento) {
        mementos.add(memento);
    }

    public EmployeeMemento getMemento(int index) {
        return mementos.get(index);
    }

}
