package com.scalar.array.recursion;

public class PrintNIncreementingNumbers {

	public static void main(String[] args) {
		inc(10);
	}

	public static void inc(int N) {
		if (N > 0) {
			inc(N - 1);
			System.out.println(N);
		}
	}

}
