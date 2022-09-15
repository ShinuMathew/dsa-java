package com.scaler.ds.array;

public class BinarySearch {

	public static void main(String[] args) {

		int arr[] = { 1, 5, 6, 9, 11, 13, 16, 20, 21, 25 };
		int x = 4;
		System.out.println(search(arr, 0, arr.length - 1, x));

	}

	public static int search(int[] arr, int l, int r, int x) {

		int mid = (l + r) / 2;
		if (l == r) {
			if (x == arr[l]) {
				return l;
			}
		}

		if (l < r) {
			if (x == arr[mid]) {
				return mid;
			} else if (x < arr[mid]) {
				r = mid - 1;
				return search(arr, l, r, x);
			} else {
				l = mid + 1;
				return search(arr, l, r, x);
			}
		} else {
			return -1;
		}
	}
}
