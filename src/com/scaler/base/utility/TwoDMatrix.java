package com.scaler.base.utility;

public class TwoDMatrix {
	
	public static void printMatrix(int[][] arr) {
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[0].length; j++) {
				System.out.print(arr[i][j] > 9 ? arr[i][j] + " " : arr[i][j] + "  ");
			}
			System.out.println();
		}
	}

}
