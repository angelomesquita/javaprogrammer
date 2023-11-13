package estruturais.Decorator;

public class DecoratorTest {

    public static void main(String[] args) {

        // Funcionário base com salario de 5000
        Employee baseEmployee = new BaseEmployee(5000);

        // Adicionando 1000 de bônus
        Employee employeeWithBonus = new BonusDecorator(baseEmployee, 1000);

        // Adicionando 500 de benefícios
        Employee employeeWithBenefits = new BonusDecorator(employeeWithBonus, 500);

        // Salário final
        double finalSalary = employeeWithBenefits.calculateSalary();
        System.out.println("Salário Final: " + finalSalary);
    }
}
