package com.scaler.array.twodmatrix;

public class PrintDiagonalsFor2DMatrix {
	
	/**
	 * Given a N x M 2D matrix print the left to right and right to left diagonals
	 */
	public static void main(String[] args) {
		int[][] arr = { { 2, 3, -2, 0 }, { 6, 2, 4, 1 }, { -4, 1, 5, 3 }, { 0, -5, 2, 8 } };
//		leftToRight(arr);
		rightToLeft(arr);
		
	}

	private static void leftToRight(int[][] arr) {		
		int i = 0;
		int N = arr.length;
		int M = arr[0].length;
		System.out.println("Left To Right");
		
		while(i < N) {
			System.out.println(arr[i][i]);
			i++;
		}
	}
	
	private static void rightToLeft(int[][] arr) {
		int i = 0;
		int j = arr[0].length-1;
		
		while(i < arr.length  && j >= 0) {
			System.out.println(arr[i][j]);
			i++;
			j--;
		}
	}

}
