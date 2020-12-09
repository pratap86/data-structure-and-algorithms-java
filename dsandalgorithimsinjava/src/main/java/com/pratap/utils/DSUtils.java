package com.pratap.utils;

public final class DSUtils {

	/**
	 * swap two numbers
	 * @param array[], index i & index j
	 */
	public static void swapByXOR(int[] arr, int i, int j) {
		if(i == j) return;
		
		arr[i] = arr[i] ^ arr[j];
		arr[j] = arr[i] ^ arr[j];
		arr[i] = arr[i] ^ arr[j];
	}
	
	public static void swap(int[] arr, int i, int j) {
		if(i == j) return;
		
		arr[i] = arr[i] - arr[j];
		arr[j] = arr[i] + arr[j];
		arr[i] = arr[i] - arr[j];
	}
	
	public static void swapByTemp(int[] arr, int i, int j) {
		if(i == j) return;
		
		int temp = arr[i];
		arr[i] = arr[j];
		arr[j] = temp;
	}
	
}
