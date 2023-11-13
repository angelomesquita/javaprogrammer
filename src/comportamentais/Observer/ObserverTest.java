package comportamentais.Observer;

public class ObserverTest {

    public static void main(String[] args) {
        CorporateNews corporateNews = new CorporateNews();

        Employee employee1 = new Employee("1");
        Employee employee2 = new Employee("2");

        corporateNews.addObserver(employee1);
        corporateNews.addObserver(employee2);

        corporateNews.setLatestNews("New Project announcement!!!");

        corporateNews.removeObserver(employee1);

        corporateNews.setLatestNews("Company holiday party next week!");
    }
}
