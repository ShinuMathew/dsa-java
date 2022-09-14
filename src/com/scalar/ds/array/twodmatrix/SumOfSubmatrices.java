package com.scalar.ds.array.twodmatrix;

public class SumOfSubmatrices {
	
	/**
	 * Given a 2D array, find the sum of all sub-matrices
	 */
	public static void main(String[] args) {
		int[][] A = {
				{9, 6},
				{5, 4}
		};		
		int[][] A1 = {
			{1,  2,  3,  4}, 
			{5,  6,  7,  8}, 
			{9,  10, 11, 12}, 
			{13, 14, 15, 16}, 
			{17, 18, 19, 20}
		};
		bruteForceSolution(A);
//		System.out.println(contributionTechnique(A));
	}
	
	private static int bruteForceSolution(int[][] A) {
		for(int i = 0; i < A.length; i++) {
			for(int j = 0; j < A.length; j++) {
				for(int k = 0; k < A[i].length; k++) {
					for(int l = 0; j < A[i].length; l++) {
						System.out.print(A[i][j]+", "+A[k][l]);
					}
					System.out.print(", ");
				}
				System.out.println();
			}
			System.out.println("=============");
		}
		return 0;
	}
	
	private static int contributionTechnique(int[][] A) {
		int ans = 0;
		int N = A.length;
		int M = A[0].length;
		for(int i = 0; i < A.length; i++) {
			for(int j = 0; j < A[i].length; j++) {
				ans = ans + (A[i][j]*(i+1)*(j+1)*(N-i)*(M-j));
			}
		}
		return ans;
	}

}
