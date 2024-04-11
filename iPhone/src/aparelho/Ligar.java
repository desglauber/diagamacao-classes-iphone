package aparelho;

public class Ligar implements AparelhoTelefonico {

    @Override
    public void telefone() {
        System.out.println("Ligando para contato...");
    }

}
