package com.scaler.bitmanipulation;

public class CountNoOfSetBits {

	public static void main(String[] args) {
		System.out.println(getSetBitCount(27));
	}

	private static int getSetBitCount(int N) {
		int count = 0;
		while (N > 0) {
			if ((N & 1) == 1) {
				count += 1;
			}
			N = N >> 1;
		}
		return count;
	}
}
