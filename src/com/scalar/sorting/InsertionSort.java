package com.scalar.sorting;

public class InsertionSort {

	public static void main(String[] args) {
		// insertSingleElement();
		int[] arr = { 2, 11, -1, 6, 8, 3, 9, 4, 1, 8, 5 };
		sort(arr);

	}

	private static void sort(int[] arr) {
		for (int i = 1; i < arr.length; i++) {
			int temp = arr[i];			
			for(int j = 0; j < i; j++) {
				if(arr[j] > arr[i]) {
					for(int k = i; k > j; k--) {
						arr[k] = arr[k-1];
					}
					arr[j] = temp;
					break;
				}
			}
		}
		printArray(arr);
	}

	private static void insertSingleElement() {

		int[] arr = { 1, 2, 4, 5, 3 };
		int temp = arr[arr.length - 1];
		for (int i = 0; i < arr.length - 1; i++) {
			if (arr[i] > arr[arr.length - 1]) {
				for (int j = arr.length - 2; j >= i; j--) {
					arr[j + 1] = arr[j];
				}
				arr[i] = temp;
				break;
			}
		}
		printArray(arr);
	}

	private static void printArray(int[] arr) {
		System.out.print("[ ");
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.print("]");
		System.out.println("");
	}

}
