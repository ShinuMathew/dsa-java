package com.scalar.bitmanipulation;

public class UniqueElements2 {

	/**
	 * Given ar[n], contains all elements from [1, N-2] except 2 elements. Find 2
	 * missing ele
	 */
	public static void main(String[] args) {

		int[] arr = { 6, 1, 2, 8, 5, 4 };
		int N = 9 ;
		findUniqueElements(arr, N);
	}

	private static void findUniqueElements(int[] arr, int N) {
		int n = arr.length;
		int res = 0;
		for (int i = 0; i < n; i++) {
			res = res ^ arr[i];
		}

		for (int i = 1; i < N; i++) {
			res = res ^ i;
		}

		int bitPosition = 0;
		while (bitPosition < 32) {
			if (((res >> bitPosition) & 1) == 1) {
				break;
			}
			bitPosition++;
		}

		int setBitunique = 0;
		int unsetBitunique = 0;

		for (int i = 0; i < arr.length; i++) {
			if (((arr[i] >> bitPosition) & 1) == 1) {
				setBitunique = setBitunique ^ arr[i];
			} else {
				unsetBitunique = unsetBitunique ^ arr[i];
			}
		}

		for (int i = 1; i < N; i++) {
			if (((i >> bitPosition) & 1) == 1) {
				setBitunique = setBitunique ^ i;
			} else {
				unsetBitunique = unsetBitunique ^ i;
			}
		}

		System.out.println(setBitunique + ", " + unsetBitunique);
	}
}
