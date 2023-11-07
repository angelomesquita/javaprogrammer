package Criacionais.AbstractFactory;

public class FuncionarioForm implements Form {
    @Override
    public void fillForm() {
        System.out.println("Preenchendo formulário para Funcionário");
    }
}
