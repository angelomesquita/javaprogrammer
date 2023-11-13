package comportamentais.ChainOfResponsibility;

public class ChainOfResponsibilityTest {

    public static void main(String[] args) {

        ExpenseHandler manager1 = new Manager("Manager 1", 1000);
        ExpenseHandler manager2 = new Manager("Manager 2", 5000);
        ExpenseHandler manager3 = new Manager("Manager 3", 10000);

        manager1.setNextHandler(manager2);
        manager2.setNextHandler(manager3);

        Expense expense1 = new Expense("Expense One", 800);
        Expense expense2 = new Expense("Expense Two", 5500);
        Expense expense3 = new Expense("Expense Three", 12000);

        manager1.approveExpense(expense1);
        manager1.approveExpense(expense2);
        manager1.approveExpense(expense3);
    }

}
