package com.scalar.array;

/**
 * Given an array of size 'N'. Count the number of special index in the array.
 * Special Index : An index which when removed, the sum of the even array index and odd index are equal.
 */
public class SpecialIndex {

	public static void main(String[] args) {
		
//		int[] A = {3, 2, 4, 7, 6, -2};
		int[] A = {1, 1, 1};
		System.out.println(bruteForceSolution(A));
		
	}
	
	private static int bruteForceSolution(int[] A) {
		/**
		 * Iterate over the indexes and for each index calculate even and odd sum 
		 * such that the sum of odd indices when index is greater than index under test is the sum of even indices  
		 * Time Complexity : O(N^2)
		 * */
		int count = 0;
		for(int i = 0; i < A.length; i++) {
			int evenSum = 0;
			int oddSum = 0;
			for(int j = 0; j < A.length; j++) {
				if(j < i) {
					if(j % 2 == 0) {
						evenSum += A[j];
					} else {
						oddSum += A[j];
					}
				} else if(j > i) {
					if(j % 2 == 0) {
						oddSum += A[j];
					} else {
						evenSum += A[j];
					}
				}
			}
			if(evenSum == oddSum) {				
				count++;
			}
		}
		return count;
	}
	
	private static int optimisedSolution(int[] A) {
		/**
		 * Create the prefix sum array first
		 * */
		
		int count = 0;
		for(int i = 0; i < A.length; i++) {
			
		}
		return count;
	}
}
