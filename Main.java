package Exer_19_02;

public class Main {

    public static void main(String[] args) {

        ListaLinearEstatica lista = new ListaLinearEstatica();

        lista.inserir(50);
        lista.inserir(-15);
        lista.inserir(12);
        lista.inserir(28);
        lista.inserir(91);

        lista.exibir();

        System.out.println("Buscar -15: posição = " + lista.buscar(-15));

        System.out.println("\nRemovendo -15...");
        lista.retirar(-15);

        lista.exibir();

        // Teste de redimensionamento
        for (int i = 0; i < 10; i++) {
            lista.inserir(i * 3);
        }

        System.out.println("\nApós várias inserções:");
        lista.exibir();
    }
}
