package aps.buscaordenacao;

public class GnomeSort extends Sort{
    public GnomeSort(int[] matriz) {
        super(matriz);
        this.gnomeSort();
    }

    public void gnomeSort() {
        int aux = 0;
        int index = 0;

        while (index < this.matriz.length - 1) {
            if(this.matriz[index]>this.matriz[index+1]){
                aux = this.matriz[index];
                this.matriz[index] = this.matriz[index+1];
                this.matriz[index+1] = aux;
                if(index>0){
                    index-=2;
                }
            }
            index++;
        }
    }
}
