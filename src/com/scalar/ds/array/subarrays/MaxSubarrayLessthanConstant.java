package com.scalar.ds.array.subarrays;

public class MaxSubarrayLessthanConstant {
	
	public static void main(String[] args) {
		int[] C = { 4 };
		maxSubarray(1, 75, C);
	}
	
	
	public static int maxSubarray(int A, int B, int[] C) {
        int[] PS = getPrefixSumArr(C);
        int maxSum = 0;
        for(int i = 0; i < A; i++) {
            for(int j = i; j < A; j++) {
                int sum = PS[j] - (i == 0 ? 0 : PS[i-1]);
                if(sum > maxSum) {
                    if(sum <= B) {
                        maxSum = sum;
                    }
                }
            }
        }
        return maxSum;
    }

    private static int[] getPrefixSumArr(int[] A) {
        int[] PS = new int[A.length];
        PS[0] = A[0];

        for(int i = 1; i < A.length; i++){
            PS[i] = PS[i-1] + A[i];
        }
        return PS;
    }

}
