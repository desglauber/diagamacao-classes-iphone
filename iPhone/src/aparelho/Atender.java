package aparelho;

public class Atender implements AparelhoTelefonico {

    @Override
    public void telefone() {
        System.out.println("Atendendo chamada telefônica...");
    }

}
