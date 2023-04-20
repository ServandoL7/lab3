import static org.junit.Assert.*;
import org.junit.*;

public class ArrayTests {
	@Test 
	public void testReverseInPlace() {
    int[] input1 = { 3 };
    ArrayExamples.reverseInPlace(input1);
    assertArrayEquals(new int[]{ 3 }, input1);
	}

  @Test
  public void testReversed() {
    int[] input1 = { };
    assertArrayEquals(new int[]{ }, ArrayExamples.reversed(input1));
  }

  @Test
  public void testReverseInPLace3() {
    int[] input = { 2, 4, 6 };
    ArrayExamples.reverseInPlace(input);
    assertArrayEquals(new int[]{ 6, 4, 2 }, input);
  }

  @Test
  public void testReversedsize3() {
    int[] input1 = { 3, 5, 7 };
    ArrayExamples.reversed(input1);
    assertArrayEquals(new int[]{ 7, 5, 3 }, ArrayExamples.reversed(input1));
  }
}
