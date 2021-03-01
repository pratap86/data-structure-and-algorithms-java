package com.pratap.string;

public class FindingDuplicatesInIntegerArray {

	// O(N) complexity
	public static void findDuplicatesInInteger(int[] arr) {
		
		for(int i = 0; i < arr.length; i++) {
			
			//if the value is positive, we have to flip
			if(arr[Math.abs(arr[i])] > 0) {
				arr[Math.abs(arr[i])] = - arr[Math.abs(arr[i])];
			} else {
				System.out.println(Math.abs(arr[i])+ " is duplicate");
			}
		}
	}
}
