package com.scalar.array.subarrays;

public class SubarraySum {

	/*
	 * Given an array find the all the subarray sum
	 */
	public static void main(String[] args) {

		int[] arr = { 2, -1, 3, 1 };
		// getSubarraysBruteForce(arr); // TC : O(n^3) => It cannot be optimized
		getSubarrayPrefixSum(arr);	// TC : O(N^2)
		System.out.println("===========================");
		getSubarraySumCarryForward(arr);	// TC : O(N^2)
		

	}
	
	//	SOLUTION CARRY FORWARD	
	private static void getSubarraySumCarryForward(int arr[]) {
		/**
		 * If we use the solution from the problem /dsa-java/src/com/scalar/array/subarrays/SubarraysFromIndex.java/,
		 * We can use the same logic for all index from 0 to N
		 */
		
		for(int i = 0; i < arr.length; i++) {
			int sum = 0;
			for(int j = i; j < arr.length; j++) {
				sum += arr[j];
				System.out.print("[" + i + ", " + j + "] => " + sum);
				System.out.println("");
			}
		}
	}

	// SOLUTION PREFIX SUM
	private static void getSubarrayPrefixSum(int arr[]) {
		int[] PS = getPrefixSumArray(arr);
		for (int i = 0; i < PS.length; i++) {
			System.out.print(PS[i] + ", ");
		}
		System.out.println("");

		for (int i = 0; i < arr.length; i++) {
			for (int j = i; j < arr.length; j++) {
				int sum = 0;

				if(i == 0) {
					sum = PS[j];
				} else {
					sum = PS[j] - PS[i-1];
				}

				System.out.print("[" + i + ", " + j + "] => " + sum);
				System.out.println("");
			}
		}
		
		/* * 
		 * [0, 0] => 2 
		 * [0, 1] => 1 
		 * [0, 2] => 4 
		 * [0, 3] => 5 
		 * [1, 1] => -1 
		 * [1, 2] => 2
		 * [1, 3] => 3 
		 * [2, 2] => 3 
		 * [2, 3] => 4 
		 * [3, 3] => 1
		 */
	}

	private static int[] getPrefixSumArray(int[] arr) {
		int[] prefixSumArr = new int[arr.length];
		prefixSumArr[0] = arr[0];
		for (int i = 1; i < arr.length; i++) {
			prefixSumArr[i] = arr[i] + prefixSumArr[i - 1];
		}
		return prefixSumArr;
	}

	// BRUTE FORCE
	private static void getSubarraysBruteForce(int arr[]) {
		for (int i = 0; i < arr.length; i++) {
			for (int j = i; j < arr.length; j++) {
				System.out.print("[" + i + ", " + j + "] => ");
				int sum = 0;
				for (int k = i; k < j + 1; k++) {
					sum += arr[k];
				}
				System.out.print(sum);
				System.out.println("");
			}
		}
		/* * 
		 * [0, 0] => 2 
		 * [0, 1] => 1 
		 * [0, 2] => 4 
		 * [0, 3] => 5 
		 * [1, 1] => -1 
		 * [1, 2] => 2
		 * [1, 3] => 3 
		 * [2, 2] => 3 
		 * [2, 3] => 4 
		 * [3, 3] => 1
		 */
	}
}
