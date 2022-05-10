package com.scalar.array;

/**
 * Given an array of size 'N'. Count the number of special index in the array.
 * Special Index : An index which when removed, the sum of the even array index and odd index are equal.
 */
public class SpecialIndex {

	public static void main(String[] args) {
		
		int[] A = {4, 3, 2, 7, 6, -2};
		for(int i = 0; i < A.length; i++) {
			int evenSum = 0;
			int oddSum = 0;
			System.out.println("i = "+i);
			for(int j = 0; j < A.length; j++) {
				if(j != i) {
					System.out.print(A+",");
					if(j % 2 == 0) {
						evenSum += A[j];
					} else {
						oddSum +=A[j];
					}
				}
			}
			System.out.println("\nODD SUM : "+oddSum+"\nEVEN SUMM : "+evenSum);
			if(evenSum == oddSum) {				
				System.out.println(i + "is a special index");
			}
		}
	}
}
