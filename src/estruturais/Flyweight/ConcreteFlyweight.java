package estruturais.Flyweight;

public class ConcreteFlyweight implements Flyweight {

    private String sharedState;

    public ConcreteFlyweight(String sharedState) {
        this.sharedState = sharedState;
    }

    @Override
    public void operation(String extrinsicState) {
        System.out.println("Flyweight: " + sharedState + ", Estado Externo: " + extrinsicState);
    }
}
