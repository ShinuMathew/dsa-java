package com.scaler.bitmanipulation;

public class NonRepeatativeNumber {
	
	/**
	 * Given N array elements, every element repeats itself twice except for one number.
	 * Find the unique number.
	 */
	public static void main(String[] args) {
		int[] arr = {9, 8, 10, 9, 8};
		System.out.println(xorSolution(arr));
	}
	
	private static int xorSolution(int[] arr) {
		int ans = arr[0];
		for(int i = 1; i < arr.length; i++) {
			ans = ans ^ arr[i];
		}
		Integer.valueOf('s');
		return ans;
	}

}
