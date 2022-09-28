package aps.buscaordenacao;

import java.sql.SQLOutput;

public class Bingo {
    int[][] cartela;
    public Bingo() {
        this.cartela = new int[5][5];
        this.gerarCartela();
        System.out.println(this.printMatriz(this.cartela));
    }

    public void gerarCartela() {
        for(int i = 0; i < this.cartela.length; i++) {
            for(int j = 0; j < this.cartela[i].length; j++) {
                int number = (int) Math.round(Math.random() * (i + 1) * 10);

                while (this.contains(this.cartela, number)) {
                    number = (int) Math.round(Math.random() * (i + 1) * 10);
                }

                this.cartela[j][i] = number;
            }
        }
    }

    public boolean contains(int[][] matriz, int element) {
        for(int i = 0; i < matriz.length; i++) {
            for(int j = 0; j < matriz[i].length; j++) {
                if(matriz[i][j] == element) {
                    return true;
                }
            }
        }

        return false;
    }

    public String printMatriz(int[][] matriz) {
        String str = "";
        for(int i = 0; i < matriz.length; i++) {
            for(int j = 0; j < matriz[i].length; j++) {
                str += matriz[i][j] + "\t";
            }
            str += "\n";
        }

        return str;
    }
}
