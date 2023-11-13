package comportamentais.Command;

public class BuyStockCommand implements Command {

    private Stock stock;

    public BuyStockCommand(Stock stock) {
        this.stock = stock;
    }

    @Override
    public void execute() {
        stock.buy();
    }
}
