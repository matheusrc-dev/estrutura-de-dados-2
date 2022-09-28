package aps.buscaordenacao;

public class SelectionSort extends Sort {

    public SelectionSort(int[] matriz) {
        super(matriz);
        this.selectionSort();
    }

    private void selectionSort() {
        int menor, aux;

        // a última posição não precisa ser ordenada
        for (int i = 0; i < this.TAM - 1; i++) {
            menor = i;
            for (int j = i + 1; j < this.TAM; j++) {
                this.comparacoes++;
                if (matriz[j] < matriz[menor]) {
                    menor = j;
                }
            }

            // evita trocar o elemento com ele mesmo
            this.comparacoes++;
            if (i != menor) {
                aux = matriz[i];
                matriz[i] = matriz[menor];
                matriz[menor] = aux;
                this.trocas++;
            }
        }

        System.out.println("Selection Sort | Comparações: " + this.comparacoes + " Trocas: " + this.trocas);
    }
}
