package comportamentais.Command;

public class CommandTest {

    public static void main(String[] args) {

        Stock stock = new Stock();

        BuyStockCommand buyStockCommand = new BuyStockCommand(stock);
        SellStockCommand sellStockCommand = new SellStockCommand(stock);

        Broker broker = new Broker();

        broker.setCommand(buyStockCommand);
        broker.executeCommand();

        broker.setCommand(sellStockCommand);
        broker.executeCommand();
    }
}
