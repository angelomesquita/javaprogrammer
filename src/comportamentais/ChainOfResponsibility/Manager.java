package comportamentais.ChainOfResponsibility;

public class Manager implements ExpenseHandler {
    private double approvalLimit;
    private String name;
    private ExpenseHandler nextHandler;

    public Manager(String nome, double approvalLimit) {
        this.name = nome;
        this.approvalLimit = approvalLimit;
    }

    @Override
    public void approveExpense(Expense expense) {
        if (expense.getAmount() <= approvalLimit) {
            System.out.println(name + " approved the expense: " + expense.getDescription());
        } else if (nextHandler != null) {
            if (nextHandler instanceof Manager) {
                System.out.println(name + " cannot approve. Passing to " + ((Manager) nextHandler).getName());
                nextHandler.approveExpense(expense);
            }
        } else {
            System.out.println("No one can approve the expense: " + expense.getDescription());
        }
    }

    @Override
    public void setNextHandler(ExpenseHandler nextHandler) {
        this.nextHandler = nextHandler;
    }

    public String getName() {
        return name;
    }
}
