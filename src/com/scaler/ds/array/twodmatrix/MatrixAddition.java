package com.scaler.ds.array.twodmatrix;

import com.scaler.base.utility.TwoDMatrix;

public class MatrixAddition {

	/**
	 * You are given two matrices A & B of same size, 
	 * you have to return another matrix which is the sum of A and B.
	 */
	public static void main(String[] args) {
		int[][] A = { { 1, 2, 3, 4 }, { 5, 6, 7, 8 }, { 9, 10, 11, 12 }, { 13, 14, 15, 16 }, { 17, 18, 19, 20 } };
		int[][] B = { { 1, 2, 3, 4 }, { 5, 6, 7, 8 }, { 9, 10, 11, 12 }, { 13, 14, 15, 16 }, { 17, 18, 19, 20 } };
		TwoDMatrix.printMatrix(solve(A, B));
	}
	
	private static int[][] solve(int[][] A, int[][] B) {
        int row = A.length;
        int col = A[0].length;        
        for(int i = 0; i<row; i++) {
            for(int j = 0; j<col; j++) {
                A[i][j] = A[i][j] + B[i][j];
            }
        }
        return A;
    }
}
