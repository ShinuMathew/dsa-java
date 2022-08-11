package com.scalar.array.recursion;

public class PowerOfNumberUsingRecursion {

	/**
	 * Given a number a, n. Find the a^n
	 * 0>=a>=10^5, 0>=n>=10^5
	 * */
	
	public static void main(String[] args) {
		System.out.println("POW-1 : "+ pow1(1, 2));
		System.out.println("POW-2 : "+ pow2(1, 2));
	}

	private static int pow1(int a, int n) {
		if (n == 0 || a == 1) {
			return 1;
		}
		return pow1(a, n-1) * a;
	}
	
	private static int pow2(int a, int n) {
		if (n == 0 || a == 1) {
			return 1;
		}
		int pow = pow2(a, n / 2);
		if (n % 2 > 0) {
			return a * pow * pow;
		} else {
			return pow * pow;
		}
	}
}
