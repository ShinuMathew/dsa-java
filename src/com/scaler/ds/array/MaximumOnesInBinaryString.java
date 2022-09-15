package com.scaler.ds.array;

public class MaximumOnesInBinaryString {

	/**
	 * Given a binary string of 0's and 1's, maximize the total count of 1 by
	 * flipping any one substring. Note : Atleast one flip is mandatory
	 */
	public static void main(String[] args) {
		String s = "100100111101";
		System.out.println(maxOnesInBinaryStringBF(s));
		System.out.println(maxOnesInBinaryStringOptimisedCarrtForward(s));
		System.out.println(maxOnesInBinaryStringOptimisedKadanes(s));
	}
	
	private static int maxOnesInBinaryStringOptimisedKadanes(String s) {
		int[] arr = convertStringToArray(s);
		int sum = 0;
		int ans = 0;
		int countOf1s = getCountOfOnes(s.toCharArray());
		for(int i = 0; i < arr.length; i++) {
			sum += arr[i];
			if(sum < 0) {
				sum = 0;
			}
			ans = Math.max(ans, sum);
		}
		return ans + countOf1s;
	}
	
	private static int[] convertStringToArray(String s) {
		char[] charArr = s.toCharArray();
		int[] arr = new int[charArr.length];
		for(int i = 0; i < charArr.length; i++) {
			if(charArr[i] == '1') {
				arr[i] = -1;
			} else {
				arr[i] = 1;
			}
		}
		return arr;
	}
	
	private static int maxOnesInBinaryStringOptimisedCarrtForward(String s) {
		/**
		 * Minimize the inner loop by carry forwarding the count of 1s for each potential substring flip
		 */
		int ans = 0;
		char[] charArray = s.toCharArray();
		int n = charArray.length;
		int totalOnes = getCountOfOnes(charArray);
		for (int i = 0; i < n; i++) {
			int countOf0 = 0;
			int countOf1 = 0;
			for (int j = i; j < n; j++) {
				if(charArray[j] == '1') {
					countOf1 += 1;
				} else {
					countOf0 += 1;
				}
				ans = Math.max(ans, (totalOnes - countOf1 + countOf0));
			}
		}
		return ans;
		
	}

	private static int maxOnesInBinaryStringBF(String s) {
		int ans = 0;
		char[] charArray = s.toCharArray();
		int n = charArray.length;

		for (int i = 0; i < n; i++) {
			for (int j = i; j < n; j++) {
				flipOnes(charArray, i, j);
				ans = Math.max(ans, getCountOfOnes(charArray));
				flipOnes(charArray, i, j);
			}
		}
		return ans;
	}
	
	private static void flipOnes(char[] charArray, int s, int e ) {
		for(int i = s; i <= e; i++) {
			if(charArray[i] == '0') {
				charArray[i] = '1';
			} else {
				charArray[i] = '0';
			}
		}
	}
	
	private static int getCountOfOnes(char[] charArray) {
		int n = charArray.length;
		int count=0;
		for (int i = 0; i < n; i++) {
			if(charArray[i] == '1') {
				count++;
			}
		}
		return count;
	}

}
