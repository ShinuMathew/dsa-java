package com.scalar.basic;

public class ElementGreaterThanItself {
	/**
	 * Given an integer array of size "n", count the number of elements having
	 * atleast one element greater than itself {3, -2, 6, 8, 4, 8, 5}
	 */

	public static void main(String[] args) {

		// Approach 1:
		/**
		 * Find the max element in the array and check each element against it. If the
		 * number is less than the the max, +1
		 */
		
		System.out.println("APPROACH 1");
		int[] arr = { 3, -2, 6, 8, 4, 8, 5 };
		int max = arr[0];
		
		// Find max element in the array		
		for(int i = 0; i < arr.length; i++) {
			if(arr[i] > max) {
				max = arr[i];
			}
		}
		
		int count = 0;
		// Find elements which are < max
		for(int i = 0; i < arr.length; i++) {
			if(arr[i] < max) {
				count++;
			}
		}
		
		System.out.println(count);
		
		// Approach 2 : Instead of Finding elements which are < max, find the no. occurrences of max value.
		System.out.println("APPROACH 2");
		int[] arr2 = { 3, -2, 6, 8, 4, 8, 5 };
		int max2 = arr2[0];
		
		// Find max element in the array		
		for(int i = 0; i < arr2.length; i++) {
			if(arr2[i] > max2) {
				max2 = arr2[i];
			}
		}
		
		int count2 = 0;
		// Find elements which are < max
		for(int i = 0; i < arr2.length; i++) {
			if(arr2[i] != max2) {
				count2++;
			}
		}
		System.out.println(count2);

		// Approach 3 : Bring the above approach in on single loop
		System.out.println("APPROACH 3");
		int[] arr3 = { 8, 3, -2, 6, 8, 4, 8, 5 };
		int max3 = arr3[0];
		int count3 = 0;
		
		// Find max element in the array		
		for(int i = 0; i < arr2.length; i++) {
			if(arr3[i] > max3) {
				max3 = arr3[i];
			} else {
				count3++;
			}
		}
		System.out.println(count3);
		
	}

}
