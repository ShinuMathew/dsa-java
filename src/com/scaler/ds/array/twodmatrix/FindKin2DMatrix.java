package com.scaler.ds.array.twodmatrix;

public class FindKin2DMatrix {

	/**
	 * Given a 2D matrix and a value "k". Find if "k" exists in the matrix.
	 */
	public static void main(String[] args) {
		
		int[][] A = {
				{-10, -5, -2,  2,  4,  7},
				{ -7, -4, -1,  3,  6,  9},
				{ -2,  3,  5,  7,  10, 14},
				{  3,  6,  8,  11, 14, 17},
				{  7,  11, 12, 15, 19, 20},
				{ 10,  16, 18, 20, 24, 29},
		};
		int k = 12;
		System.out.println(findK(A, k));
	}
	
	private static String findK(int[][] A, int k) {
		int N = A.length;
		int M = A[0].length;
		int i = 0;
		int j = M-1;
		
		while(i < N && j >= 0) {
			
			if(A[i][j] == k) {
				return i+", "+j;
			}
			
			if(A[i][j] < k) {
				i++;				
			} else {
				j--;
			}			
			
		}
		return "null";
		
	}
}
