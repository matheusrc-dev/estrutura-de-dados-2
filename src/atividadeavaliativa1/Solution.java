package atividadeavaliativa1;

public class Solution
{
   public String ex1(String s, int n)
   {
      int maior = 0;
      int index = 0;
      StringBuilder maiorNumeroFormado = new StringBuilder();
      char[] stringInChar = s.toCharArray();

      if(n > stringInChar.length) {
         n = stringInChar.length;
      }

      for (int i = 0; i < n; i++) {
         maior = 0;
         for (int j = 0; j < stringInChar.length; j++) {
            int numero = Character.getNumericValue(stringInChar[j]);

            if(numero > maior) {
               maior = numero;
               index = j;
            }
         }

         maiorNumeroFormado.append(maior);
         stringInChar[index] = '0';
      }

      return maiorNumeroFormado.toString();
   }
   
   public int[][] ex2(int n)
   {
      int[][] matriz = new int[n][n];

      if(n <= 1) {
         matriz = new int[][]{{1}};
         return matriz;
      }

      for(int i = 0; i < n; i ++) {
         for(int j = 0; j < n; j++) {
            int a = Math.min(i, j);
            int b = Math.min((n-i)-1, (n-j)-1);
            int numero = Math.min(a,b) + 1;

            matriz[i][j] = numero;
         }
      }

      return matriz;
   }

   public int[] ex3(int[] a, int[] b, int[] c)
   {
      int[][] vetor = {a,b,c};
      int TAM = a.length + b.length + c.length;

      int[] d = new int[TAM];
      int menor, aux;
      int index = 0;

      for (int i = 0; i < vetor.length; i++) {
         for (int j = 0; j < vetor[i].length; j++) {
            d[index] = vetor[i][j];
            index++;
         }
      }

      for (int i = 0; i < TAM - 1; i++) {
         menor = i;
         for (int j = i + 1; j < TAM; j++) {
            if (d[j] < d[menor]) {
               menor = j;
            }
         }

         if (i != menor) {
            aux = d[i];
            d[i] = d[menor];
            d[menor] = aux;
         }
      }
      return d;
   }

   public int ex4(int[] a)
   {
      int quantidade = 0;
      boolean presente = false;
      int[] aux = new int[a.length];
      for (int i = 0; i < aux.length; i++) {
         aux[i] = -1;
      }

      for (int i = 0; i < a.length; i++) {
         presente = false;
         for (int j = 0; j < aux.length; j++) {
            if(a[i] == aux[j]) {
               presente = true;
               break;
            }
         }
         if(!presente){
            quantidade++;
         }
         aux[i] = a[i];
      }
       return quantidade;
   }
}