package com.pratap.search.algorithms;
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
	}

	/**
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

}
