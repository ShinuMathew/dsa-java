package com.scalar.array;

/**
 * Given an array of size "n" check if there exist a pair (i, j) such that a[i]
 * + a[j] = k where i != j
 */
public class SumOfPairs {

	public static void main(String[] args) {

		int[] arr = { 3, -2, 1, 4, 3, 6, 8 };
		int k = 10;

		// Brute Force solution
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr.length; j++) {
				if (i == j)
					continue;
				if (arr[i] + arr[j] == k) {
					System.out.println("(" + i + ", " + j + ")");
				}
			}
		}

		// Optimized solution :
		/**
		 * For this problem we can exclude some cases, - Pairs which are i == j -
		 * Duplicate pairs will be true for this problem. Ex : 3,5 and 5,3. Therefore we
		 * can exclude one quadrant of pairs. either upper or lower
		 */
		for (int i = 0; i < arr.length; i++) {
			for (int j = i + 1; j < arr.length; j++) {
				// No need to check for i == j now
				if (arr[i] + arr[j] == k) {
					System.out.println("(" + i + ", " + j + ")");
				}
			}
		}
		
		// Time complexity : O(N^2) since the inner loop follows an Arithematic Progression for the complete iterations, we get N^2/2 - N/2 
		//		Hence we take the highest order N^2. 
	}
}
