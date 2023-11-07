package estruturais.Bridge;

public class Ipad extends Device {

    public Ipad(OperationSystem os) {
        super(os);
    }

    @Override
    void start() {
        System.out.println("Iniciando o Ipad com o sistema operacional: ");
        os.run();
    }
}
