package com.pratap.interview.questions.string;
/**
 * <blockquote><pre>
 * Approaches;
 * 1. Iterative
 * 2. Recursive
 * 
 * </pre></blockquote>
 * @author 835698
 *
 */
public class RemoveAGivenCharFromString {

	public static void main(String[] args) {
		System.out.println("Iterative way");
		System.out.println(RemoveAGivenCharFromString.iterativeRemove("abc", 'b'));
		System.out.println(RemoveAGivenCharFromString.iterativeRemove("aaa", 'a'));
		System.out.println(RemoveAGivenCharFromString.iterativeRemove("xyaaz", 'a'));
		
		System.out.println("Recursive way");
		System.out.println(RemoveAGivenCharFromString.recursiveRemove("abc", 'b'));
		System.out.println(RemoveAGivenCharFromString.recursiveRemove("aaa", 'a'));
		System.out.println(RemoveAGivenCharFromString.recursiveRemove("xyaaz", 'a'));
	}
	// Iterative way
	public static String iterativeRemove(String input, char toRemove) {
		
		StringBuilder sb = new StringBuilder();
		
		char[] letters = input.toCharArray();
		
		for(char ch : letters) {
			if(ch != toRemove) {
				sb.append(ch);
			}
		}
		
		return sb.toString();
	}
	
	// recursive way
	public static String recursiveRemove(String input, char toRemove) {
		
		int targetIndex = input.indexOf(toRemove);
		
		if(targetIndex == -1) return input;// if toRemove is not present in input
		
		return recursiveRemove(input.substring(0, targetIndex) + input.substring(targetIndex + 1, input.length()), toRemove);
		
	}
}
