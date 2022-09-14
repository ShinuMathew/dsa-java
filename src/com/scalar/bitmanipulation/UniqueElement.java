package com.scalar.bitmanipulation;

public class UniqueElement {

	/**
	 * Given N array elements, every element repeats twice except for one element.
	 * Find the unique element Ex: ar[5] = {6, 9, 6, 10, 9} Ans : 10
	 */
	public static void main(String[] args) {
		int[] arr = {6, 9, 6, 10, 9};
		bruteForce(arr);
		optimisedWithXOR(arr);
	}

	private static void bruteForce(int[] arr) {
		int n = arr.length;
		for (int i = 0; i < n; i++) {
			int count = 1;
			for(int j = 0; j < n; j++) {				
				if(i!=j && arr[i] == arr[j]) {
					count += 1;
				}
			}
			if(count == 1) {
				System.out.println(arr[i]); ;
			}
		}		
	}
	
	private static void optimisedWithXOR(int[] arr) {
		int n = arr.length;
		int ans = 0;	// Since 0^a = a
		for (int i = 0; i < n; i++) {
			ans = ans ^ arr[i];
		}
		System.out.println(ans);
	}

}
