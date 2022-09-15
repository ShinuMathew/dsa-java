package com.scaler.ds.array.twodmatrix;

public class TransposeMatrixNxN {

	/**
	 * Given a square matrix N x N find the transpose inspace(No new array should be
	 * created)
	 */
	public static void main(String[] args) {
		int arr[][] = { { 2, -1, 3, 2 }, { 4, 0, 1, 3 }, { 8, -6, 2, 4 }, { 8, -4, 2, 6 } };
		findTranspose(arr);
	}

	private static void findTranspose(int[][] arr) {
		System.out.println("INPUT MATRIX");
		printMatrix(arr);
		for (int i = 0; i < arr.length; i++) {
			for (int j = i+1 ; j < arr.length; j++) {
				int temp = arr[i][j];
				arr[i][j] = arr[j][i];
				arr[j][i] = temp;
			}
		}
		System.out.println("TRANSPOSE MATRIX");
		printMatrix(arr);
	}

	private static void printMatrix(int[][] arr) {
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr.length; j++) {
				System.out.print(" " + (arr[i][j] < 0 ? arr[i][j] : " " + arr[i][j]) + " ");
			}
			System.out.println();
		}
	}

}
