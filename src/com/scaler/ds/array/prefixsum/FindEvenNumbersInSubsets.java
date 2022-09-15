package com.scaler.ds.array.prefixsum;

import java.util.Scanner;

public class FindEvenNumbersInSubsets {

	public static void main(String[] args) {
		int[] arr = { 2, 4, 3, 7, 9, 8, 6, 5, 4, 9 };
		findEvenNumbers(arr, 4);
	}

	static void findEvenNumbers(int[] arr, int queries) {
//		int[] evenArrPS = getEvenArrayPS(arr);
		int[] evenArrPS = getEvenArrayPSSingleArray(arr);
		Scanner sc1 = new Scanner(System.in);
		for (int i = 0; i < queries; i++) {
			System.out.print("Enter l : ");
			int l = sc1.nextInt();
			System.out.print("Enter r : ");
			int r = sc1.nextInt();
			if (l > r) {
				System.err.println("Invalid Input. l should be less than r");
				return;
			}
			if (l >= arr.length) {
				System.err.println("Invalid Input. l should be less than size of array");
				return;
			}
			int count = evenArrPS[r] - ((l == 0) ? 0 : evenArrPS[l - 1]);
			System.out.println(String.format("%d -> %d : %d", l, r, count));
		}
		sc1.close();
	} 

	static int[] getEvenArrayPS(int[] arr) {
		int[] evenArr = new int[arr.length];
		int[] evenArrPS = new int[arr.length];
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] % 2 == 0) {
				evenArr[i] = 1;
			} else {
				evenArr[i] = 0;
			}
		}

		evenArrPS[0] = evenArr[0];
		for (int i = 1; i < arr.length; i++) {
			evenArrPS[i] += evenArrPS[i - 1] + evenArr[i];
		}
		return evenArrPS;
	}
	
	static int[] getEvenArrayPSSingleArray(int[] arr) {
		int[] evenArrPS = new int[arr.length];
		evenArrPS[0] = 1 - (arr[0] % 2);
		for (int i = 1; i < arr.length; i++) {
			evenArrPS[i] += evenArrPS[i - 1] + (1 - arr[i]%2);
		}
		return evenArrPS;
	}
}
