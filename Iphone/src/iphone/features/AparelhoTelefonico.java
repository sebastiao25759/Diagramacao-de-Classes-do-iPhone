package iphone.features;

public interface AparelhoTelefonico {
    default void ligar() {
        System.out.println("Ligando para o numero");
    }

    default void atender() {
        System.out.println("Atendendo chamada");
    }

    default void iniciarCorreioVoz() {
        System.out.println("Iniciando Correio Voz\n");
    }
}
