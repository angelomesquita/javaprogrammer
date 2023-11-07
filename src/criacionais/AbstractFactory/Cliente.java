package criacionais.AbstractFactory;

public class Cliente {
    public static void main(String[] args) {

        String cargo = "Supervisor";
        AbstractFactory factory;
        if (cargo.equals("Gerente")) {
            factory = new GerenteFactory();
        } else if (cargo.equals("Funcionario")) {
            factory = new FuncionarioFactory();
        } else if (cargo.equals("Supervisor")) {
            factory = new SupervisorFactory();
        } else {
            factory = new EstagiarioFactory();
        }

        Form form = factory.gerarForm();
        PoliticaBeneficios politica = factory.criarPoliticaBeneficios();

        form.fillForm();
        politica.provePoliticaDeBeneficios();

    }
}