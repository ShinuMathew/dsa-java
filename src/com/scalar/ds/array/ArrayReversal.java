package com.scalar.ds.array;

/**
 * Given an array of size N, reverse the array without creating a new array.
 * */
public class ArrayReversal {

	public static void main(String[] args) {
		
		// With For loop:
		
		int[] arr1 = {-1, 4, 7, 6, -2, 7, 8, 10, 2};
		// {2, 10, 8, 7, -2, 6, 7, 4, -1}
		int N1 = arr1.length;
		for(int i = 0; i < N1/2; i++) {
			int temp = arr1[i];
			arr1[i] = arr1[N1-1-i];
			arr1[N1-1-i] = temp;
		}
		
		for(int i = 0; i < N1; i++) {
			System.out.print(arr1[i]+", ");
		}
		
		System.out.println("\n====================================");
		
		// With while loop
		
		int[] arr2 = {-1, 4, 7, 6, -2, 7, 8, 10, 2};
		// {2, 10, 8, 7, -2, 6, 7, 4, -1}
		int N2 = arr2.length;
		int i = 0, j = N2-1;
		while(i < j) {
			int temp = arr2[i];
			arr2[i] = arr2[j];
			arr2[j] = temp;
			
			i++;
			j--;
		}

		for(int a = 0; a < N2; a++) {
			System.out.print(arr2[a]+", ");
		}
		
		// Time Complexity : Since we are traversing each element only once, time complexity : O(N)
	}
}
