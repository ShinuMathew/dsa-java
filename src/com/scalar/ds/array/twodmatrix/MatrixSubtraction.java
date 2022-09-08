package com.scalar.ds.array.twodmatrix;

public class MatrixSubtraction {

	public static void main(String[] args) {
		int[][] A = { { 1, 2, 3, 4 }, { 5, 6, 7, 8 }, { 9, 10, 11, 12 }, { 13, 14, 15, 16 }, { 17, 18, 19, 20 } };
		int[][] B = { { 1, 2, 3, 4 }, { 5, 6, 7, 8 }, { 9, 10, 11, 12 }, { 13, 14, 15, 16 }, { 17, 18, 19, 20 } };
		printMatrix(solve(A, B));
	}

	public static int[][] solve(int[][] A, int[][] B) {
		for (int i = 0; i < A.length; i++) {
			for (int j = 0; j < A[0].length; j++) {
				A[i][j] -= B[i][j];
			}
		}
		return A;
	}
	
	private static void printMatrix(int[][] arr) {
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[0].length; j++) {
				System.out.print(arr[i][j] > 9 ? arr[i][j] + " " : arr[i][j] + "  ");
			}
			System.out.println();
		}
	}

}
