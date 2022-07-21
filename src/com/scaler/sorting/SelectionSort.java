package com.scaler.sorting;

public class SelectionSort {

	public static void main(String[] args) {
		int[] arr = { 2, 11, -1, 6, 8, 3, 9, 4, 1, 8, 5 };
		sort(arr);
	}

	private static void sort(int[] arr) {

		for (int i = 0; i < arr.length; i++) {
			int minIndex = i;
			for (int j = i; j < arr.length; j++) {
				if(arr[minIndex] > arr[j]) {
					minIndex = j;
				}
			}
			int temp = arr[i];
			arr[i] = arr[minIndex];
			arr[minIndex] = temp;
			System.out.println("i : "+i);
			printArray(arr);
			
		}
	}
	
	private static void printArray(int[] arr) {
		System.out.print("[ ");
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] +" ");
		}
		System.out.print("]");
		System.out.println("");
	}

}
