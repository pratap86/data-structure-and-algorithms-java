package com.pratap.search.algorithms;

import com.pratap.sorting.QuickSortAlgo;

/**
 * Search an element in to an datastructure
 * @author Pratap Narayan
 *
 */
public class SearchAlgorithms {

	public static void main(String[] args) {

		int[] input = {20, 35, -15, 7, 55, 1, -22};
		System.out.println(linearSearch(input, 35));
		System.out.println(linearSearch(input, -22));
		System.out.println(linearSearch(input, 355));
		System.out.println(linearSearch(input, 1));
		
		QuickSortAlgo.quickSort(input, 0, input.length);
		System.out.println("Iterative Binary Search");
		System.out.println(iterativeBinarySearch(input, 35));
		System.out.println(iterativeBinarySearch(input, -22));
		System.out.println(iterativeBinarySearch(input, 8888));
		System.out.println(iterativeBinarySearch(input, 1));
		
		System.out.println("Recursive Binary Search");
		System.out.println(recursiveBinarySearch(input, 35));
		System.out.println(recursiveBinarySearch(input, -22));
		System.out.println(recursiveBinarySearch(input, 8888));
		System.out.println(recursiveBinarySearch(input, 1));
		
	}

	/**
	 * <b>linearSearch</b>
	 * complexity O(n)
	 * @param input
	 * @param searchVal
	 * @return
	 */
	private static int linearSearch(int[] input, int searchVal) {

		for(int i = 0; i < input.length; i++) {
			if(input[i] == searchVal) return i;
		}
		return -1;
	}
	
	/**
	 * </pre></blockquote><p>
	 * BinarySearch are :
	 * <blockquote><pre>
	 *     Data must be sorted
	 *     Chooses the element in the middle of the array and compares it against the search value
	 *     if element is equal to search value, we're done.
	 *     if element is greater than the search value, search the left half of the array.
	 *     if the element is smaller than the search value, search the right half of the array.
	 *     can be implemented recursively.
	 *     Complexity - O(logn) keeps dividing array in half
	 * </pre></blockquote>
	 * <p>
	 * @author Pratap Narayan
	 *
	 */
	
	public static int iterativeBinarySearch(int[] input, int searchVal) {
		
		int start = 0;
		int end = input.length;
		
		while(start < end) {// while start == end, means each elements traversed
			
			int midpoint = (start+end) / 2;
			System.out.println("midpoint : "+midpoint);
			
			if(input[midpoint] == searchVal) {
				return midpoint;
			} else if (input[midpoint] < searchVal) {// bcz input is sorted, than searchVal must be lie in right half of the array
				
				// start index would be changed, now its going to midpoint + 1
				start = midpoint + 1;
				
			} else { // search value must be lie in left sub array
				
				// start index never change, its remains 0; but end index changed & its become midpoint.
				end = midpoint;

			}
			
		}
		
		return -1;
	}
	
	public static int recursiveBinarySearch(int[] input, int searchVal) {
		return recursiveBinarySearch(input, 0, input.length, searchVal);
	}

	private static int recursiveBinarySearch(int[] input, int start, int end, int searchVal) {

		if(start >= end) return -1;
		
		int midpoint = (start + end) / 2;
		System.out.println("midpoint : "+midpoint);
		
		if(input[midpoint] == searchVal) return midpoint;
		
		else if(input[midpoint] < searchVal)
			return recursiveBinarySearch(input, midpoint + 1, end, searchVal);
		else 
			return recursiveBinarySearch(input, start, midpoint, searchVal);
		
	}
	

}
