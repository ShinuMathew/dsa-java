package com.scalar.array;

import java.util.Scanner;

public class MaxAndMinInArray {

	public static void main(String[] args) {
		//	int arr[] = {6, 3, -1, 7, 11, 5, -4, 19, 9};
		// E.g. 'Scanner' for input & 'System.out' for output
		Scanner sc1 = new Scanner(System.in);
		int len = sc1.nextInt();
		int[] arr = new int[len];
		for (int a = 0; a < len; a++) {
			arr[a] = sc1.nextInt();
		}

		int min = arr[0];
		int max = arr[0];

		for (int i = 0; i < arr.length; i++) {
			if (arr[i] > max) {
				max = arr[i];
			}
			if (arr[i] < min) {
				min = arr[i];
			}
		}
		System.out.print(max + " " + min);
	}
}
