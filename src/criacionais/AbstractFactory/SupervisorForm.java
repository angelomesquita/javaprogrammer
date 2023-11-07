package criacionais.AbstractFactory;

public class SupervisorForm implements Form {
    @Override
    public void fillForm() {
        System.out.println("Preechendo formulário para Supervisor");
    }
}
