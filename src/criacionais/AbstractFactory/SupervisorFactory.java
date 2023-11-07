package criacionais.AbstractFactory;

public class SupervisorFactory implements AbstractFactory {
    @Override
    public Form gerarForm() {

        return new SupervisorForm();
    }

    @Override
    public PoliticaBeneficios criarPoliticaBeneficios() {

        return new SupervisorPoliticaBeneficios();
    }
}
