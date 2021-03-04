package com.pratap.interview.questions.string;

public class DeleteAnElementFromArray {

	public static int[] delete(int[] array, int element) {
		
		int[] resultArr = new int[array.length - 1];
		
		for(int i = 0, k = 0; i < array.length; i++) {
			// if matching element found, just skip
			if(array[i] == element) {
				continue;// skip
			}
			resultArr[k++] = array[i];
			
		}
		
		return resultArr;
	}
}
