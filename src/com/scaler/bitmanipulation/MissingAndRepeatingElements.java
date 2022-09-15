package com.scaler.bitmanipulation;

public class MissingAndRepeatingElements {

	/**
	 * Given arr[N], it contains all elements [1, N] except 2 elements such that 1
	 * element is missing and 1 is repeating. Find both
	 */
	public static void main(String[] args) {
		int[] arr = { 3, 5, 1, 4, 6, 5 }; // ans {2, 5}
		findMissingAndRepeatingElements(arr);		
	}

	private static void findMissingAndRepeatingElements(int arr[]) {
		int N = arr.length;
		int res = 0;
		for (int i = 0; i < N; i++) {
			res = res ^ arr[i];
			res = res ^ i + 1;
		}

		int bitposition = 0;
		while (bitposition < 32) {
			if (((res >> 1) & 1) == 1) {
				break;
			}
			bitposition++;
		}

		int setBitUnique = 0;
		int unsetBitUnique = 0;
		for (int i = 0; i < N; i++) {
			if (((arr[i] >> bitposition) & 1) == 1) {
				setBitUnique = setBitUnique ^ arr[i];
			} else {
				unsetBitUnique = unsetBitUnique ^ arr[i];
			}
			if ((((i + 1) >> bitposition) & 1) == 1) {
				setBitUnique = setBitUnique ^ i + 1;
			} else {
				unsetBitUnique = unsetBitUnique ^ i + 1;
			}
		}

		System.out.println(setBitUnique + ", " + unsetBitUnique);
	}
}
