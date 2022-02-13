package com.scalar.basicprogramming;

/**
 * Given an array of size "N" and a positive integer "k", such that k < N.
 * Rotate the array in a clockwise direction by k times without using any
 * external space.
 */
public class RotateArray {

	public static void main(String[] args) {

		int[] arr1 = { 1, 2, 3, 4, 5, 6, 7 };
		int k1 = 3;

		// BRUTE FORCE APPROACH
		System.out.println("BRUTE FORCE APPROACH : ");
		
		int count = 0;
		while (count < k1) {
			int temp = arr1[arr1.length - 1];
			for (int i = arr1.length - 2; i >= 0; i--) {
				arr1[i+1] = arr1[i];
			}
			arr1[0] = temp;
			count++;
		}
		
		for(int a = 0; a < arr1.length; a++) {
			System.out.print(arr1[a]+", ");
		}
		
		// OPTIMISED APPROACH
		System.out.println("\n\nOPTIMISED APPROACH : ");
		/**
		 * After the kth rotation, the updated index for ith element is (i + k)
		 * After k rotations, the k elements from the last gets moved to the beginning and the N-k elements moves to the last
		 * Therefore, we can use reverse array fist to get the last k elements in the starting position
		 * jHowever the elements wont be in the expected order. We need to reverse the subarrays (0, k) and (k+1, N-1)
		 * */
		int[] arr2 = { 1, 2, 3, 4, 5 };
		int k2 = 3;
		int len = arr2.length;
		k2 = k2 % len;
		
		// Reverse the complete array
		arr2 = reverseArray(arr2, 0, len-1);
		
		// Reverse the first k elements
		arr2 = reverseArray(arr2, 0, k2-1);

		// Reverse the first k elements
		arr2 = reverseArray(arr2, k2, len-1);
		
		
		for(int a = 0; a < arr2.length; a++) {
			System.out.print(arr2[a]+", ");
		}
		
	}
	
	private static int[] reverseArray(int[] arr, int start, int end) {
		while(start < end) {
			int temp = arr[start];
			arr[start] = arr[end];
			arr[end] = temp;
			start++;
			end--;
		}
		return arr;
	}
}
