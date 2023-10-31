public class FuncionarioFactory extends AbstractFactory {

    @Override
    public Form gerarForm() {

        return new FuncionarioForm();
    }

    @Override
    public PoliticaBeneficios criarPoliticaBeneficios() {

        return new FuncionarioPoliticaBeneficios();
    }
}
