package com.scalar.bitmanipulation;

public class GenerateBits {

	/**
	 * Given x & y, create a number with x number of 1's and y number of 0'2
	 * Need not consider overflows
	 * Ex: x : 3, y : 4
	 * Ans : 1110000 => 112
	 * */
	public static void main(String[] args) {
		System.out.println(generateBits(3, 4));
	}
	
	private static int generateBits(int x, int y) {
		/**
		 * 
		 * FOR x 1's :
		 * -----------
		 * 2^1 - 1 ---> 1
		 * 2^2 - 1 ---> 11
		 * 2^3 - 1 ---> 111
		 * 2^4 - 1 ---> 1111
		 * 2^5 - 1 ---> 11111
		 * 
		 * 2^x - 1 ---> 11...1 (x bits)
		 * 
		 * So to have x 1's we can simply perform (2^x - 1) = ((1<<x)-1)
		 * 
		 * FOR y 0's :
		 * -----------
		 * To have preceding 0's we can leftshift by y
		 * 
		 * ==> ((1<<x) - 1)<<y
		 */
		
		return ((1<<x) - 1)<<y;
		
	}
}
