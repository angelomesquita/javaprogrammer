package estruturais.Proxy;

public class ConcreteDataService implements DataService {
    @Override
    public void fetchData() {
        System.out.println("Fetching data from the database");
    }
}
