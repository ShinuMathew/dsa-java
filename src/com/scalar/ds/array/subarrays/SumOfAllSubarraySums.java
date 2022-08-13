package com.scalar.ds.array.subarrays;

public class SumOfAllSubarraySums {

	/**
	 * Given N array element return sum of all subarray sum
	 * 
	 * Ex : {2, -1, 3, 1} 
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
	 * 
	 * => 24
	 */
	
	public static void main(String[] args) {
		int[] arr = {2, -1, 3, 1} ;
		System.out.println(getSumofAllSubarraySum(arr));	// TC : O(N^2)
		System.out.println(optiomisedApproach(arr));	// TC : O(N)
	}
	
	private static int getSumofAllSubarraySum(int[] arr) {
		int sumOfSum = 0;
		for(int i = 0; i < arr.length; i++) {
			int sum = 0;
			for(int j = i; j < arr.length; j++) {
				sum += arr[j];
				sumOfSum += sum;
			}
		}		
		return sumOfSum;
	}
	
	private static int optiomisedApproach(int[] arr) {
		/**
		 * We can optimize this to O(N) using the approach in /dsa-java/src/com/scalar/array/subarrays/SubarraysContainingSpecificIndex.java
		 * 
		 * For a given array, if we want to calculate, the number of times an index is going to found,
		 * We only need to check for the valid combinations.
		 * Even with the brute force solution, we could make up that the start indices for valid subarray would be from 0 to k
		 * And the end index would be from k to N-1
		 * Therefore, total valid start indexes(0 to k) : k+1
		 * Total valid end indexes(k to N-1) : (N-1) - (k+1) = N-1 + k-1 = N-k
		 * => Total times the index will be repeated in subarrays = (k+1)*(N-k)
		 * 
		 * Now for each k, since we are getting the total number of times it is being repeated in the subarrays, 
		 * we can multiply with the value and add all the sums to get the total sum of all subarrays
		 * */
		
		int sum = 0;
		
		for(int i = 0; i< arr.length; i++) {
			int totalValidStartIndexes = i + 1;
			int totalValidEndIndexes = arr.length - i;
			int totalOccurenceOfIndex = totalValidStartIndexes * totalValidEndIndexes;
			
			sum += (totalOccurenceOfIndex * arr[i]);
		}
		return sum;
	}

}
