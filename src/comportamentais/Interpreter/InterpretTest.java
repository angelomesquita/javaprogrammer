package comportamentais.Interpreter;

public class InterpretTest {

    public static void main(String[] args) {

        Context context = new Context();
        context.setVariable("x", 5);
        context.setVariable("y", 10);

        Expression expression1 = new VariableExpression("x");
        Expression expression2 = new VariableExpression("y");
        Expression expression3 = new AddExpression(expression1, expression2);

        System.out.println("Result: " + expression3.interpret(context));

    }

}
