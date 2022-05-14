package com.scalar.array;

public class CalculateEqualPairsAG {
	
	/**
	 * You have given a string A having Uppercase English letters.
	 * You have to find how many times subsequence "AG" is there in the given string.
	 * NOTE: Return the answer modulo 109 + 7 as the answer can be very large.
	 * */
	public static void main(String[] args) {
		
		char[] S = {'b', 'a', 'a', 'g', 'd', 'c', 'a', 'g'};
		System.out.println(optimisedBruteForce(S));
	}
	
	// Time complexity : O(N^2), Space complexity : O(1)
	public static int optimisedBruteForce(char[] S) {
		int count = 0;
		for(int i = 0; i<S.length; i++) { // since i<j, we can start checking from i+1th element for j
			if(S[i] == 'a') {
				for(int j = i+1; j<S.length; j++) {
					if(S[j] == 'g') {
						count++;
					}
				}
			}
		}
		return count;
	}

}
