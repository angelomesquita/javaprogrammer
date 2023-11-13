package comportamentais.ChainOfResponsibility;

public interface ExpenseHandler {

    void approveExpense(Expense expense);
    void setNextHandler(ExpenseHandler nextHandler);


}
