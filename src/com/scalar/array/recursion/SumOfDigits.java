package com.scalar.array.recursion;

public class SumOfDigits {
	
	/**
	 * Given a no 'n', find the sum of its digits using recursion
	 * */
	public static void main(String[] args) {
		System.out.println(sumOfDigits(12345));
	}
	
	private static int sumOfDigits(int n) {
		if(n == 0) return 0;
		return sumOfDigits(n/10) + n%10;
	}

}
