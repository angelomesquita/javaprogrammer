package criacionais.AbstractFactory;

public class FuncionarioPoliticaBeneficios implements PoliticaBeneficios{
    @Override
    public void provePoliticaDeBeneficios() {
        System.out.println("Provendo benefícios para Funcionarios");
    }
}
