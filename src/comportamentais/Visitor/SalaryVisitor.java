package comportamentais.Visitor;

public class SalaryVisitor implements Visitor {
    @Override
    public void visit(Manager manager) {
        System.out.println("Calculating salary for manager: " + manager.getName());
        double totalSalary = manager.getBonus() + 5000;
        System.out.println("Total salary: R$" + totalSalary);
    }

    @Override
    public void visit(Developer developer) {
        System.out.println("Calculating salary for developer: " + developer.getName());
        double totalSalary = 2000 + developer.getNumberOfBugsFixed() * 100;
        System.out.println("Total salary: R$" + totalSalary);
    }
}
