import static org.junit.Assert.*;
import org.junit.*;
import java.util.ArrayList;
import java.util.List;

public class ArrayTests {
	@Test 
	public void testReverseInPlaceSingle() {
    int[] input1 = { 3 };
    ArrayExamples.reverseInPlace(input1);
    assertArrayEquals(new int[]{ 3 }, input1);
	}

  @Test
  public void testReverseInPlace1(){
    int[] input1 = {1,2,3};
    ArrayExamples.reverseInPlace(input1);
    assertArrayEquals(new int[]{3,2,1}, input1);
  }

  @Test
  public void testReverseInPlace2(){
    int[] input1 = {1,2,3,4};
    ArrayExamples.reverseInPlace(input1);
    assertArrayEquals(new int[]{4,3,2,1}, input1);
  }

  @Test
  public void testReversedEmpty() {
    int[] input1 = { };
    assertArrayEquals(new int[]{ }, ArrayExamples.reversed(input1));
  }

  @Test
  public void testReverse(){
    int [] input1 = {1,2,3};
    assertArrayEquals(new int[]{3,2,1}, ArrayExamples.reversed(input1));
  }

  @Test 
  public void testFilter(){
    List<String> str = new ArrayList<>();
    str.add("a"); str.add("b"); str.add("c");
    List<String> strRev = new ArrayList<>();
    strRev.add("c"); strRev.add("b"); strRev.add("a");
    assertArrayEquals(strRev, ListExamples.filter(str, new StringChecker() sc));
  }


}
