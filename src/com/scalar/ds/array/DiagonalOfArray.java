package com.scalar.ds.array;

public class DiagonalOfArray {

	public static void main(String[] args) {
		
		int[] arr = { 1, 3, 7, 4, 0, 7, 11, 5, 3, 7, 19, 10, 6, 13, 17, 1, 8, 4 };
		for(int i = 0 ; i < arr.length; i++) {
			for(int j = i+1 ; j < arr.length; j++) {
				System.out.print("("+i+","+j+"), ");
			}
			System.out.println();
		}
		
		System.out.println(-2 % 2);
	}
}
