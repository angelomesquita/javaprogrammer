public class GerenteFactory extends AbstractFactory {

    @Override
    public Form gerarForm() {
        return new GerenteForm();
    }

    @Override
    public PoliticaBeneficios criarPoliticaBeneficios() {
        return new GerentePoliticaBeneficios();
    }
}
