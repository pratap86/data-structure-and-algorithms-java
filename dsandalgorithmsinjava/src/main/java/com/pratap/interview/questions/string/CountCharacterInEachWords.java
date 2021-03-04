package com.pratap.interview.questions.string;
/**
 * <blockquote>
 * <pre>
 * count the characters in each word in a given sentence:
 * eg: "Hello World"
 * Hello -> 5
 * World -> 5
 * </pre>
 * </blockquote>
 * @author Pratap Narayan
 *
 */
public class CountCharacterInEachWords {
	
	public static void main(String[] args) {
		
		String str = "Hello World";
		count(str);
	}

	static void count(String str) {
		
		char[] charArray = str.toCharArray();
		
		for(int i = 0; i < charArray.length; i++) {
			
			StringBuilder builder = new StringBuilder();
			
			while(i < charArray.length && charArray[i] != ' ') {
				builder.append(charArray[i]);
				i++;
			}
			
			if(builder.length() > 0) {
				System.out.println(builder + " -> "+builder.length());
			}
		}
	}
}
