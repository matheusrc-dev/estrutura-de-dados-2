package aps.buscaordenacao;

public class Sort {
    protected int comparacoes;
    protected int trocas;

    protected int[] matriz;
    protected int TAM;

    public Sort() {
        comparacoes = 0;
        trocas = 0;
    }

    public Sort(int[] matriz) {
        this();
        this.matriz = matriz;
        this.TAM = matriz.length;
    }
}
