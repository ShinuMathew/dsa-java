package com.scaler.ds.array.twodmatrix;

public class RectangularMatrixDiagonals {

	/**
	 * Given a rectangular matrix NxM, find all the diagonal elements starting from right to left
	 * */
	public static void main(String[] args) {
		int[][] arr = { { 2, 3, -2, 0, 4, 7 }, { 6, 2, 4, 2, 3, 1 }, { -4, 1, 5, 9, 0, 3 }, { 0, -5, 2, 8, 1, -2 } };
		printAllDiagonals(arr);
	}
	
	private static void printAllDiagonals(int[][] arr) {
		int N = arr.length;
		int M = arr[0].length;
		
		for(int j = 0; j < M; j++) {
			int r = 0;
			int c = j;
			while(r < N && c >= 0) {
				System.out.print("[ "+r+", "+c+" ]");
				r++;
				c--;
			}
			System.out.println();
		}
		
		for(int i = 1; i < N; i++) {	// i starts from 1 instead of 0 because we already printed the 0th row & (M-1)th column diagonal
			int r = i;
			int c = M-1;
			while(r < N && c >=0) {
				System.out.print("[ "+r+", "+c+" ]");
				r++;
				c--;
			}
			System.out.println();
		}
	}
	
}
