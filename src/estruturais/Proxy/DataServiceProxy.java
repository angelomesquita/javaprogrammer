package estruturais.Proxy;

public class DataServiceProxy  implements DataService {
    private DataService realService;

    public DataServiceProxy(DataService realService) {
        this.realService = realService;
    }

    @Override
    public void fetchData() {

        System.out.println("Proxy: Verifying access...");

        realService.fetchData();

        System.out.println("Proxy: Loggin the access ....");
    }
}
