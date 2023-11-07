package estruturais.Composite;

public class CompositeTest {

    public static void main(String[] args) {
        // Criar os funcionários (parte)
        Employee employee1 = new Employee("Funcionário 1");
        Employee employee2 = new Employee("Funcionário 2");
        Employee employee3 = new Employee("Funcionário 3");

        // Criar departamentos e adicionar funcionários
        Department ti = new Department("TI");
        ti.add(employee1);
        ti.add(employee2);
        ti.add(employee3);

        Department mkt = new Department("Marketing");
        mkt.add(employee1);
        mkt.add(employee2);

        Department filial1 = new Department("Filial 1");
        filial1.add(ti);
        filial1.add(mkt);

        // Exibir a estrutura organizacional
        Department matriz = new Department("Matriz");
        matriz.add(filial1);

        matriz.display();
        System.out.println("================================");
        filial1.display();
        System.out.println("================================");
        ti.display();
        System.out.println("================================");
        employee1.display();
    }
}
