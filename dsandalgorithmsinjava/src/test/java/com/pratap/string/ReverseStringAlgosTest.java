package com.pratap.string;

import static org.junit.jupiter.api.Assertions.assertAll;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

class ReverseStringAlgosTest {
	

	@Test
	void testReverseStringByRecursive_ShouldReturn_ReverseString() {

		String input = "pratap";

		String actual = ReverseStringAlgos.reverseStringByRecursive(input);

		assertEquals("patarp", actual, "should be matched");
	}
	
	@Test
	void testReverseStringByRecursiveWithSingleChar_ShouldReturn_Itself() {

		String expected = "A";

		String actual = ReverseStringAlgos.reverseStringByRecursive(expected);

		assertEquals(expected, actual, "should be matched");
	}

	@Test
	@Disabled
	void testReverseStringByPointers__ShouldReturn_ReverseString(){
		
		String expected = "pratap";

		String actual = ReverseStringAlgos.reverseStringByPointers(expected);
		System.out.println(actual.toString());
		
		assertAll(
				() -> assertEquals("p", actual.charAt(0)),
				() -> assertEquals("a", actual.charAt(3))
				);
		assertEquals(expected, actual, "should be matched");
	}
	/**
	 * Palindrome is a string which reverse is same with its input
	 * Nitin, Liril, Azza
	 */
	@Test
	void testPalindrome(){
		String input = "nitin";
		
		assertEquals(input, ReverseStringAlgos.reverseStringByRecursive(input), "should be same");
	}
}
