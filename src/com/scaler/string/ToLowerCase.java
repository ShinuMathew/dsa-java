package com.scaler.string;

import java.util.Arrays;

public class ToLowerCase {
	
	/**
	 * 
	 * You are given a function to_lower() which takes a character array A as an argument.
	 * Convert each character of A into lowercase characters if it exists. 
	 * If the lowercase of a character does not exist, it remains unmodified.
	 * The uppercase letters from A to Z are converted to lowercase letters from a to z respectively.
	 * Return the lowercase version of the given character array.
	 */
	public static void main(String[] args) {
		char[] A = {'s', 'c', 'A', 'L', 'E', 'r'};
		char[] res = to_lower(A);
		System.out.println(Arrays.toString(res));
	}
	
	public static char[] to_lower(char[] A) {
        for(int i = 0; i < A.length; i++) {
            if(A[i] >= 65 && A[i] < 91) {
                A[i] += 32;
            }
        }
        return A;
    }

}
