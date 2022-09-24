package com.scaler.bitmanipulation;

public class SumOfAllSubarrayOR {

	/**
	 * Given arr[N] calculate the sum of all subarray ORs
	 */
	public static void main(String[] args) {
		int[] arr = { 5, 8, 26, 13, 5, 21 };
		System.out.println(findAllSubarrayORs(arr));
	}

	private static int findAllSubarrayORs(int[] arr) {
		int n = arr.length;
		int totalSubarr = n * (n + 1) / 2;
		int ans = 0;
		for (int i = 0; i < 31; i++) {
			int c = 0;
			int zeroBitSubarr = 0;
			for (int j = 0; j < arr.length; j++) {
				if (((arr[j] >> i) & 1) == 0) {
					c += 1;
				} else {
					zeroBitSubarr += c*(c+1)/2;
					c=0;
				}
			}
			zeroBitSubarr += c*(c+1)/2;			
			ans = ans + ((1 << i) * (totalSubarr - zeroBitSubarr));
			System.out.println("i : "+i);
			System.out.println("totalSubArr : "+(totalSubarr - zeroBitSubarr));
			System.out.println("ans : "+ans);
			System.out.println("========================================");
		}
		return ans;
	}

}
