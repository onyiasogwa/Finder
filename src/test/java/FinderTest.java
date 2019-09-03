import org.junit.*;

import static org.junit.Assert.assertEquals;

public class FinderTest {
   // Test for Max
   @Test
   public void test_findMax_validarray() {
      int[] intArray = new int[]{34, 12, 32, 89, 45};
      Integer max = Finder.findMax(intArray);
      Integer expectedResult = 89;
      // this is the test
      assertEquals(expectedResult, max);

   }

   @Test
   public void test_findMax_nullarray() {
      // this is the test
      assertEquals(null, Finder.findMax(null));
   }
   @Test
   public void test_findMax_emptyarray() {
      // this is the test
      assertEquals(null, Finder.findMax(new int[]{}));
   }

   // Test for Min

   @Test
   public void test_findMin_validarray() {
      int[] intArray = new int[]{34, 12, 32, 89, 45};
      Integer min = Finder.findMin(intArray);
      Integer expectedResult = 12;
      // this is the test
      assertEquals(expectedResult, min);

   }

   @Test
   public void test_findMin_nullarray() {
      // this is the test
      assertEquals(null, Finder.findMin(null));
   }
   @Test
   public void test_findMin_emptyarray() {
      // this is the test
      assertEquals(null, Finder.findMin(new int[]{}));
   }
}
