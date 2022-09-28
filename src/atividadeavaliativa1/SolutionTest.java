package atividadeavaliativa1;

import org.junit.Test;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertArrayEquals;

public class SolutionTest
{
    @Test
    public void ex1Test1()
    {
      assertEquals("988776", new Solution().ex1("12345678987654321", 6));
    }

    @Test
    public void ex1Test2()
    {
      assertEquals("998", new Solution().ex1("7685943093857675", 3));
    }

    @Test
    public void ex1Test3()
    {
      assertEquals("9988777665554330", new Solution().ex1("7685943093857675", 20));
    }

    @Test
    public void ex1Test4()
    {
        assertEquals("33", new Solution().ex1("123123123123123", 2));
    }

    @Test
    public void ex1Test5()
    {
        assertEquals("999", new Solution().ex1("123999123", 3));
    }

    @Test
    public void ex1Test6()
    {
        assertEquals("000", new Solution().ex1("000000000", 3));
    }

    @Test
    public void ex2Test1()
    {
      int[][] a = {{1}};
      assertArrayEquals(a, new Solution().ex2(1));
    }

    @Test
    public void ex2Test2()
    {
      int[][] a = {{1,1},
                   {1,1}};
      assertArrayEquals(a, new Solution().ex2(2));
    }
    
    @Test
    public void ex2Test3()
    {
      int[][] a = {{1,1,1},
                   {1,2,1},
                   {1,1,1}};
      assertArrayEquals(a, new Solution().ex2(3));
    }

    @Test
    public void ex2Test4()
    {
      int[][] a = {{1,1,1,1},
                   {1,2,2,1},
                   {1,2,2,1},
                   {1,1,1,1}};
      assertArrayEquals(a, new Solution().ex2(4));
    }
    
    @Test
    public void ex2Test5()
    {
      int[][] a = {{1,1,1,1,1},
                   {1,2,2,2,1},
                   {1,2,3,2,1},
                   {1,2,2,2,1},
                   {1,1,1,1,1}};
      assertArrayEquals(a, new Solution().ex2(5));
    }

    @Test
    public void ex3Test1()
    {
      int[] a = {17, 21, 29, 30, 40, 68, 87, 89, 98},
            b = {2, 13, 18, 19, 37, 41, 77, 80},
            c = {4, 8, 17, 26, 35, 41, 63, 75, 85, 93},
            d = {2, 4, 8, 13, 17, 17, 18, 19, 21, 26, 29, 30, 35, 37, 40, 41, 41, 63, 68, 75, 77, 80, 85, 87, 89, 93, 98};
      assertArrayEquals(d, new Solution().ex3(a, b, c));
    }


    @Test
    public void ex3Test2()
    {
        int[] a = {9, 8, 7, 6, 5, 4, 3, 2, 1},
                b = {5,2},
                c = {9,9,9},
                d = {1, 2, 2, 3, 4, 5, 5, 6, 7, 8, 9, 9, 9, 9};
        assertArrayEquals(d, new Solution().ex3(a, b, c));
    }

    @Test
    public void ex3Test3()
    {
        int[] a = {},
                b = {},
                c = {},
                d = {};
        assertArrayEquals(d, new Solution().ex3(a, b, c));
    }

    @Test
    public void ex4Test1()
    {
      int[] a = {6, 8, 7, 7, 2, 1, 4, 7, 5, 3};
      assertEquals(8, new Solution().ex4(a));
    }
    
    @Test
    public void ex4Test2()
    {
      int[] a = {1, 5, 4, 5, 4, 3, 0, 3, 1, 2, 1, 4, 1, 4, 1, 4, 2, 0, 5, 1};

      assertEquals(6, new Solution().ex4(a));
    }

    @Test
    public void ex4Test3()
    {
        int[] a = {5,5,5,5,5,5,5,5,5,5,5,5,5};

        assertEquals(1, new Solution().ex4(a));
    }

    @Test
    public void ex4Test4()
    {
        int[] a = {};

        assertEquals(0, new Solution().ex4(a));
    }
}