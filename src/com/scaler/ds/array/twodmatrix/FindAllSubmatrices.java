package com.scaler.ds.array.twodmatrix;

public class FindAllSubmatrices {
	
	/**
	 * Print all submatrices
	 */
	public static void main(String[] args) {
		int[][] arr = {{1, 2}, {3, 4}};
		printMatrix(arr);
		printAllSubmatrices(arr);
	}
	
	private static void printAllSubmatrices(int[][] arr) {
		for (int a1 = 0; a1 < arr.length; a1++) {
			for (int b1 = 0; b1 < arr.length; b1++) {
				for (int a2 = a1; a2 < arr.length; a2++) {
					for (int b2 = b1; b2 < arr.length; b2++) {
						for (int i = a1; i <= a2; i++) {
							System.out.println(" ");
							for (int j = b1; j <= b2; j++) {
								System.out.print(" "+arr[i][j]);
							}
							System.out.println(" ");
						}
						System.out.println("===============");
					}
				}
			}
		}
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
