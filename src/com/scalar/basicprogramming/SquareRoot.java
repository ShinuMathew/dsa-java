package com.scalar.basicprogramming;

public class SquareRoot {

	/**
	 * Given a number A. 
	 * Return square root of the number if it is perfect square otherwise return -1.
	 * */
	public static void main(String[] args) {
		long res = solve(1065024);
		System.out.println(res);
	}
	
	public static int solve(int A) {
		long l = 1;
		long r = A;

        if(A == 1) return 1;
        while(l <= r) {
            long mid = (l+r)/2;
            if(mid * mid == A) {
                return (int)mid;
            } else if(mid * mid > A) {                
                r = mid - 1;
            } else {
                l = mid + 1;
            }
        }
        return -1;
    }
}
