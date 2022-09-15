package com.scaler.ds.array.subarrays;

public class LeastAverageSubarray {

	public static void main(String[] args) {
//		int[] A = {18, 11, 16, 19, 11, 9, 8, 15, 3, 10, 9, 20, 1, 19};
		int[] A = { 20, 3, 13, 5, 10, 14, 8, 5, 11, 9, 1, 11 };
		System.out.println(solve(A, 9));
	}

	public static int solve(int[] A, int B) {
		int[] PS = getPrefixSumArr(A);
		int minAvgIndex = 0;
		float minAvg = Float.MAX_VALUE;
		for (int i = 0; i <= (A.length - B); i++) {

			float sum = PS[i + B - 1] - (i == 0 ? 0 : PS[i - 1]);
			float avg = sum / B;
			System.out.println("i : " + i + " sum : " + sum + " avg : " + avg);
			if (avg < minAvg) {
				minAvg = avg;
				minAvgIndex = i;
			}
		}
		return minAvgIndex;
	}

//	private static float getAverage(int[] A, int startIndex, int endIndex) {
//		int sum = 0;
//		for (int i = startIndex; i <= endIndex; i++) {
//			sum += A[i];
//		}
//		return sum / (endIndex - startIndex + 1);
//	}

	private static int[] getPrefixSumArr(int[] A) {
		int[] PS = new int[A.length];
		PS[0] = A[0];

		for (int i = 1; i < A.length; i++) {
			PS[i] = PS[i - 1] + A[i];
		}
		return PS;
	}
}
