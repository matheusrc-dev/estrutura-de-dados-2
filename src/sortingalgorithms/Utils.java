package sortingalgorithms;

public class Utils {
    /**
     * Exibe no console uma representação de uma lista
     * de número inteiros em forma de texto
     *
     * @param list A lista de inteiros a ser mostrada
     */
    public static void printList(int[] list){
        String str = "[";
        for(int i = 0; i < list.length; i++) {
            if(i < list.length - 1)
                str += list[i] + ", ";
            else
                str += list[i];
        }
        str += "]";
        System.out.println(str);
    }

    /**
     * Gera uma lista aleatória de dados do tipo inteiro
     * de tamanho n
     *
     * @param size O tamanho da lista a ser gerada
     * @return
     */
    public static int[] generateRandomList(int size) {
        int list[] = new int[size];
        for(int i = 0; i < size; i++)
            list[i] = (int) Math.round(Math.random() * 100);

        return list;
    }
}
