package com.scalar.ds.array.twodmatrix;

public class PrintBordersOfMatrix {

	/**
	 * Given 5x5 array, print all the border elements
	 * 
	 */

	public static void main(String[] args) {
		int arr[][] = { { 1, 2, 3, 4, 5 }, { 6, 7, 8, 9, 10 }, { 11, 12, 13, 14, 15 }, { 16, 17, 18, 19, 20 },
				{ 21, 22, 23, 24, 25 } };
		printBorders(arr);
		System.out.println("===== =");
		printBordersCleaner(arr);
	}

	static void printBorders(int[][] arr) {
		int N = arr.length;

		// print 0 to N-2 columns of the 0th row
		for (int i = 0; i < N - 1; i++) {
			System.out.println(arr[0][i]);

		}

		// print 0 to N-2 rows of the N-1th column
		for (int i = 0; i < N - 1; i++) {
			System.out.println(arr[i][N - 1]);
		}

		// print N-1 to 1 column of the N-1th row
		for (int i = N - 1; i > 0; i--) {
			System.out.println(arr[N - 1][i]);
		}

		// print 0 to N-1 row of the 0th column
		for (int i = N - 1; i > 0; i--) {
			System.out.println(arr[i][0]);
		}
	}

	static void printBordersCleaner(int[][] arr) {
		int i = 0, j = 0;
		int n = arr.length;

		for (int k = 0; k < n - 1; k++) {
			System.out.println(arr[i][j]);
			j++;
		}

		for (int k = 0; k < n - 1; k++) {
			System.out.println(arr[i][j]);
			i++;
		}

		for (int k = 0; k < n - 1; k++) {
			System.out.println(arr[i][j]);
			j--;
		}

		for (int k = 0; k < n - 1; k++) {
			System.out.println(arr[i][j]);
			i--;
		}
	}
}
