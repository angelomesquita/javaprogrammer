package Estruturais.Bridge;

public class Smartphone extends Device {

    public Smartphone(OperationSystem os) {
        super(os);
    }

    @Override
    void start() {
        System.out.println("Iniciando o smartphone com o sistema operacional: ");
        os.run();
    }
}
