package sortingalgorithms;

import java.util.Random;

public class Arranjo
{
    private int tam;
    private int[] numeros;

    public Arranjo()
    {
        this(10);
        // se não for passado parâmetro, assume
        // 10 elementos para o construtor abaixo
    }

    public Arranjo(int tam)
    {
        this.tam = tam;
        this.numeros = new int[tam];

        Random gerador = new Random();
        for (int i = 0; i < this.tam; i++)
            this.numeros[i] = gerador.nextInt(100);
        // gera inteiros entre 0 e 99
    }

    public String toString()
    {
        String aux = "" + this.numeros[0];
        // com isso, o inteiro é convertido para String

        for (int i = 1; i < this.tam; i++)
            aux = aux + "\t" + this.numeros[i];
        // evita que se tenha um \t depois do último número

        aux = aux + "\n";

        return aux;
    }

    public void selectionSort()
    {
        int menor = 0, aux = 0;

        // a última posição não precisa ser ordenada
        for (int i = 0; i < this.tam - 1; i++)
        {
            menor = i;
            for( int j = i + 1; j < this.tam; j++)
            {
                if (this.numeros[j] < this.numeros[menor])
                    menor = j;
            }

            // evita trocar o elemento com ele mesmo
            if(i != menor)
            {
                aux = this.numeros[i];
                this.numeros[i] = this.numeros[menor];
                this.numeros[menor] = aux;
            }
        }
    }

   /*
    Nota sobre o uso da palavra-reservada this.
    - - -
    Com o uso do this, no métodos, a implementação fica mais aderente
    ao paradigma Orientado a Objetos, uma vez que os atributos são
    distinguidos das variáveis locais.

    Sem o uso do this, tem-se menor sobrecarga visual, melhorando a
    legibilidade e possível entendimento do método de ordenação em
    si.

    A escolha de um ou de outro não se considera um agravante, uma
    vez que há poucas variáveis e atributos envolvidos.
    */
}