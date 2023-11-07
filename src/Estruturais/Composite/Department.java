package Estruturais.Composite;

import java.util.ArrayList;
import java.util.List;

public class Department implements OrganizationComponent {
    private String name;
    private List<OrganizationComponent> children = new ArrayList<>();

    public Department(String name) {
        this.name = name;
    }

    public void add(OrganizationComponent component) {
        children.add(component);
    }

    public void remove(OrganizationComponent component) {
        children.remove(component);
    }

    @Override
    public void display() {
        System.out.println("Departamento: " + name);
        for (OrganizationComponent component: children) {
            component.display();
        }
    }
}
