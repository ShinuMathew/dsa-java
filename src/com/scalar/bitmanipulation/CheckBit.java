package com.scalar.bitmanipulation;

public class CheckBit {
	
	/**
	 * Check if int the given integer N, the ith bit in N is set or not 
	 * */
	public static void main(String[] args) {
		System.out.println(checkBitBF(73, 3));
		System.out.println(checkBitOptimised(73, 4));
	}
	
	private static boolean checkBitBF(int N, int i) {
		//	Convert decimal to binary and then check the position
		String binary = "";
		while(N > 0) {
			binary = binary + N%2;
			N = N/2;
		}
		return binary.charAt(binary.length()-1-i) == '1';			
	}
	
	private static boolean checkBitOptimised(int N, int i) {		
		N = N >> i;
		return (N & 1) == 1;			
	}

}
