package com.pratap.sorting;
/**
 * int[] intArr = {20, 35, -15, 7, 55, 1, -22};
 * 
 * firstUnsortedIndex = 1, this is the first index of the unsorted partition.
 * i = 0, index used to traverse the sorted partition from right to left
 * newElement = 35, the value we want to insert into sorted partition - array[firstUnsortedIndex]
 * 
 * <p> <blockquote><pre>
 *  	In-place algorithm
 * 	Time complexity O(n2) - Quadratic
 * 	It will take 100 steps to sort 10 items, dosen't require as much swapping as bubble sort
 *  	stable Algorithm 
 *  </pre></blockquote> </p>
 * @author Pratap Narayan
 *
 */
public class InsertionSortAlgo {

	public static void main(String[] args) {

		int[] intArr = {20, 35, -15, 7, 55, 1, -22};
		
		// selection sort algorithm logic
		// only shifting happens, so no swapping in place
		
		for(int firstUnsortedIndex = 1; firstUnsortedIndex < intArr.length; firstUnsortedIndex++) {
			
			int newElement = intArr[firstUnsortedIndex];//the value we want to insert into sorted partition - array[firstUnsortedIndex]
			
			int i;//index used to traverse the sorted partition from right to left
			
			for(i = firstUnsortedIndex; i > 0 && intArr[i - 1] > newElement; i--) {
				// shifting happens from left to right
				intArr[i] = intArr[i - 1];
			}
			intArr[i] = newElement;
					
		}
		
		for(int i = 0; i < intArr.length; i++) {
			System.out.println(intArr[i]);
		}
		
	}

}
