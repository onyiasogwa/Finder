import org.junit.*;

import static org.junit.Assert.assertEquals;

public class FinderTest {
   @Test
   public void test_findMax_validarray() {
      int[] intArray = new int[]{34, 12, 32, 89, 45};
      Integer max = Finder.findMax(intArray);
      Integer expectedResult = 89;
      // this is the test
      assertEquals(expectedResult, max);
      // this is the test
   }

   @Test
   public void test_findMax_nullarray() {
      assertEquals(null, Finder.findMax(null));
   }
   @Test
   public void test_findMax_emptyarray() {
      assertEquals(null, Finder.findMax(new int[]{}));
   }

}
