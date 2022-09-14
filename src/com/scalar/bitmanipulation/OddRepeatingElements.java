package com.scalar.bitmanipulation;

public class OddRepeatingElements {

	/**
	 * Given arr[N], every elements repeat even times except 2 elements which repeat
	 * odd times. Find the 2 unique elements
	 */
	public static void main(String[] args) {
		int[] arr = { 8, 2, 6, 8, 2, 6, 9, 7, 9 };
		findOddRepeatingElements(arr);
	}

	private static void findOddRepeatingElements(int[] arr) {
		int n = arr.length;
		int res = 0;
		for (int i = 0; i < arr.length; i++) {
			res = res ^ arr[i];
		}
		System.out.println(res);
	}
}
