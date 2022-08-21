package com.scalar.basicprogramming;

public class Fibonacci {
	
	public static void main(String[] args) {
		// 0 1 1 2 3 5 8 13 21 34
//		fibonacciRecurrsive(10, 0, 1);
		fibonacciIterative(10);
	}
	
	private static void fibonacciRecurrsive(int n, int prev, int next) {
		if(n > 0) {
			System.out.println(prev);
			fibonacciRecurrsive(n-1, next, prev+next);
		}
	}

	private static void fibonacciIterative(int n) {
		int n1 = 0;
		int n2 = 1;
		int n3;
		System.out.println(n1); //0
		System.out.println(n2);	//1
		for(int i = 2; i < n; i++) {
			n3 = n1+ n2;//1 2 3
			System.out.println(n3);//1
			n1 = n2;
			n2 = n3; //1 2
		}
	}
}
