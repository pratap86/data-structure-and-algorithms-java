package com.pratap.sorting;

public class RecursionLogic {

	public static void main(String[] args) {

		System.out.println("iterative way : "+iterativeFactorial(3));
		System.out.println("recursive way : "+recursiveFactorial(3));
		
	}

	/**
	 * Factorial calculation via iterative and recursive way
	 * 1! = 1 * 0! = 1
	 * 2! = 2 * 1 = 2 * 1! = 2
	 * 3! = 3 * 2 * 1 = 3 * 2! = 6
	 * 4! = 4 * 3 * 2 * 1 = 4 * 3! = 24
	 * Formula : n! = n * (n-1)!
	 */
	
	// iterative way
	public static int iterativeFactorial(int num) {//num=3
		if (num == 0) return 1;
		
		int factorial = 1;
		for(int i = 1; i <= num; i++) {
			factorial *= i;
		}
		return factorial;
	}
	
	// recursive way
	public static int recursiveFactorial(int num) {
		// if below terminal condition is not present, throw java.lang.StackOverflowErro
		if (num == 0) return 1;
		
		return num * recursiveFactorial(num - 1);
	}
}
