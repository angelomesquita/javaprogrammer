package comportamentais.Visitor;

public class Developer implements Employee {
    private String name;
    private double numberOfBugsFixed;

    public Developer(String name, double numberOfBugsFixed) {
        this.name = name;
        this.numberOfBugsFixed = numberOfBugsFixed;
    }

    public String getName() {

        return name;
    }

    public double getNumberOfBugsFixed() {

        return numberOfBugsFixed;
    }

    @Override
    public void accept(Visitor visitor) {

        visitor.visit(this);
    }
}
