package com.scalar.ds.array;

public class LongestOnesInBinaryArray {
	/***
	 * Given a binary array, we can atmost replace one 0 to 1. Find the max
	 * consecutive 1's we can get in the array.
	 */
	public static void main(String[] args) {
//		int[] arr = { 0, 1, 1, 1, 0, 1, 1, 0, 1, 1, 0 };
		int[] arr = { 0, 0, 0, 1, 0};
		System.out.println(bruteForce(arr));
		;
	}

	private static int bruteForce(int[] arr) {
		int ans = 0;
		int cnt = 0;
		int n = arr.length;
		for (int i = 0; i < n; i++) {
			cnt += arr[i];
		}
		if (cnt == n) {
			return n;
		}

		for (int i = 0; i < n; i++) {
			if (arr[i] == 0) {
				int l = 0;
				int r = 0;
				for (int j = i - 1; j >= 0; j--) {
					if (arr[j] == 1) {
						l += 1;
					} else {
						break;
					}
				}

				for (int j = i + 1; j < n; j++) {
					if (arr[j] == 1) {
						r += 1;
					} else {
						break;
					}
				}

				cnt = l + r + 1;
				if (cnt > ans) {
					ans = cnt;
				}
			}
		}
		return ans;
	}

}
