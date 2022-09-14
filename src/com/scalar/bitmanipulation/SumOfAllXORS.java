package com.scalar.bitmanipulation;

public class SumOfAllXORS {

	public static void main(String[] args) {
		int[] arr = { 3, 5, 6, 8, 2 };
		System.out.println(findSumOfAllXORPairs(arr));
	}

	private static int findSumOfAllXORPairs(int[] arr) {
		int n = arr.length;
		int sum = 0;
		for (int i = 0; i < 32; i++) {
			int set = 0;
			int unset = 0;
			for (int j = 0; j < n; j++) {
				if (((arr[j] >> i) & 1) == 1) {
					set++;
				} else {
					unset++;
				}
			}
			sum += (set * unset) * 1 << i;
		}
		return sum * 2;
	}

}
