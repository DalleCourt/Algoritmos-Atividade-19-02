package Exer_26_02;

public class ListaLinearEstaticaGenerica<T> {

    private T[] info;
    private int tamanho;

    @SuppressWarnings("unchecked")
    public ListaLinearEstaticaGenerica(int capacidade) {
        info = (T[]) new Object[capacidade];
        tamanho = 0;
    }

    // Inserir no final
    public void inserir(T valor) {
        if (tamanho == info.length) {
            throw new RuntimeException("Lista cheia!");
        }
        info[tamanho] = valor;
        tamanho++;
    }

    // Retornar tamanho
    public int getTamanho() {
        return tamanho;
    }

    // Obter elemento por índice
    public T obter(int indice) {
        if (indice < 0 || indice >= tamanho) {
            throw new IndexOutOfBoundsException("Índice inválido!");
        }
        return info[indice];
    }

    // Verificar se está vazia
    public boolean estaVazia() {
        return tamanho == 0;
    }

    // Remover por índice
    public void remover(int indice) {
        if (indice < 0 || indice >= tamanho) {
            throw new IndexOutOfBoundsException("Índice inválido!");
        }

        for (int i = indice; i < tamanho - 1; i++) {
            info[i] = info[i + 1];
        }

        tamanho--;
    }

    // 🔁 Método inverter (SEM criar novo vetor)
    public void inverter() {

        int inicio = 0;
        int fim = tamanho - 1;

        while (inicio < fim) {

            T temp = info[inicio];
            info[inicio] = info[fim];
            info[fim] = temp;

            inicio++;
            fim--;
        }
    }

    @Override
    public String toString() {

        if (tamanho == 0) {
            return "";
        }

        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < tamanho; i++) {
            sb.append(info[i]);

            if (i < tamanho - 1) {
                sb.append(",");
            }
        }

        return sb.toString();
    }
}

