package com.scaler.ds.array;

public class NoOfTriplets {

	/**
	 * Given array of n integers, find the no of triplets i, j, k which satisfy the
	 * following condition i<j<k & ar[i]<ar[j]<ar[k]
	 */
	public static void main(String[] args) {
		int[] arr = { 4, 1, 2, 6, 9, 7 };
		System.out.println(findTripletsBF(arr));
		System.out.println(optimisedContributionTechnoque(arr));
		;
	}

	private static int findTripletsBF(int[] arr) {
		int count = 0;
		for (int i = 0; i < arr.length; i++) {
			for (int j = i + 1; j < arr.length; j++) {
				for (int k = j + 1; k < arr.length; k++) {
					if (arr[i] < arr[j] && arr[j] < arr[k]) {
						count += 1;
					}
				}
			}
		}
		return count;
	}

	private static int optimisedContributionTechnoque(int[] arr) {
		int n = arr.length;
		int ans = 0;

		for (int j = 0; j < n; j++) {
			int l = 0;
			int r = 0;
			int cnt = 0;
			for (int i = 0; i < j; i++) {
				if (arr[i] < arr[j]) {
					l += 1;
				}
			}
			for (int k = j + 1; k < n; k++) {
				if (arr[k] > arr[j]) {
					r += 1;
				}
			}
			cnt = l * r;
			ans += cnt;
		}
		return ans;
	}
}
