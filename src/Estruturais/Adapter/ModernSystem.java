package Estruturais.Adapter;

public class ModernSystem  implements NewSystem {
    @Override
    public void doSomething() {
        System.out.println("Fazendo alguma coisa no novo sistema....");
    }
}
