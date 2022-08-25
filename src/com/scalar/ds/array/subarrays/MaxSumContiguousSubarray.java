package com.scalar.ds.array.subarrays;

public class MaxSumContiguousSubarray {

	/**
	 * Find the contiguous non-empty subarray within an array, A of length N, with the largest sum.
	 * */
	public static void main(String[] args) {
		int[] A = { -2, 1, -3, 4, -1, 2, 1, -5, 4 };
		int[] PA = getPrefixSum(A);
		int max = A[0];
        for(int i = 0; i< A.length; i++) {
            for(int j = i; j< A.length; j++) {
                int sum = 0;
                if(i == 0) {
                    sum = PA[0];
                } else {
                    sum = PA[j] - PA[i-1];
                }
                max = Math.max(max, sum);
            }   
        }
        System.out.println(max);			
	}

	private static int[] getPrefixSum(int[] A) {
		int[] PA = new int[A.length];
		PA[0] = A[0];

		for (int i = 1; i < A.length; i++) {
			PA[i] = PA[i - 1] + A[i];
		}
		return PA;
	}

}
