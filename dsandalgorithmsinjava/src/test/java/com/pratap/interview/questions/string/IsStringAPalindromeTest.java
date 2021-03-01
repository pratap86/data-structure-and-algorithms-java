package com.pratap.interview.questions.string;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class IsStringAPalindromeTest {

	@Test
	void testIsPalindromeStr() {
		assertEquals(true, IsStringAPalindrome.isPalindromeStr("aba"));
		assertEquals(true, IsStringAPalindrome.isPalindromeStr("aaa"));
		assertEquals(true, IsStringAPalindrome.isPalindromeStr("bbb"));
		
	}

}
