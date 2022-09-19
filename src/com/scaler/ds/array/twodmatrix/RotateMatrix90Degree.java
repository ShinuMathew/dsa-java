package com.scalar.ds.array.twodmatrix;

public class RotateMatrix90Degree {
	
	/**
	 * Given an 2D matrix. Rotate it by 90 degree
	 */
	
	public static void main(String[] args) {
		int[][] A = {{1, 2, 3 ,4}, {5, 6, 7, 8}, {9, 10, 11, 12}, {13, 14, 15, 16}};
		printMatrix(A);
		rotateMatrixBy90Deg(A);
		System.out.println("After Rotation");
		printMatrix(A);
	}
	
	private static void rotateMatrixBy90Deg(int[][] A) {
		int N = A.length;
		for(int i = 0; i < N/2; i++) {
			for(int j = 0; j < N/2; j++) {
				int rotations = 0;
				int temp = A[i][j];
				int row = i;
				int col = j;
				while(rotations < N) {					
					System.out.println(row+", "+col);
					int buffertemp = A[col][N-1-row];
					A[col][N-1-row] = temp;
					temp = buffertemp;
					rotations++;
					int prevI = row;
					row = col;
					col = N-1-prevI;
				}
			}			
		}			
	}
	
	private static void printMatrix(int[][] A) {
		for(int i = 0; i < A.length; i++) {
			for(int j = 0; j < A.length; j++) {
				System.out.print((A[i][j] > 9) ? A[i][j]+" " : A[i][j]+"  ");
			}
			System.out.println();
		}
	}

}
