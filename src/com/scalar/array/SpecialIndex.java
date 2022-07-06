package com.scalar.array;

/**
 * Given an array of size 'N'. Count the number of special index in the array.
 * Special Index : An index which when removed, the sum of the even array index and odd index are equal.
 */
public class SpecialIndex {

	public static void main(String[] args) {
		
		int[] A = {3, 2, 4, 7, 6, -2};
//		int[] A = {1, 1, 1};
		System.out.println(optimisedSolution(A));
		
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
		 * Create the even and odd prefix sum array first
		 * Iterate through the array.
		 * For each iteration index "i", 
		 * 	the evenSum = PSE[i-1](Since we are removing i) + PSO[A.length - 1] - PSO[i]
		 * 	the oddSum = PSO[i-1](Since we are removing i) + PSE[A.length - 1] - PSE[i]
		 * */
		
		int count = 0;
		int[] prefixSumEven = new int[A.length];
        int[] prefixSumOdd = new int[A.length];
        prefixSumEven[0] = A[0];
        for(int i = 1; i < A.length; i++) {
            if(i % 2 == 0) {
                prefixSumEven[i] = prefixSumEven[i-1] + A[i];
                prefixSumOdd[i] = prefixSumOdd[i-1];
            } else {
                prefixSumEven[i] = prefixSumEven[i-1];
                prefixSumOdd[i] = prefixSumOdd[i-1] + A[i];
            }
        }

        for(int i = 0; i < A.length; i++) {
            int evenSum;
            int oddSum;
            if(i == 0) {
                evenSum = prefixSumOdd[A.length - 1];
                oddSum = prefixSumEven[A.length - 1];
            } else {
                evenSum = prefixSumEven[i-1] + (prefixSumOdd[A.length-1] - prefixSumOdd[i]);
                oddSum = prefixSumOdd[i-1] + (prefixSumEven[A.length-1] - prefixSumEven[i]);
            }

            if(evenSum == oddSum) {
                count++;
            }
        }
		return count;
	}
}
