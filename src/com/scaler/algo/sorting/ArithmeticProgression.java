package com.scaler.algo.sorting;

import java.util.Arrays;

public class ArithmeticProgression {

	/**
	 * Given an integer array A of size N. Return 1 if the array can be arranged to
	 * form an arithmetic progression, otherwise return 0. A sequence of numbers is
	 * called an arithmetic progression if the difference between any two
	 * consecutive elements is the same.
	 */
	public static void main(String[] args) {
		int[] arr = { 2, 8, 4, 11, 10, 14, 6, 12 };
		System.out.println(solve(arr));
	}

	private static int solve(int[] A) {
		Arrays.sort(A);
		int d = (A[1]-A[0]);
		for(int i = 0; i < A.length-1; i++) {
			if((A[i+1]-A[i]) != d) {
				return 0;
			}
		}
		return 1;
	}

}
