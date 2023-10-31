public class Cliente {
    public static void main(String[] args) {

        String cargo = "Gerente";
        AbstractFactory factory;
        if (cargo.equals("Gerente")) {
            factory = new GerenteFactory();
        } else if (cargo.equals("Funcionario")) {
            factory = new FuncionarioFactory();
        } else {
            factory = new EstagiarioFactory();
        }

        Form form = factory.gerarForm();
        PoliticaBeneficios politica = factory.criarPoliticaBeneficios();


        form.fillForm();
        politica.provePoliticaDeBeneficios();

    }
}