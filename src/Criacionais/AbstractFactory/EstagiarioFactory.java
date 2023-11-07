package Criacionais.AbstractFactory;

public class EstagiarioFactory implements AbstractFactory {

    @Override
    public Form gerarForm() {

        return new EstagiarioForm();
    }

    @Override
    public PoliticaBeneficios criarPoliticaBeneficios() {

        return new EstagiarioPoliticaBeneficios();
    }
}
