package com.scaler.string;

import java.util.Arrays;

public class ToUpperCase {
	
	/**
	 * 
	 * You are given a function to_lower() which takes a character array A as an argument.
	 * Convert each character of A into uppercase characters if it exists. 
	 * If the uppercase of a character does not exist, it remains unmodified.
	 * The lowercase letters from a to z are converted to uppercase letters from A to Z respectively.
	 * Return the uppercase version of the given character array.
	 */
	public static void main(String[] args) {
		char[] A = {'s', 'c', 'A', 'L', 'E', 'r'};
		char[] res = to_lower(A);
		System.out.println(Arrays.toString(res));
	}
	
	public static char[] to_lower(char[] A) {
		for(int i = 0; i < A.length; i++) {
            if(A[i] >= 97 && A[i] < 123) {
                A[i] -= 32;
            }
        }
        return A;
    }

}
