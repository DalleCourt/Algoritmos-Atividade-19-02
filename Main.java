package Exer_26_02;

public class Main {

    public static void main(String[] args) {

        // =========================
        // Caso 10 - Quantidade PAR
        // =========================

        System.out.println("Caso 10 - PAR");

        ListaLinearEstaticaGenerica<Integer> listaPar =
                new ListaLinearEstaticaGenerica<>(10);

        listaPar.inserir(5);
        listaPar.inserir(10);
        listaPar.inserir(15);
        listaPar.inserir(20);

        listaPar.inverter();

        System.out.println("Esperado: 20,15,10,5");
        System.out.println("Obtido:   " + listaPar);


        // ==========================
        // Caso 11 - Quantidade ÍMPAR
        // ==========================

        System.out.println("\nCaso 11 - ÍMPAR");

        ListaLinearEstaticaGenerica<Integer> listaImpar =
                new ListaLinearEstaticaGenerica<>(10);

        listaImpar.inserir(5);
        listaImpar.inserir(10);
        listaImpar.inserir(15);
        listaImpar.inserir(20);
        listaImpar.inserir(25);

        listaImpar.inverter();

        System.out.println("Esperado: 25,20,15,10,5");
        System.out.println("Obtido:   " + listaImpar);
    }
}

