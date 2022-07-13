package com.scalar.basicprogramming;

public class BinaryNumberCheck {
	
	public static void main(String[] args) {
		System.out.println(checkBinary(1012));
	}
	
	public static boolean checkBinary(int number) {
		
		while(number != 0) {
			if(number % 10 > 1) 
				return false;
			number = number/10;
		}
		
		return true;
	}

}


//Test cases

/**
 * 1. Validate if system returns true when number = 0
 * 2. Validate if system returns true for a valid binary number. Ex : 10101
 * 3. Validate if system returns false for a invalid binary number. Ex : 12345
 * 4. Validate that system throws error when input number is not provided
 * 5. Validate that system throws error when user provides a binary number greater when 10 digits.
 */