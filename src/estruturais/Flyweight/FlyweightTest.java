package estruturais.Flyweight;

public class FlyweightTest {

    public static void main(String[] args) {


        FlyweightFactory factory = new FlyweightFactory();

        Flyweight flyweight1 = factory.getFlyweight("A");
        flyweight1.operation("1");

        Flyweight flyweight2 = factory.getFlyweight("B");
        flyweight2.operation("2");

        Flyweight flyweight3 = factory.getFlyweight("C");
        flyweight3.operation("3");

    }

}
