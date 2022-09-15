package com.scaler.ds.array;

public class DifferenceBetweenMinMaxOfArray {
	
	public static void main(String[] args) {
		int[] A = { 91, 76, 81, 73, 64, 13, -63, 8, 60, 27};
		System.out.println(solve(A));
 	}
	
	public static int solve(int[] A) {

		int evenMax = -99999999; // Not the best way
        int oddMin = 99999999;
        
        for(int i = 0 ; i < A.length; i++) {
            if(A[i] % 2 == 0) {
                if(A[i] > evenMax) {
                    evenMax = A[i];
                }
            } else {
                if(A[i] < oddMin) {
                    oddMin = A[i];
                }
            }
        }
        return evenMax - oddMin;
	}
}
