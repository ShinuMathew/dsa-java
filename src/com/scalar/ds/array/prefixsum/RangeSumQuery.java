package com.scalar.ds.array.prefixsum;

import java.util.stream.Stream;

public class RangeSumQuery {

	public static void main(String[] args) {
		int[] A = { 7, 3, 1, 5, 5, 5, 1, 2, 4, 5 };
		int[][] B = { { 7, 10 }, { 3, 10 }, { 3, 5 }, { 1, 10 } };
		long[] result = rangeSum(A, B);
		
		for(int i = 0; i < result.length; i++) {
			System.out.println(result[i]);
		}
	}

	static long[] rangeSum(int[] A, int[][] B) {
		long[] result = new long[B.length];
		long[] PS = createPrefixSumArray(A);
		for (int i = 0; i < B.length; i++) {
			int l = B[i][0]-1;
			int r = B[i][1]-1;
			long sum = PS[r] - ((l == 0) ? 0 : PS[l - 1]);
			result[i] = sum;
		}
		return result;
	}

	static long[] createPrefixSumArray(int[] A) {
		long[] PS = new long[A.length];
		PS[0] = A[0];
		for (int i = 1; i < A.length; i++) {
			PS[i] = PS[i - 1] + A[i];
		}
		return PS;
	}

}
