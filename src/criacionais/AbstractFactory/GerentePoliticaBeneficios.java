package criacionais.AbstractFactory;

public class GerentePoliticaBeneficios implements PoliticaBeneficios {
    @Override
    public void provePoliticaDeBeneficios() {
        System.out.println("Provendo benefícios para Gerente");
    }
}
