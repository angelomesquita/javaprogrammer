package comportamentais.Mediator;

public class MediatorTest {

    public static void main(String[] args) {

        ConcreteMediator mediator = new ConcreteMediator();

        ConcreteColleague colleague1 = new ConcreteColleague("1", mediator);
        ConcreteColleague colleague2 = new ConcreteColleague("2", mediator);
        ConcreteColleague colleague3 = new ConcreteColleague("3", mediator);

        mediator.addColleague(colleague1);
        mediator.addColleague(colleague2);
        mediator.addColleague(colleague3);

        colleague1.sendMessage("Hello, colleagues!");
    }

}
