package iphone.features;

public interface NavegadorInternet {
        default void exibirPagina() {
            System.out.println("Exibindo Pagina");
        }
        default void adicionarNovaAba() {
            System.out.println("Adicionando novo Aba");
        }
        default void atualizarPagina() {
            System.out.println("Atualizando Pagina\n");
        }
}