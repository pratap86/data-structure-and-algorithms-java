package com.pratap.sorting;
/**
 * </pre></blockquote><p>
 * QuickSortAlgo are:
 * <blockquote><pre>
 *     In-Place algorithm
 *     Complexity is O(nlogn)-base 2, base2 bcz its continuously partitioned.
 *     Unstable Algorithm
 * </pre></blockquote>
 * <p>
 * @author Pratap Narayan
 *
 */
public class QuickSortAlgo {

	public static void main(String[] args) {

		int[] intArr = {20, 35, -15, 7, 55, 1, -22};
		
		quickSort(intArr, 0, intArr.length);
		
		for(int i = 0; i < intArr.length; i++) {
			System.out.println(intArr[i]);
		}
	}
	
	public static void quickSort(int[] input, int start, int end) {
		// terminal condition for single element array.
		if(end - start < 2) return;
		
		int pivotIndex = partition(input, start, end);
		quickSort(input, start, pivotIndex);// quicksort for left sub array
		quickSort(input, pivotIndex + 1, end);// quicksort for right sub array
	}

	private static int partition(int[] input, int start, int end) {
		// This is using the first element as the pivot
		int pivot = input[start];
		
		int i = start;
		int j = end;
		
		while(i < j) {// both left & right traverser not crossed to each other.
			
			// Note : empty loop body, that continuously check i & j not crossed each other 
			//from left to right greater elm from pivot
			while(i < j && input[--j] >= pivot);
			if(i < j) {
				input[i] = input[j];// assigned jth input into ith input array
			}
			
			// Note : empty loop body, that continuously check i & j not crossed each other 
			//from right to left lesser elm from pivot
			while(i < j && input[++i] <= pivot);
			if(i < j) {
				input[j] = input[i];// assigned ith input into jth input array
			}
		}
		input[j] = pivot;//once i & j crossed each other
		return j;
	}

}
