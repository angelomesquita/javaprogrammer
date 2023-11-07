package Estruturais.Adapter;

public class LegacySystem implements OldSystem {
    @Override
    public void doSomethingOld() {
        System.out.println("Fazendo alguma coisa no sistema legado....");
    }
}
