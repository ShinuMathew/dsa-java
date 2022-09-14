package com.scalar.bitmanipulation;

public class TripleTrouble {

	/**
	 * Given an array on N elements every element repeats itself 3 times except for
	 * 1 which comes only 1 time. Find the unique element
	 */
	public static void main(String[] args) {
		int[] arr = { 6, 5, 6, 4, 5, 6, 5 };
		System.out.println(solve(arr));
	}

	private static int solve(int[] arr) {
		int result = 0;
		for (int i = 0; i < 32; i++) {
			int bitCount = 0;
			for (int j = 0; j < arr.length; j++) {
				if (((arr[j] >> i) & 1) == 1) {
					bitCount++;
				}
			}
			// result += Math.pow(2, i) * (bitCount % 3);
			// OR
			if (bitCount % 3 == 1) {
				result += (i << i); // Math.pow(2, i) = i << i
			}
		}
		return result;
	}

}
