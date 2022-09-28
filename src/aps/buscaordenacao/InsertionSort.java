package aps.buscaordenacao;

public class InsertionSort extends Sort {
    public InsertionSort(int[] matriz) {
        super(matriz);
        this.insertionSort();
    }

    public void insertionSort() {


        int[] novo = new int[TAM];
        int j = 0;

        for (int i = 0; i < TAM; i++)
        {
            this.comparacoes++;
            for (j = i; j > 0 && this.matriz[i] < novo[j-1]; j--)
            {
                this.trocas++;
                novo[j] = novo[j-1];
            }
            this.trocas++;
            novo[j] = this.matriz[i];
        }

        System.out.println("Insertion Sort | Comparações: " + this.comparacoes + " Trocas: " + this.trocas);
    }
}


