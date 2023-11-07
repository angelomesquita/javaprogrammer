package Criacionais.AbstractFactory;

public class SupervisorPoliticaBeneficios implements PoliticaBeneficios {
    @Override
    public void provePoliticaDeBeneficios() {
        System.out.println("Provendo benefícios para Supervisor");
    }
}
