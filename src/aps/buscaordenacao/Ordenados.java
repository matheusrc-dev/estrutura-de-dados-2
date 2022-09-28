package aps.buscaordenacao;

public class Ordenados {
    private int TAM;
    private int[] matriz;
    public Ordenados() {
        this(20);
    }
    public Ordenados(int TAM) {
        this.TAM = TAM;
        this.matriz = this.gerarMatriz();

        System.out.println(Utils.printList(this.matriz));
    }

    public int[] gerarMatriz() {
        int[] list = new int[this.TAM];
        for(int i = 0; i < this.TAM; i++) {
            list[i] = (int) Math.round(Math.random() * 100);
        }

        return list;
    }
}
