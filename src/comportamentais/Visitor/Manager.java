package comportamentais.Visitor;

public class Manager implements Employee {
    private String name;
    private double bonus;

    public Manager(String name, double bonus) {
        this.name = name;
        this.bonus = bonus;
    }

    public String getName() {
        return name;
    }

    public double getBonus() {
        return bonus;
    }

    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }
}
