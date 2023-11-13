package comportamentais.Visitor;

public class VisitorTest {

    public static void main(String[] args) {

        Employee manager = new Manager("Manager", 2000);
        Employee developer = new Developer("Developer", 50);

        Visitor salaryVisitor = new SalaryVisitor();

        manager.accept(salaryVisitor);
        developer.accept(salaryVisitor);

    }


}
