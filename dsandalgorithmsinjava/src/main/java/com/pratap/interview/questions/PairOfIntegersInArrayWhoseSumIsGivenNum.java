package com.pratap.interview.questions;

import java.util.HashSet;
import java.util.Set;

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

		int[] numbers = {2, 6, 3, 9, 11};
		int num = 9;
		getPairsUsingSet(numbers, num);
	}

	private static void getPairsUsingSet(int[] numbers, int num) {

		// base condition
		if(numbers.length < 2) return;
		
		Set<Integer> intSet = new HashSet<>(numbers.length);
		
		for(int val : numbers) {
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
