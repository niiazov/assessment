package Tests;

import static org.junit.Assert.*;
import org.junit.Test;
import Utililities.MyClass;

public class MyClassTest {

	@Test
	public void getLongestWordAndCountTest() {
		MyClass mc = new MyClass();
		String given = "The cow jumped over the moon.";
		String expected = "jumped" + " " + 6;
		String actual = mc.getLongestWordAndCount(given);
		assertEquals("Expected result didn't match the actual result", actual, expected);
	}
	
	@Test
	public void getLongestWordAndCountTestOneWord() {
		MyClass mc = new MyClass();
		String given = "word";
		String expected = "word" + " " + 4;
		String actual = mc.getLongestWordAndCount(given);
		assertEquals("Expected result didn't match the actual result", actual, expected);
	}
	@Test
	public void getLongestWordAndCountTestEmptyWord() {
		MyClass mc = new MyClass();
		String given = "";
		String expected = "You can not pass empty sentence.";
		String actual = mc.getLongestWordAndCount(given);
		assertEquals("Expected result didn't match the actual result", actual, expected);
	}
	@Test
	public void getLongestWordAndCountNullValue() {
		MyClass mc = new MyClass();
		String given = null;
		String expected = "You can not pass null value.";
		String actual = mc.getLongestWordAndCount(given);
		assertEquals("Expected result didn't match the actual result", actual, expected);
	}
}
