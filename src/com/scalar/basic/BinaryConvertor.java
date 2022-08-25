package com.scalar.basic;

public class BinaryConvertor {

	public static void main(String[] args) {
		System.out.println(convertToBinary(42));
	}
	
	static String convertToBinary(int num) {
		String binary = "";
		while(num > 0) {
			binary = (num % 2) + binary; 
			num = num/2;
		}
		return binary;
	}
	
}
