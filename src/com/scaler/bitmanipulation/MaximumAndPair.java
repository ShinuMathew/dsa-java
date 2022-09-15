package com.scaler.bitmanipulation;

public class MaximumAndPair {

	/**
	 * Given arr[N]. Find maximum value of arr[i] & arr[j] which can be obtained.
	 */
	public static void main(String[] args) {
		int[] arr = { 26, 13, 23, 28, 27, 7, 25 };
		System.out.println(solve(arr));
	}

	private static int solve(int[] arr) {
		int ans = 0;
		for(int i = 31; i >= 0; i--) {
			int c = 0;
			for (int j = 0; j < arr.length; j++) {
				if(((arr[j]>>i)&1)==1) {
					c++;
				}
			}
			if(c>=2) {
				ans += (1<<i);
				for (int j = 0; j < arr.length; j++) {
					if(((arr[j]>>i)&1)==0) {
						arr[j] = 0;
					}
				}
			}
		}
		return ans;
	}

}
