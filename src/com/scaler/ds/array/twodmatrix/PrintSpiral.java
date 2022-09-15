package com.scaler.ds.array.twodmatrix;

public class PrintSpiral {
	
	public static void main(String[] args) {
		int evenArr[][] = { { 1, 2, 3, 4, 5, 6 }, { 7, 8, 9, 10, 11, 12 }, { 13, 14, 15, 16, 17, 18 }, { 19, 20, 21, 22, 23, 24 },
				{ 25, 26, 27, 28, 29, 30 }, { 31, 32, 33, 34, 35, 36 } };
		
		int oddArr[][] = { { 1, 2, 3, 4, 5 }, { 6, 7, 8, 9, 10 }, { 11, 12, 13, 14, 15 }, { 16, 17, 18, 19, 20 },
				{ 21, 22, 23, 24, 25 } };
		int singleMatrix[][] = {{1}};
		printSpiral(singleMatrix);
	}

	static void printSpiral(int[][] arr) {
		int i = 0, j = 0;
		int n = arr.length;

		while (n > 1) {
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
			i++;
			j++;
			n = n - 2;
		}
		
		if(n == 1) {
			System.out.println(arr[i][j]);
		}
	}
}
