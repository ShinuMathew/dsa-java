package com.scaler.string;

public class CheckAphaNumeric {
	
	/**
	 * 
	 * You are given a function isalpha() consisting of a character array A.
	 * Return 1 if all the characters of a character array are alphanumeric (a-z, A-Z, and 0-9) else, return 0.
	 */
	public static void main(String[] args) {
		char[] A = {'s', 'c', 'A', 'L', 'E', 'r', '0', '2', '3', ' '};
		int res = solve(A);
		System.out.println(res);
	}
	
	public static int solve(char[] A) {
        for(int i = 0; i < A.length; i++) {
            if((A[i] >= 65 && A[i] <= 91) || (A[i] >= 48 && A[i] <=57) || (A[i] >= 97 && A[i] <= 122)) {
                continue;
            } else {
                return 0;
            }
        }
        return 1;
    }

}
