package aps.buscaordenacao;

public class Ordena3 {
    public Ordena3(int x, int y, int z) {
        System.out.println("Valores iniciais: " + x + " " + y + " " + z);
        int aux;

        if(x > y) {
            aux = x;
            x = y;
            y = aux;
        }

        if(y > z) {
            aux = y;
            y = z;
            z = aux;
        }

        if (x > y) {
            aux = x;
            x = y;
            y = aux;
        }

        System.out.println("Valores ordenados: " + x + " " + y + " " + z + "\n");
    }
}
