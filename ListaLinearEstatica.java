package Exer_19_02;

public class ListaLinearEstatica {

    private int[] info;   // vetor
    private int tamanho;  // quantidade real de elementos

    // Algoritmo: criarLista()
    public ListaLinearEstatica() {
        info = new int[10];  // new int[10]
        tamanho = 0;         // tamanho ← 0
    }

    // size(info)
    private int size() {
        return info.length;
    }

    // Algoritmo: redimensionar()
    private void redimensionar() {

        int novoTamanho = size() + 10;
        int[] novo = new int[novoTamanho];

        for (int i = 0; i < tamanho; i++) {
            novo[i] = info[i];
        }

        info = novo; // aponta para o novo vetor
    }

    // Algoritmo: inserir(int valor)
    public void inserir(int valor) {

        if (tamanho == size()) {
            redimensionar();
        }

        info[tamanho] = valor;
        tamanho = tamanho + 1;
    }

    // Buscar elemento
    public int buscar(int valor) {

        for (int i = 0; i < tamanho; i++) {
            if (info[i] == valor) {
                return i;
            }
        }

        return -1;
    }

    // Retirar elemento
    public boolean retirar(int valor) {

        int posicao = buscar(valor);

        if (posicao == -1) {
            return false;
        }

        for (int i = posicao; i < tamanho - 1; i++) {
            info[i] = info[i + 1];
        }

        tamanho = tamanho - 1;

        return true;
    }

    // Método auxiliar para visualizar
    public void exibir() {

        System.out.print("Lista: ");

        for (int i = 0; i < tamanho; i++) {
            System.out.print(info[i] + " ");
        }

        System.out.println("\nTamanho atual: " + tamanho);
        System.out.println("Capacidade do vetor: " + size());
    }
}
