package aps.buscaordenacao;

public class Crescente {
    public Crescente(int[] matriz) {
        int maior = -1;
        boolean isOrdenada = true;

        for(int i = 0; i < matriz.length; i++) {
            if(matriz[i] >= maior)
                maior = matriz[i];
            else {
                isOrdenada = false;
                break;
            }
        }

        System.out.println("A matriz está em ordem crescente? " + isOrdenada);
    }
}
