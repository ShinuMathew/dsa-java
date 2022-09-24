package com.scaler.bitmanipulation;

public class FindSubsequences {

	/**
	 * Print all the subsequences of an array
	 */
	public static void main(String[] args) {

		int[] arr = { 9, 2, 7 };
		printAllSubsequences(arr);
	}

	private static void printAllSubsequences(int[] arr) {
		int n = arr.length;
		for (int i = 0; i < (1 << n); i++) {
			System.out.print("{ ");
			for (int k = 0; k < n; k++) {
				if (((i >> k) & 1) == 1) {
					System.out.print(arr[k] + ", ");
				}
			}
			System.out.print(" }");
			System.out.println();
		}
	}

}
