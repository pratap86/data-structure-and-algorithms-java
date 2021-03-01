package com.pratap.interview.questions.string;

/**
 * str1 = "medical" & str2 = "decimal" are anagram strings
 * @author Pratap Narayan
 *
 */
public class AnagramStrings {
	

	private static final int CHARACTER_RANGE = 256;

	public static void main(String[] args) {
		
		String str1 = "medical";
		String str2 = "decimal";
		
		System.out.println(AnagramStrings.isAnagramStrings(str1, str2));
	}
	
	// O(n)
	public static boolean isAnagramStrings(String str1, String str2) {
		
		if (str1.length() != str2.length()) {
			System.out.println(str1 +" & "+str2+" Not equal");
			return false;
		}
		
		
		int count[] = new int[CHARACTER_RANGE];
	    for (int i = 0; i < str1.length(); i++) {
	        count[str1.charAt(i)]++;
	        count[str2.charAt(i)]--;
	    }
	    for (int i = 0; i < CHARACTER_RANGE; i++) {
	        if (count[i] != 0) {
	            return false;
	        }
	    }
	    return true;
		
		
	}

}
