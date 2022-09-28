package sortingalgorithms;

public class MergeSort {
    int[] aux;
    /**
     *  Retorna uma lista de inteiros ordenada utilizando
     *  o método de ordenação merge sort
     *
     * @param list A lista a ser ordenada
     */
    public MergeSort(int[] list) {
        aux = new int[list.length];
        System.out.println("==========================================");
        System.out.println("                Merge Sort                ");
        System.out.println("==========================================");
        System.out.println("Lista pré ordenação");
        Utils.printList(list);
        System.out.println("");
        System.out.println("Lista pós ordenação");
        int inicio = 0;
        int fim = list.length - 1;
        mergeSort(list, inicio, fim);
        Utils.printList(list);

    }

    private void mergeSort(int[] lista, int inicio, int fim) {
        if(inicio < fim){
            int meio = ( inicio + fim ) / 2;
            mergeSort(lista, inicio, meio);
            mergeSort(lista, meio + 1, fim);
            merge(lista, inicio, meio, fim);
        }
    }

    private void merge(int[] lista, int inicio, int meio, int fim) {
        int i = 0;
        int j = 0;
        int k = 0;

        for(i = meio + 1; i > inicio; i--)
            this.aux[i-1] = lista[i-1];

        for(j = meio; j < fim; j++)
            this.aux[fim + meio - j] = lista[j + 1];

        for(k = inicio; k <= fim; k++)
            if(aux[j] < aux[i])
                lista[k] = this.aux[j--];
            else
                lista[k] = aux[i++];
    }
}
