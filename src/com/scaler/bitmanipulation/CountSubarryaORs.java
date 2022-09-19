package com.scaler.bitmanipulation;

public class CountSubarryaORs {
	
	/**
	 * Given a binary array arr[]. Calculate the total number of subarrays whose OR = 0;
	 */
	public static void main(String[] args) {
		int[] arr = {0, 0, 0, 1, 0, 0, 1, 1, 0, 0};
		System.out.println(solve(arr));
	}
	
	private static int solve(int[] arr) {
		int ans = 0;
		int c = 0;
		for (int i = 0; i < arr.length; i++) {
			if(arr[i] == 0) {
				c += 1;
			} else {
				ans += c*(c+1)/2;
				c=0;
			}
		}
		ans += c*(c+1)/2;	// Final update
		return ans;
	}

}
