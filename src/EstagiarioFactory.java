public class EstagiarioFactory extends AbstractFactory {

    @Override
    public Form gerarForm() {

        return new EstagiarioForm();
    }

    @Override
    public PoliticaBeneficios criarPoliticaBeneficios() {

        return new EstagiarioPoliticaBeneficios();
    }
}
