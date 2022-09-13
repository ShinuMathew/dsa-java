package com.scalar.bitmanipulation;

public class DoubleTrouble {

	/**
	 * Given ar[N] every element repeats twice except 2 elements. Find the 2 unique
	 * elements
	 */
	public static void main(String[] args) {
		int[] arr = { 3, 6, 4, 4, 3, 8 };
		findDoubleTrouble(arr);
	}

	private static void findDoubleTrouble(int[] arr) {
		int n = arr.length;
		int res = 0;
		for (int i = 0; i < n; i++) {
			res = res ^ arr[i];
		}
		
		int bitposition = 0;
		while(bitposition < 32) {
			if(((res>>bitposition)&1) == 1) {
				break;
			}
			bitposition++;
		}
		
		int setBitUnique = 0;
		int unsetBitUnique = 0;
		for (int i = 0; i < n; i++) {
			if(((arr[i]>>bitposition)&1) == 1) {
				setBitUnique = setBitUnique ^ arr[i];
			} else {
				unsetBitUnique = unsetBitUnique ^ arr[i];
			}
		}
		
		System.out.println(setBitUnique+", "+unsetBitUnique);

	}

}
