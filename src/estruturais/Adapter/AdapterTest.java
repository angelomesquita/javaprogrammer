package estruturais.Adapter;

public class AdapterTest {
    public static void main(String[] args) {
        // chamada no formato antigo
        OldSystem oldSystem = new LegacySystem();
        oldSystem.doSomethingOld();
        // chamada no novo formato
        NewSystem newSystem = new ModernSystem();
        newSystem.doSomething();
        // chamada usando o adapter
        NewSystem adaptedSystem = new Adapter(oldSystem);
        adaptedSystem.doSomething();
    }
}
