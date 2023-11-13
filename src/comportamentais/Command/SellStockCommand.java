package comportamentais.Command;

public class SellStockCommand implements Command {

    private Stock stock;

    public SellStockCommand(Stock stock) {
        this.stock = stock;
    }

    @Override
    public void execute() {
        stock.sell();
    }
}
