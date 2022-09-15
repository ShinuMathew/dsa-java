package com.scaler.ds.array.carryforward;

import java.util.HashMap;

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
                // Return the answer modulo 10^9 + 7 as the answer can be very large.
                ans = ans%1000000007; 
            }
        }
        
        HashMap<Integer, String> hm = new HashMap<Integer, String>();
        hm.put(1, "Shinu");
        hm.put(1, "Shiju");
        hm.put(1, "Shibu");
        hm.keySet().forEach(s -> System.out.println(s +" : "+ hm.get(s)));
        return ans; 
    }
}
