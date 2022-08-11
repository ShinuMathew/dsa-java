package com.scalar.array.twodmatrix;

public class RowWiseSum2DArray {

	/**
	 * Given a N x M matrix, print the row wise sum
	 * */
	public static void main(String[] args) {

		int[][] arr = { { 2, -1, 3, 2 }, { 4, 0, 1, 3 }, { 8, -6, 2, 4 } };
		rowWiseSum(arr);
	}
	
	private static void rowWiseSum(int[][] arr) {
		for(int i = 0; i < arr.length; i++) {
			int sum = 0;
			for(int j = 0; j < arr[i].length; j++) {
				sum += arr[i][j];
			}
			System.out.println("row - "+i+" sum : "+sum);
		}
	}
}
