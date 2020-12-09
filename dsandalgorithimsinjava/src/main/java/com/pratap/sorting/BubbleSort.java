package com.pratap.sorting;

import com.pratap.utils.DSUtils;
/**
 * Time Complexity - Quadratic ie O(n2)
 * @author 835698
 *
 */
public class BubbleSort {

	public static void main(String[] args) {

		int[] intArray = {20, 35, -15, 7, 55, 1, -22};
		
		for(int lastUnsortedIndex = intArray.length - 1; lastUnsortedIndex > 0; lastUnsortedIndex--) {
			
			
			for(int i = 0; i < lastUnsortedIndex; i++) {
				// is current elem is greater than immediate successor elem, than only swap them
				if(intArray[i] > intArray[i+1]) {
					DSUtils.swapByXOR(intArray, i, i+1);
				}
			}
		}
		for(int i = 0; i <= intArray.length - 1; i++) {
			System.out.println(intArray[i]);
		}
	}

}
