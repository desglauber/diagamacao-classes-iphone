import aparelho.AparelhoTelefonico;
import aparelho.Atender;
import aparelho.IniciarCorreioVoz;
import aparelho.Ligar;
import navegador.AdicionarNovaAba;
import navegador.AtualizarPagina;
import navegador.ExibirPagina;
import navegador.NavergarInternet;
import reprodutor.Pausar;
import reprodutor.ReprodutorMusical;
import reprodutor.SelecionarMusica;
import reprodutor.Tocar;

public class Iphone {
    public static void main(String[] args) throws Exception {
        
        //Reprodutor Musical
        ReprodutorMusical selecionar = new SelecionarMusica();
        ReprodutorMusical tocar = new Tocar();
        ReprodutorMusical pausar = new Pausar();

        System.out.println("-------------------");
        System.out.println("Usando o App Música");
        System.out.println("-------------------");
        selecionar.reproduzir();
        tocar.reproduzir();;
        pausar.reproduzir();

        //Aparelho Telefônico
        AparelhoTelefonico ligar = new Ligar();
        AparelhoTelefonico atender = new Atender();
        AparelhoTelefonico correio = new IniciarCorreioVoz();

        System.out.println("-------------------");
        System.out.println("Usando o Telefone");
        System.out.println("-------------------");
        ligar.telefone();
        atender.telefone();
        correio.telefone();

        //Navegador de Internet
        NavergarInternet exibir = new ExibirPagina();
        NavergarInternet adicionar = new AdicionarNovaAba();
        NavergarInternet atualizar = new AtualizarPagina();

        System.out.println("-------------------");
        System.out.println("Usando o Navegador de Internet");
        System.out.println("-------------------");
        exibir.navegar();
        adicionar.navegar();
        atualizar.navegar();
    }
}
