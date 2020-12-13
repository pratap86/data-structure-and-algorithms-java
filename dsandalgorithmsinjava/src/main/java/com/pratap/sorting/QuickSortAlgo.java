package com.pratap.sorting;

public class QuickSortAlgo {

	public static void main(String[] args) {

		int[] intArr = {20, 35, -15, 7, 55, 1, -22};
		
		quickSort(intArr, 0, intArr.length);
		
		for(int i = 0; i < intArr.length; i++) {
			System.out.println(intArr[i]);
		}
	}
	
	public static void quickSort(int[] input, int start, int end) {
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
			
			// Note : empty loop body
			while(i < j && input[--j] >= pivot);
			if(i < j) input[i] = input[j];
			
			// Note : empty loop body
			while(i < j && input[++i] <= pivot);
			if(i < j) input[j] = input[i];
		}
		input[j] = pivot;
		return j;
	}

}
