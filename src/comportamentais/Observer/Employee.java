package comportamentais.Observer;

public class Employee implements Observer {
    private String name;

    public Employee(String name) {
        this.name = name;
    }

    @Override
    public void update(String news) {
        System.out.println(name + " received the latest news: " + news);
    }
}
