package sortingalgorithms;

public class Principal {
    public static void main (String[] args)
    {
        Arranjo arranjo = new Arranjo();

        System.out.println("Arranjo gerado");
        System.out.println("- - -");
        System.out.println(arranjo);
        // equivale a:
        // System.out.println(arranjo.toString());

        arranjo.selectionSort();
        System.out.println("Arranjo ordenado pelo Selection Sort");
        System.out.println("- - -");
        System.out.println(arranjo);

      /*
      arranjo.embaralha();
      System.out.println("Arranjo embaralhado");
      System.out.println("- - -");
      System.out.println(arranjo);

      arranjo.bubbleSort();
      System.out.println("Arranjo ordenado pelo Bubble Sort");
      System.out.println("- - -");
      System.out.println(arranjo);
      */
    }
}