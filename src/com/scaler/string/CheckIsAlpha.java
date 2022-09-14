package com.scaler.string;

public class CheckIsAlpha {
	
	/**
	 * You are given a function isalpha() consisting of a character array A.
	 * Return 1 if all the characters of the character array are alphabetical (a-z and A-Z), else return 0.
	 */
	public static void main(String[] args) {
		System.out.println(solve("kfndfS".toCharArray()));
	}
	
	private static int solve(char[] A) {

        for(int i = 0; i < A.length; i++) {
            if((A[i] >= 65 && A[i] <= 90) || (A[i] >= 97 && A[i] <= 122)) {
                continue;
            } else {
                return 0;
            }
        }
        return 1;
    }

}
