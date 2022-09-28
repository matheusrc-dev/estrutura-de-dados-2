package aps.buscaordenacao;

public class BubbleMelhor extends Sort{
    public BubbleMelhor(int[] matriz) {
        super(matriz);
        this.bubbleMelhor();
    }

    public void bubbleMelhor() {
        int aux;
        int[] numeros = matriz;

        for (int i = 0; i < this.TAM - 1; i++) {
            for (int j = 0; j < (this.TAM - i - 1); j++) {
                if (numeros[j] > numeros[j + 1]) {
                    this.comparacoes++;
                    aux = numeros[j];
                    numeros[j] = numeros[j + 1];
                    numeros[j + 1] = aux;
                }
            }

            // Matriz já ordenada
            if(this.comparacoes == 0)
                return;
        }
    }
}
