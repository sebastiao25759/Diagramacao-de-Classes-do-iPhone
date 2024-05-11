import iphone.features.AparelhoTelefonico;
import iphone.features.NavegadorInternet;
import iphone.features.ReprodutorMusical;

public class Iphone implements ReprodutorMusical, AparelhoTelefonico, NavegadorInternet {

    public static void main(String[] args) {
        Iphone iphone = new Iphone();

        System.out.println("REPRODUTOR MUSICAL");
        iphone.selecionarMusica();
        iphone.tocar();
        iphone.pausar();

        System.out.println("APARELHO TELEFONICO");
        iphone.ligar();
        iphone.atender();
        iphone.iniciarCorreioVoz();

        System.out.println("NAVEGADOR INTERNET");
        iphone.exibirPagina();
        iphone.adicionarNovaAba();
        iphone.atualizarPagina();
    }

}
