package aps.buscaordenacao;

public class Main {
    public static void main(String[] args) {
        ordena3();
        maior3();
        crescente();
        testeDeMesa();
        bubbleMelhor();
        selectionRecursivo();
        megaSena();
        ordenados();
        pesquisa();
        bingo();
        enigmaSort();
        gnomeSort();
    }

    /**
     * 1
     */
    public static void ordena3() {
        System.out.println("================================");
        System.out.println("            ORDENA 3            ");
        System.out.println("================================");

        new Ordena3(3,1,2);
    }

    /**
     * 2
     */
    public static void maior3() {
        System.out.println("================================");
        System.out.println("             MAIOR 3            ");
        System.out.println("================================");
        new Maior3(44, 2, 32);
    }

    /**
     * 3
     */
    public static void crescente() {
        System.out.println("================================");
        System.out.println("           CRESCENTE 3          ");
        System.out.println("================================");
        int[] matrizCrescente = {1,2,3,4,5,6,7,8,9,10,11,12,12,12,15,16,17,18,19,20};
        int[] matrizDesordenada = {1,2,3,4,5,6,7,8,9,10,11,12,13,15,14,16,17,19,18,20};

        new Crescente(matrizCrescente);
        new Crescente(matrizDesordenada);
    }

    /**
     * 4
     */
    public static void testeDeMesa() {
        System.out.println("================================");
        System.out.println("          TESTE DE MESA         ");
        System.out.println("================================");

        new TesteDeMesa();
    }

    /**
     * 5
     */
    public static void bubbleMelhor() {
        System.out.println("================================");
        System.out.println("          BUBBLE MELHOR         ");
        System.out.println("================================");

        int[] matriz = { 1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20 };

        System.out.println("Matriz antes: " + Utils.printList(matriz));
        new BubbleMelhor(matriz);
        System.out.println("Matriz depois: " + Utils.printList(matriz));
    }

    /**
     * 6
     */
    public static void selectionRecursivo() {
        System.out.println("================================");
        System.out.println("       SELECTION RECURSIVO      ");
        System.out.println("================================");


        int[] matriz = Utils.generateRandomList(20);


        System.out.println("Matriz antes: " + Utils.printList(matriz));
        new SelectionSortRecursivo(matriz);
        System.out.println("Matriz depois: " + Utils.printList(matriz));

    }

    /**
     * 7
     */
    public static void megaSena() {
        System.out.println("================================");
        System.out.println("            MEGA SENA           ");
        System.out.println("================================");


        new MegaSena();
    }

    /**
     * 8
     */
    public static void ordenados() {
        // Sorteia um número pequeno e soma com o anterior
        System.out.println("================================");
        System.out.println("   ORDENADOS - Não finalizado   ");
        System.out.println("================================");

        new Ordenados();
    }

    /**
     * 9
     */
    public static void bingo() {
        // Ele é uma matriz bidimensional mas apresentada como uma uni
        // cada numero sortado voce vai procurar na matriz do bingo pra
        // ver se ja esta lá e se não estiver você insere na posição correta

        System.out.println("================================");
        System.out.println("              BINGO             ");
        System.out.println("================================");

        new Bingo();
    }

    /**
     * 10
     */
    public static void enigmaSort() {
        System.out.println("================================");
        System.out.println("           ENIGMA SORT          ");
        System.out.println("================================");

        //  Ele fica embaralhando os números até chegar uma hora em que ele
        //  fica completamente ordenado

        System.out.println("O algorítmo gera índices aleatórios para fazer a troca entre dois elementos \n" +
                "depois disso o vetor é percorrido para ver se este está ordenado, caso estiver o laço para\n" +
                "caso não esteja continua gerando índices aleatórios e realizando trocas");
    }

    /**
     * 11
     */

    public static void gnomeSort() {
        System.out.println("================================");
        System.out.println("           GNOME SORT           ");
        System.out.println("================================");

        int[] matriz = Utils.generateRandomList(20);

        System.out.println("Matriz antes: " + Utils.printList(matriz));
        new GnomeSort(matriz);
        System.out.println("Matriz depois: " + Utils.printList(matriz));

    }

    // 12 - ver se quem era o maior vai ficar na posição de onde ele estava antes
    // e nao fazer a troca

    // 13 Colocar os passageiros conforme eles vão chegando e não ordenar depois
    // que já estão sentados, pares são janelas impares corredor

    // 14


    /**
     * 15
     */
    public static void pesquisa() {
        System.out.println("================================");
        System.out.println("            PESQUISA            ");
        System.out.println("================================");

        System.out.println("Quando se tem uma matriz unidimensional já \n" +
                "ordenada é possível realizar a busca dos elementos fazendo\n" +
                "o uso de técnicas que só poderiam ser aplicadas caso o\n" +
                "conjunto de dados estivesse devidamente ordenado. O que \n" +
                "não é possível em listas desornadas, sendo necessário passar\n" +
                "por todo o conjunto para encontrar o valor desejado entre\n" +
                "os elementos.");
    }

    // 16
    // 17
    // 18 verificar se esta repetido na linha, coluna, quadrante e considerar
    // que os números são entre o intervalo de 1 a 9
}
