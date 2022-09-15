package com.scaler.ds.array.prefixsum;

/**
 * Return prefix sum of the given array. 
 * */
public class PrefixSum {

	static int[] A = {-3, 6, 2, 4, 5, 2, 8, -9, 3, 1};
	
	public static void main(String[] args) {
		
		int[] PS = new int[A.length];
		
		PS[0] = A[0];
		
		for(int i = 1; i < PS.length; i++ ) {
			PS[i] = PS[i-1] + A[i];
		}
		
		for(int i = 0; i < PS.length; i++ ) {
			System.out.print(PS[i]+", ");
		}
	}
}
