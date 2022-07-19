package com.scalar.array.subarrays;

public class SubarraysContainingSpecificIndex {

	/**
	 * Given an array find the subarrays which has a given index k
	 * Ex: arr : [-2, 3, 1, 2, 5, 7]
	 * 	k = 2
	 * */
	public static void main(String[] args) {
		
		int[] arr = {-2, 3, 1, 2, 5, 7};
		System.out.println(bruteForceLogic(arr, 2));	//	TC : O(N^2)
		System.out.println(optimizedApproach(arr, 2));	//	TC : O(1)
	}
	
	private static int bruteForceLogic(int[] arr, int k) {
		int count = 0;
		for(int i = 0; i <= k; i++) {
			for(int j = k; j < arr.length; j++) {
				System.out.println("["+i+", "+j+"]");
				count++;
			}
		}
		return count; 
	}
	
	private static int optimizedApproach(int[] arr, int k) {
		/**
		 * For a given array, if we want to calculate, the number of times an index is going to found,
		 * We only need to check for the valid combinations.
		 * Even with the brute force solution, we could make up that the start indices for valid subarray would be from 0 to k
		 * And the end index would be from k to N-1
		 * Therefore, total valid start indexes(0 to k) : k+1
		 * Total valid end indexes(k to N-1) : (N-1) - (k+1) = N-1 + k-1 = N-k
		 * => Total times the index will be repeated in subarrays = (k+1)*(N-k)
		 * */
		
		return (k+1)*(arr.length-k); 
	}
	
}
