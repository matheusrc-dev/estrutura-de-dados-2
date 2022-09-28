package aps.buscaordenacao;

public class BubbleSort extends Sort {
    public BubbleSort(int[] matriz) {
        super(matriz);
        this.bubbleSort();
    }

    public void bubbleSort() {

        int aux;
        int[] numeros = matriz;

        for (int i = 0; i < this.TAM - 1; i++) {
            for (int j = 0; j < (this.TAM - i - 1); j++) {
                this.comparacoes++;
                if (numeros[j] > numeros[j + 1]) {
                    aux = numeros[j];
                    numeros[j] = numeros[j + 1];
                    numeros[j + 1] = aux;
                    this.trocas++;
                }
            }
        }

        System.out.println("Bubble Sort | Comparações: " + this.comparacoes + " Trocas: " + this.trocas);
    }
}
