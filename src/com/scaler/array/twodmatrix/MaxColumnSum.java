package com.scaler.array.twodmatrix;

public class MaxColumnSum {

	/**
	 * Given a N x M 2D matrix print the max column sum
	 */
	public static void main(String[] args) {
		int[][] arr = { { 2, 3, -2, 0 }, { 6, 2, 4, 1 }, { -4, 1, 5, 3 } };
		columnWiseSum(arr);
	}

	private static void columnWiseSum(int[][] arr) {
		int rowLength = arr.length;
		int colLength = arr[0].length;

		for (int j = 0; j < colLength; j++) {
			int sum = 0;
			for (int i = 0; i < rowLength; i++) {
				sum += arr[i][j];
			}
			System.out.println("column - " + j + " sum : " + sum);
		}

	}

}