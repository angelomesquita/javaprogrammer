package Estruturais.Bridge;

abstract public class Device {

    protected OperationSystem os;

    public Device(OperationSystem os) {
        this.os = os;
    }

    abstract void start();
}
