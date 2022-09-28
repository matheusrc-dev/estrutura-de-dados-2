package atividadeavaliativa1;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class SolutionExampleTest
{
   @Test
   public void test1()
   {
      assertEquals(4, new SolutionExample().solution(2));
   }
   
   @Test
   public void test2()
   {
      assertEquals(8, new SolutionExample().solution(4));
   }
   
}