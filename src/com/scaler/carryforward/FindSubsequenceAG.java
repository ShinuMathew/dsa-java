package com.scaler.carryforward;

public class FindSubsequenceAG {
	
	public static void main(String[] args) {
		String A = "ABCGAG";
		System.out.println(solve(A));
	}
	
	private static int solve(String A) {

        char[] arr = A.toCharArray();

        int ans = 0;
        int c = 0;
        for(int i = arr.length - 1; i >= 0; i--) {
            if(arr[i] == 'G') {
                c++;
            }
            if(arr[i] == 'A') {
                ans += c;
                ans = ans%1000000007; //Return the answer modulo 10^9 + 7 as the answer can be very large.
            }
        }
        return ans; 
    }
}
