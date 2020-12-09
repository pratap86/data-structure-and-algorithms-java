package com.pratap.sorting;

import com.pratap.utils.DSSortUtils;

public class BubbleSort {

	public static void main(String[] args) {

		int[] intArr = {20, 35, -15, 7, 55, 1, -22};
		
		
		for(int lastUnsortedIndex = intArr.length - 1; lastUnsortedIndex > 0; lastUnsortedIndex--) {
		
			for(int i = 0; i < lastUnsortedIndex; i++) {
				// swap consecutive nums, if first num is greater than immediate num
				if(intArr[i] > intArr[i+1]) {
					DSSortUtils.swapByTempVar(intArr, i, i+1);
				}
			}
		}
		for(int i = 0; i < intArr.length; i++) {
			System.out.println(intArr[i]);
		}
	}

}
