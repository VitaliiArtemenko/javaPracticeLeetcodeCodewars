package sort.my.textbooks;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class SortMyTextbooksTest {
   private List<String> input;
   private List<String> expected;

   @Test
   public void SortMyTextbooksTest1() {
      input = Arrays.asList("Algebra", "history", "Geometry", "english");
      expected = Arrays.asList("Algebra", "english", "Geometry", "history");
      assertEquals(expected, SortMyTextbooks.sortMyTextbooks(input));
   }

   @Test
   public void SortMyTextbooksTest2() {
      input = Arrays.asList("Alg#bra", "$istory", "Geom^try", "**English");
      expected = Arrays.asList("$istory", "**English", "Alg#bra", "Geom^try");
      assertEquals(expected, SortMyTextbooks.sortMyTextbooks(input));
   }

   @Test
   public void SortMyTextbooksTest3() {
      input = Arrays.asList("Algebra", "History", "Geometry", "English");
      expected = Arrays.asList("Algebra", "English", "Geometry", "History");
      assertEquals(expected, SortMyTextbooks.sortMyTextbooks(input));
   }
}