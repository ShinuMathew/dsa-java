package com.scaler.ds.array.twodmatrix;

import java.util.Arrays;

public class ColumnSum {
	
	/**
	 * You are given a 2D integer matrix A, return a 1D integer array containing column-wise sums of original matrix.
	 */
	public static void main(String[] args) {
		int arr[][] = { { 2, -1, 3, 2 }, { 4, 0, 1, 3 }, { 8, -6, 2, 4 }, { 8, -4, 2, 6 } };
		int[] result = solve(arr);
		System.out.println(Arrays.toString(result));
	}
	
	private static  int[] solve(int[][] A) {
        int[] result = new int[A[0].length];
        for(int j = 0; j < A[0].length; j++) {
            for(int i = 0; i < A.length; i++) {
                result[j] += A[i][j];
            }
        }
        return result;
    }

}
