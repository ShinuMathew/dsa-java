package com.scalar.basic;

public class FibanocciSeries {
	
	public static void main(String[] args) {
	
		System.out.println(fib(4));
		
	}
	
	private static int fib(int n) {
		int n1 = 0;
		int n2 = 1;
		int n3 = 0;
		
		if(n == 0) {
			return 0;
		}
		
		if(n == 1) {
			return 1;
		}
		
		for(int i = 2; i <= n; i++) {
			n3 = n1 + n2;
			n1 = n2;
			n2 = n3;			
		}
		return n3;
	}
	
	

}
