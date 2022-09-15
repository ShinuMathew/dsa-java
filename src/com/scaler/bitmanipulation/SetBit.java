package com.scaler.bitmanipulation;

public class SetBit {
	
	public static void main(String[] args) {
		System.out.println(setBitBF(10, 2));
		System.out.println(setBitOptimised(10, 2));
	}
	
	private static int setBitBF(int N, int i) {
		if(((N>>i)&1) == 0) {
			N = N+(1<<i);
		}
		return N;
	}
	
	private static int setBitOptimised(int N, int i) {		
		return N|(1<<i);
	}

}
