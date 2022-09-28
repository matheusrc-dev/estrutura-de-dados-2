package aps.buscaordenacao;

public class SelectionSortRecursivo extends Sort{
    public SelectionSortRecursivo(int[] matriz) {
        super(matriz);
        this.selectionSortRecusivo(matriz, this.TAM, 0);
    }

    /**
     * Retorna o índice que contém o menor elemento
     * da matriz entre um um intervalo de elementos
     */
    public int minIndex(int v[], int index, int j) {
        int min = index;
        for(int i = index + 1; i <= j; i++) {
            if(v[i] < v[min]) {
                min = i;
            }
        }

        return min;
    }

    /**
     * Selection sort recursivo
     * @param a O vetor a ser ordenado
     * @param n Tamanho do vetor
     * @param index O index do elemento inicial
     */
    public void selectionSortRecusivo(int a[], int n, int index)
    {
        if (index == n)
            return;

        int min = minIndex(a, index, n-1);

        if (min != index){
            int aux = a[min];
            a[min] = a[index];
            a[index] = aux;
        }
        selectionSortRecusivo(a, n, index + 1);
    }
}
