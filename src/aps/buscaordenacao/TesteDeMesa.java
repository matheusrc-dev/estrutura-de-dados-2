package aps.buscaordenacao;

public class TesteDeMesa {
    int[] primeiroArranjo = {10, 9, 8, 7, 6, 5, 4, 3, 2, 1};
    int[] segundoArranjo = {10, 1, 9, 2, 8, 3, 7, 4, 6, 5};
    int[] terceiroArranjo = {4, 5, 6, 1, 2, 3, 7, 8, 9, 10};

    public TesteDeMesa() {
        this.printArranjos();
        this.arranjosComSelectionSort();
        this.reset();
        this.arranjosComBubbleSort();
        this.reset();
        this.arranjosComInsertionSort();
    }

    /**
     *
     */
    public void arranjosComSelectionSort() {
        System.out.println("SELECTION SORT");
        new SelectionSort(this.primeiroArranjo);
        new SelectionSort(this.segundoArranjo);
        new SelectionSort(this.terceiroArranjo);
        System.out.println();

    }

    /**
     *
     */
    public void arranjosComBubbleSort() {
        System.out.println("BUBBLE SORT");
        new BubbleSort(this.primeiroArranjo);
        new BubbleSort(this.segundoArranjo);
        new BubbleSort(this.terceiroArranjo);
        System.out.println();

    }

    /**
     *
     */
    public void arranjosComInsertionSort() {
        System.out.println("INSERTION SORT");
        new InsertionSort(this.primeiroArranjo);
        new InsertionSort(this.segundoArranjo);
        new InsertionSort(this.terceiroArranjo);
        System.out.println();
    }

    public void printArranjos() {
        System.out.println("Primeiro Arranjo: " +  Utils.printList(primeiroArranjo));
        System.out.println("Segundo Arranjo: " +  Utils.printList(segundoArranjo));
        System.out.println("Terceiro Arranjo: " +  Utils.printList(terceiroArranjo) + "\n");
    }

    public void reset() {
        primeiroArranjo = new int[]{10, 9, 8, 7, 6, 5, 4, 3, 2, 1};
        segundoArranjo = new int[]{10, 1, 9, 2, 8, 3, 7, 4, 6, 5};
        terceiroArranjo = new int[]{4, 5, 6, 1, 2, 3, 7, 8, 9, 10};
    }
}
