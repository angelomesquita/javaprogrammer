package estruturais.Bridge;

public class Iphone extends Device {

    public Iphone(OperationSystem os) {
        super(os);
    }

    @Override
    void start() {
        System.out.println("Iniciando o Iphone com o sistema operacional: " );
        os.run();
    }
}
