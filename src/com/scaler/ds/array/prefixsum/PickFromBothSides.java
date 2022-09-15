package com.scaler.ds.array.prefixsum;

public class PickFromBothSides {

	/**
	 * You are given an integer array A of size N. You have to pick B elements in
	 * total. Some (possibly 0) elements from left end of array A and some (possibly
	 * 0) from the right end of array A to get the maximum sum.
	 * 
	 * Find and return this maximum possible sum.
	 * 
	 * NOTE: Suppose B = 4, and array A contains 10 elements, then You can pick the
	 * first four elements or can pick the last four elements, or can pick 1 from
	 * front and 3 from the back, etc. You need to return the maximum possible sum
	 * of elements you can pick.
	 */
	
	public static void main(String[] args) {
		int[] arr = {-533, -666, -500, 169, 724, 478, 358, -38, -536, 705, -855, 281, -173, 961, -509, -5, 942, -173, 436, -609, -396, 902, -847, -708, -618, 421, -284, 718, 895, 447, 726, -229, 538, 869, 912, 667, -701, 35, 894, -297, 811, 322, -667, 673, -336, 141, 711, -747, -132, 547, 644, -338, -243, -963, -141, -277, 741, 529, -222, -684, 35};
		System.out.println(solve(arr, 48));
	}
	
	
	public static int solve(int[] A, int B) {
        int[] PA = getPrefixSum(A);
        // PA[i] = sum(A[0] to A[i])
        int startPointer = 0;
        int endPointer = B-1;
        int maxSum = PA[endPointer];
        startPointer++;
        while(startPointer < A.length) {
            if(endPointer == A.length-1) {
                endPointer = 0;
            } else {
                endPointer++;
            }
            int sum = 0;
            if(endPointer > startPointer) {
                sum = PA[endPointer] - (startPointer > 0 ? PA[startPointer -1] : 0);
            } else {
                int sum1 = PA[A.length-1] - (startPointer > 0 ? PA[startPointer -1] : 0);
                int sum2 = PA[0];   // sum is 0 if endPointer == 0. So no need to validate
                if(endPointer > 0) {
                    sum2 = PA[endPointer];
                }
                sum = sum1 + sum2;
            }
            
            System.out.println("MaxSum : "+maxSum+" ; Sum : "+sum+" ; startPoint : "+startPointer+" ; EndPoint : "+endPointer);
            maxSum = Math.max(maxSum, sum);
            startPointer++;
        }
        return maxSum;        
    }

    private static int[] getPrefixSum(int[] A) {
        int[] PA = new int[A.length];
        PA[0] = A[0];
        for(int i = 1; i < A.length; i++) {
            PA[i] = PA[i-1] + A[i];
        }
        return PA;
    }
}
