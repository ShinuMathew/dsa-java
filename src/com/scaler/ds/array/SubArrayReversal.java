package com.scaler.ds.array;

public class SubArrayReversal {

	public static void main(String[] args) {
		
		int[] arr = {3, -5, 2, 9, -2, 4, 12, 7, 11, 6, 17, 1};
		int L = 3;
		int R = 7;
		
		while(L < R) {
			int temp = arr[L];
			arr[L] = arr[R];
			arr[R] = temp;
			L++;
			R--;
		}
		
		System.out.print("{");
		for(int a = 0 ; a < arr.length; a++) {
			System.out.print(arr[a]+", ");
		}
		System.out.print("}");
	}
}
