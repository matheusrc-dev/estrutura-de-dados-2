package aps.buscaordenacao;

public class Maior3 {
    public Maior3(int x, int y, int z) {
        int maior = x;

        if (y > maior)
            maior = y;
        if (z > maior)
            maior = z;

        System.out.println("O maior valor entre: " + x + " " + y + " " + z + " é o: " + maior);
    }
}
