package com.scaler.ds.array.carryforward;

public class ClosestMinMax {

	public static void main(String[] args) {

		int[] arr = { 343, 291, 963, 165, 152 };
		System.out.println(solve(arr));;
	}

	public static int solve(int[] A) {
		int max = A[0];
		int min = A[0];
		for (int i = 1; i < A.length; i++) {
			if (A[i] > max) {
				max = A[i];
			} else if (A[i] < min) {
				min = A[i];
			}
		}
		int firstMinIndex = -1;
		int firstMaxIndex = -1;
		int length = Integer.MAX_VALUE;
		for (int i = 0; i < A.length; i++) {
			if(A[i] == max) {
				firstMaxIndex = i;
			}
			if(A[i] == min) {
				firstMinIndex = i;
			}
			if(firstMinIndex > -1 && firstMaxIndex > -1) {
				int l = Math.abs(firstMaxIndex - firstMinIndex) + 1;
				length = length < l ? length : l;
			}
		}
				
		return length;
	}

}
