package estruturais.Adapter;

public class Adapter implements NewSystem {

    private OldSystem oldSystem;

    public Adapter(OldSystem oldSystem) {
        this.oldSystem = oldSystem;
    }

    @Override
    public void doSomething() {
        System.out.println("ADAPTER");
        oldSystem.doSomethingOld();
    }
}
