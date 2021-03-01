package com.pratap.string;

/**
 * <blockquote>
 * <b>In-Place Algorithms</b><br>
 * 1. with two pointers, left-pointer & right-pointer<br>
 * 2. by recursive approach 
 * </blockquote>
 * @author Pratap Narayan
 *
 */
public class ReverseStringAlgos {

	public static String reverseStringByPointers(String inputString) {
		
		int leftPointer = 0;
		int rightPointer = inputString.length()-1;
		char[] charArray = inputString.toCharArray();
		while(rightPointer > leftPointer) {
			swapStringChars(charArray, leftPointer, rightPointer);
			leftPointer++;
			rightPointer--;
		}
		return charArray.toString();
	}
	
	private static void swapStringChars(char[] arr, int leftPointer, int rightPointer) {

		char temp = arr[leftPointer];
		arr[leftPointer] = arr[rightPointer];
		arr[rightPointer] = temp;
	}

	/**
	 * Reverse a inputString by recursively approach
	 * @param inputString
	 * @return String
	 */
	public static String reverseStringByRecursive(String inputString) {
		
		if(inputString.length() <= 1) return inputString;
		
		return inputString.charAt(inputString.length()-1) + reverseStringByRecursive(inputString.substring(0, inputString.length()-1));
	}
}
