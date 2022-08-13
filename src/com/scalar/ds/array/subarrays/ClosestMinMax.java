package com.scalar.ds.array.subarrays;

/**
 * Given and array, find the length of the smallest subarray which contains both
 * min and max values of the array.
 * 
 * Ex: [1, 2, 3, 1, 3, 4, 6, 4, 6, 3] Output : 3 to 4 : [1, 3, 4, 6]. Length = 6
 * - 3 + 1 = 4
 */
public class ClosestMinMax {

	public static void main(String[] args) {
		int[] arr = { 1, 6, 4, 6, 5, 1, 5, 2, 6, 4, 4, 2, 1, 5};
		// int[] arr = { 2, 2, 6, 4, 5, 1, 5, 2, 6, 4, 1 };
		//	int[] arr = {1, 2, 3, 1, 3, 4, 6, 4, 6, 3};
		//	int[] arr = {8, 8, 8, 8, 8};
		/**
		 * Issues you might face when solving. It might work good only for one minimum
		 * and one maximum For ex: If the array has [..., min, ...., min, ..., max, ...]
		 * Then, this approach will not be returning the closest but longest
		 */

		// WRONG ANSWER
		System.out.println(bruteForce(arr));
		
		/*
		 * The brute force solution, for each max/min is iterating the array again for its nearest min/max respectively.
		 * Hence the time complexity for this solution is O(n^2)
		 * The internal iteration can be swapped with carry forward approach
		 * */
		System.out.println(optimised(arr));

	}
	
	private static int optimised(int[] arr) {
		int max = getMax(arr);
		int min = getMin(arr);

		if (max == min) {
			return 1;
		}
		
		int ans = arr.length;
		
		int mini = -1;
		int maxi = -1;
		
		for(int i = arr.length - 1; i >= 0; i--) {
			if(arr[i] == max) {
				maxi = i;
				if(mini > -1) {
					ans = Math.min(ans,  Math.abs(maxi - mini) + 1);
				}
			}
			if(arr[i] == min) {
				mini = i;
				if(maxi > -1) {
					ans = Math.min(ans,  Math.abs(maxi - mini) + 1);
				}
			}
		}
		return ans;
	}

	private static int bruteForce(int[] arr) {
		int max = getMax(arr);
		int min = getMin(arr);

		if (max == min) {
			return 1;
		}

		int ans = arr.length;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == min) {				
				for (int j = i+1; j < arr.length; j++) {
					//	If you get another min, then no use iterating
					if(arr[j] == min) {
						break;
					}
					if(arr[j] == max) {
						ans = Math.min(ans, j - i + 1);
						break;
					}
				}
			}
			if (arr[i] == max) {
				for (int j = i+1; j < arr.length; j++) {
					if(arr[j] == max) {
						break;
					}
					if(arr[j] == min) {
						ans = Math.min(ans, j - i + 1);
						break;
					}
				}
			}
		}
		return ans;
	}

	private static void bruteForceWrong(int[] arr) {

		/**
		 * WRONG ANSWER This solution will only return the first found min and max. For
		 * ex: [2, 2, 6, 4, 5, 1, 5, 2, 6, 4, 1] Will return the subarray (2, 5) Length
		 * : 4 whereas the closest answer is (8, 10) length 3
		 */
		int max = getMax(arr);
		int min = getMin(arr);

		int minIndex = -1;
		int maxIndex = -1;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == min) {
				minIndex = i;
			}
			if (arr[i] == max) {
				maxIndex = i;
			}
			if (minIndex != -1 && maxIndex != -1) {
				break;
			}
		}

		int length = Math.abs(maxIndex - minIndex) + 1;

		System.out.println("[" + minIndex + ", " + maxIndex + "]. Length : " + length);
	}

	private static int getMin(int[] arr) {
		int min = arr[0];
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] < min) {
				min = arr[i];
			}
		}
		return min;
	}

	private static int getMax(int[] arr) {
		int max = arr[0];
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] > max) {
				max = arr[i];
			}
		}
		return max;
	}

}
