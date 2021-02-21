package com.pratap.sorting;

import com.pratap.utils.DSSortUtils;

/**
 * <p> <blockquote><pre>
 *  	In-place algorithm
 * 	Time complexity O(n2) - Quadratic
 * 	It will take 100 steps to sort 10 items, dosen't require as much swapping as bubble sort
 *  	Unstable Algorithm 
 *  </pre></blockquote> </p>
 * @author Pratap Narayan
 *
 */
public class SelectionSortAlgo {

	public static void main(String[] args) {

		int[] intArr = {20, 35, -15, 7, 55, 1, -22};
		
		// selection sort logic
		
		for(int lastUnsortedIndex = intArr.length - 1; lastUnsortedIndex > 0; lastUnsortedIndex--) {
			
			int largest = 0;
			
			for(int i = 1; i <= lastUnsortedIndex; i++) {
				if(intArr[i] > intArr[largest]) {
					largest = i;
				}
			}
			DSSortUtils.swapByTempVar(intArr, largest, lastUnsortedIndex);
		}
		
		// print the sorted array
		for(int i = 0; i < intArr.length; i++) {
			System.out.println(intArr[i]);
		}
	}

}
