package com.pratap.interview.questions.string;
/**
 * </pre></blockquote><p>
 * Palindrome String is:
 * <blockquote><pre>
 *     A palindrome is those String whose reverse is equal to the original.
 *     eg. string equal to itself like "aba" is a palindrome because the opposite of "aba" is also "aba",
 *     but "abc" is not a palindrome because the reverse of "abc" is "cba" which is not equal.
 * </pre></blockquote>
 * 
 * <blockquote><pre>
 * Logic is;
 *  1) Reverse the given String
 *  2) Check if the reverse of String is equal to itself; if yes, then given String is a palindrome.
 * </pre></blockquote>
 * <p>
 * @author Pratap Narayan
 *
 */
public class IsStringAPalindrome {

	public static void main(String[] args) {

		System.out.println("aba is palindrome : "+isPalindromeStr("aba"));
		System.out.println("aaa is palindrome : "+isPalindromeStr("aaa"));
		System.out.println("defg is palindrome : "+isPalindromeStr("defg"));
		System.out.println("bbbb is palindrome : "+isPalindromeStr("bbbb"));
	}

	public static boolean isPalindromeStr(String input) {
		
		String reverseStr = reverseStr(input);
		
		if(input.equals(reverseStr)) return true;
		
		return false;
		
	}

	private static String reverseStr(String input) {

		if(input == null || input.isEmpty()) return input;
		
		return input.charAt(input.length() - 1) + reverseStr(input.substring(0, input.length() - 1));
	}

}
