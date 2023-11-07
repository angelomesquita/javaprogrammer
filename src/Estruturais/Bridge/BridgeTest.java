package Estruturais.Bridge;

public class BridgeTest {

    public static void main(String[] args) {

        Device samsungS23 = new Smartphone(new Android());
        Device motorolaG60 = new Smartphone(new Android());

        Device iphone = new Iphone(new IOS());
        Device iphone15 = new Iphone(new IOS());

        Device ipad = new Ipad(new IOS());


        samsungS23.start();
        motorolaG60.start();
        iphone.start();
        iphone15.start();
        ipad.start();
    }
}
