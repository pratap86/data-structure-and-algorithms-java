package com.pratap.utils;

public final class DSSortUtils {

	// swapping two int, in intArray
	// 1. temp Swapping
	public static void swapByTempVar(int[] arr, int i, int j) {
		int temp = arr[j];
		arr[j] = arr[i];
		arr[i] = temp;
	}
	
	// 2. without temp Swapping
	public static void swapWithoutTempVar(int[] arr, int i, int j) {
		arr[i] = arr[i] * arr[j];
		arr[j] = arr[i] / arr[j];
		arr[i] = arr[i] / arr[j];
	}
	// 3. XOR swapping - more fast
	public static void swapByXOR(int[] arr, int i, int j) {
		arr[i] = arr[i] ^ arr[j];
		arr[j] = arr[i] ^ arr[j];
		arr[i] = arr[i] ^ arr[j];
	}
}
