package iphone.features;

public interface ReprodutorMusical {
    default void selecionarMusica() {
        System.out.println("Selecionando Musica");
    }

    default void tocar() {
        System.out.println("Tocando Musica");
    }

    default void pausar() {
        System.out.println("Pausando Musica\n");
    }
}
