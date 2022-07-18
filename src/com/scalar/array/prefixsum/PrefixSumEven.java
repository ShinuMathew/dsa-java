package com.scalar.array.prefixsum;

/**
 * Given an array of size 'N'. Return the prefix sum array of the even elements.
 */
public class PrefixSumEven {
	
	
	public static void main(String[] args) {
		int[] A = {2, 3, 1, -1, 0, 8, 5, 4};
		int[] PS = new int[A.length];
		
		PS[0] = A[0];
		for(int i = 1; i < A.length; i++) {
			if(i % 2 == 0)
				PS[i] = PS[i-1] + A[i];
			else 
				PS[i] = PS[i-1];
		}
		
		for(int i = 1; i < A.length; i++) {
			System.out.println(PS[i]);
		}
		
	}

}
