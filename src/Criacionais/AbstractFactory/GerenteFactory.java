package Criacionais.AbstractFactory;

public class GerenteFactory implements AbstractFactory {

    @Override
    public Form gerarForm() {
        return new GerenteForm();
    }

    @Override
    public PoliticaBeneficios criarPoliticaBeneficios() {
        return new GerentePoliticaBeneficios();
    }
}
