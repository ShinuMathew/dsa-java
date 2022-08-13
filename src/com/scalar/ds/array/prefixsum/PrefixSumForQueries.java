package com.scalar.ds.array.prefixsum;

import java.util.Scanner;

/**
 * Given an array of size 'N' and 'Q' queries. Every single query is a range
 * from index 's' & 'e'. Return the sum of all the elements from index 's' to
 * 'e'.
 */
public class PrefixSumForQueries {

	static int[] A = { -3, 6, 2, 4, 5, 2, 8, -9, 3, 1 };

	public static void main(String[] args) {
		
		int[] PS = new int[A.length];
		
		PS[0] = A[0];
		
		for(int i = 1; i < PS.length; i++ ) {
			PS[i] = PS[i-1] + A[i];
		}
		
		for(int i = 0; i < PS.length; i++ ) {
			System.out.print(PS[i]+", ");
		}
			
		int Q = 4;
		
		for(int i = 0 ; i < Q; i++) {
			Scanner sc1 = new Scanner(System.in);
			int s = sc1.nextInt();
			int e = sc1.nextInt();
			
			int sum = PS[e] - ( s==0 ? 0 : PS[s-1]);
			System.out.println("s = "+s+" | e = "+e+" | SUM = "+sum);
		}
	}
}
