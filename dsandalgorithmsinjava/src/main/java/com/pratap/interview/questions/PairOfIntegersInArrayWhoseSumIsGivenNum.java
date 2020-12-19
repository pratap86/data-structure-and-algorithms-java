package com.pratap.interview.questions;

import java.util.HashSet;
import java.util.Set;

import com.pratap.sorting.QuickSortAlgo;

/**
 * possible solutions, 
 * 1. Brute force complexity O(n^n) ie quadratic
 * 2. HashSet complexity is O(n) linear but it required additional space
 * 3. in place
 * @author Pratap Narayan
 *
 */
public class PairOfIntegersInArrayWhoseSumIsGivenNum {

	public static void main(String[] args) {

		int[] input = {2, 6, 3, 9, 11};
		int num = 9;
		getPairsUsingSet(input, num);
		QuickSortAlgo.quickSort(input, 0, input.length-1);
		getPairsUsingQuickSort(input, num);
	}

	private static void getPairsUsingQuickSort(int[] input, int num) {
			
		// use 2-pointers, left & right
		int left = 0; int right = input.length-1;
		while(right > left) {
			int sum = input[left] + input[right];
			
			if (sum == num) {
				System.out.printf("(%d, %d) %n", input[left], input[right]);
				left++;
				right++;
			} else if (num < sum) {
				right--;
			} else if (num > sum) {
				left++;
			}
		}
		
	}

	private static void getPairsUsingSet(int[] input, int num) {

		// base condition
		if(input.length < 2) return;
		
		Set<Integer> intSet = new HashSet<>(input.length);
		
		for(int val : input) {
			// if target is not present in set, than only add
			int target = num - val;
			if(!intSet.contains(target)) {
				intSet.add(val);
			} else {
				System.out.printf("(%d, %d) %n", val, target);
			}
		}
	}

}
