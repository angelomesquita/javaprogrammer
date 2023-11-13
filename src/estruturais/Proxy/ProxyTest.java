package estruturais.Proxy;

public class ProxyTest {

    public static void main(String[] args) {
        DataService realService = new ConcreteDataService();

        DataService proxy = new DataServiceProxy(realService);

        proxy.fetchData();
    }

}
