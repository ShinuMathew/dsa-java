package com.scaler.bitmanipulation;

public class FindSpecificSubsequenceSumExist {

	/**
	 * Print all the subsequences of an array and add up their sum
	 */
	public static void main(String[] args) {

		int[] arr = { 9, 2, 7 };
		System.out.println(printAllSubsequences(arr, 11));
	}

	private static boolean printAllSubsequences(int[] arr, int k) {
		System.out.println("k : "+k);
		System.out.println("=========================");
		int n = arr.length;
		for (int i = 0; i < (1 << n); i++) {
			int sum = 0;
			System.out.print("{ ");
			for (int j = 0; j < n; j++) {
				if (((i >> j) & 1) == 1) {
					System.out.print(arr[j] + " ");
					sum += arr[j];
				}
			}
			System.out.print("} => "+sum);
			System.out.println();
			if(sum == k) return true;
		}
		return false;
	}
}
