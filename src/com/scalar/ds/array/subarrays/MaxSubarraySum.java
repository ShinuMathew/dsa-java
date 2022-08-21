package com.scalar.ds.array.subarrays;

public class MaxSubarraySum {
	
	/**
	 * Given an array print the max subarray sum
	 * Ex :  { 2, -1, 3, 1 }
	 * Subarray Sums :
	 * [0, 0] => 2
	 * [0, 1] => 1
	 * [0, 2] => 4
	 * [0, 3] => 5	// MAX SUBARRAY SUM
	 * [1, 1] => -1
	 * [1, 2] => 2
	 * [1, 3] => 3
	 * [2, 2] => 3
	 * [2, 3] => 4
	 * [3, 3] => 1
	 * */

	public static void main(String[] args) {
		
		int[] arr =  { 2, -1, 3, 1 };
		System.out.println(getMaxSubarraySum(arr));	//	TC : O(N^2)
		// This can be optimized to O(N)		
	}
	
	private static int getMaxSubarraySum(int[] arr) {
		
		int max = arr[0];
		for(int i = 0 ; i < arr.length; i++) {
			int sum = 0;
			
			for(int j = i ; j < arr.length; j++) {
				sum += arr[j];			
				max = max > sum ? max : sum;  
				//	System.out.println("["+i+", "+j+"] : "+ sum);
			}
		}
		return max;
	}	
}
