package com.pratap.interview.questions.string;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class RemoveAGivenCharFromStringTest {

	@Test
	public void removeAtBeginning() {
		assertEquals("bc", RemoveAGivenCharFromString.iterativeRemove("abc", 'a'));
		assertEquals("bc", RemoveAGivenCharFromString.recursiveRemove("abc", 'a'));
		assertEquals("bcdefgh", RemoveAGivenCharFromString.recursiveRemove("abcdefgh", 'a'));
		assertEquals("bcdefgh", RemoveAGivenCharFromString.recursiveRemove("abcdefgh", 'a'));
	}

	@Test
	public void removeAtMiddle() {
		assertEquals("abd", RemoveAGivenCharFromString.iterativeRemove("abcd", 'c'));
		assertEquals("abd", RemoveAGivenCharFromString.recursiveRemove("abcd", 'c'));
	}

	@Test
	public void removeAtEnd() {
		assertEquals("abc", RemoveAGivenCharFromString.iterativeRemove("abcd", 'd'));
		assertEquals("abc", RemoveAGivenCharFromString.recursiveRemove("abcd", 'd'));
	}

	@Test
	public void cornerCases() {
		// empty string test
		assertEquals("", RemoveAGivenCharFromString.iterativeRemove("", 'd'));
		// all removable character test
		assertEquals("", RemoveAGivenCharFromString.iterativeRemove("aaaaaaaaaaaaaa", 'a'));
		// all but one removable characters
		assertEquals("b", RemoveAGivenCharFromString.iterativeRemove("aaaaaaaaaaaaaab", 'a'));
	}
}
