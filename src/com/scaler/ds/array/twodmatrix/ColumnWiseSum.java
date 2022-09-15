package com.scaler.ds.array.twodmatrix;

import java.util.Arrays;
import java.util.stream.Collectors;

public class ColumnWiseSum {

	public static void main(String[] args) {
		int[][] A = { { 1, 2, 3, 4 }, { 5, 6, 7, 8 }, { 9, 10, 11, 12 }, { 13, 14, 15, 16 }, { 17, 18, 19, 20 } };
		Arrays.stream(solve(A)).boxed().collect(Collectors.toList()).forEach(a -> System.out.println(a+", "));
	}

	public static int[] solve(int[][] A) {
		int[] result = new int[A[0].length];
		for (int j = 0; j < A[0].length; j++) {
			for (int i = 0; i < A.length; i++) {
				result[j] += A[i][j];
			}
		}
		return result;
	}
}
