package Criacionais.AbstractFactory;

public class FuncionarioFactory implements AbstractFactory {

    @Override
    public Form gerarForm() {

        return new FuncionarioForm();
    }

    @Override
    public PoliticaBeneficios criarPoliticaBeneficios() {

        return new FuncionarioPoliticaBeneficios();
    }
}
