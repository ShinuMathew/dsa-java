package com.scaler.ds.array;

public class Triplets {

	public static void main(String[] args) {
		int[] arr = { 2, 12, 4, 3 };
		int n = 9;
		findTriplets(arr, n);
	}

	private static void findTriplets(int[] arr, int n) {

		// int[] outputArr = new int[arr.length]
		for (int i = 0; i < arr.length; i++) {
			for (int j = i+1; j < arr.length; j++) {
				for (int k = j+1; k < arr.length; k++) {
					if (arr[i] + arr[j] + arr[k] == n) {
						System.out.println("[" + arr[i] + ", " + arr[j] + ", " + arr[k] + "] is a valid triplet");
					}
				}
			}
		}
	}
	
	private static void optimizedtriplets(int[] arr, int n) {
		// Contribution technique
	}
}
