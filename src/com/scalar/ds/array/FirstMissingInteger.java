package com.scalar.ds.array;

import java.util.Arrays;

public class FirstMissingInteger {

	/**
	 * Given an array of integer, find the first missing positive integer from the
	 * array. Ex : {8, 10, 1, -3, 2, -5} Ans : 3
	 * 
	 */
	public static void main(String[] args) {
		int[] arr = {8, 10, 1, 3, -3, 2, -5};
		System.out.println(findFirstMissingIntBF(arr));
	}

	private static int findFirstMissingIntBF(int[] arr) {
		// Sort the array and iterate to find the first missing +ve integer
		Arrays.sort(arr);
		int count = 0;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] > 0) {
				count += 1;
				if (arr[i] != count) {
					return count;
				}
			}
		}
		return count;
	}

}
