package com.scalar.basicprogramming;

public class ReverseString {
	
	//reverse a String keeping special character position same
	//Input - Test@&TEST#$123
	//OutPut - 321T@&SETt#$seT
	
	public static void main(String[] args) {
		
		String inputString = "Test@&TEST#$123";
		char[] inputCharArray = inputString.toCharArray();
		System.out.println(reverseString(inputCharArray, 0, inputCharArray.length - 1));
	}

	private static String reverseString(char[] inputCharArray, int l, int r) {
		
		if(l < r) {
			if(checkSpecialCharacter(inputCharArray[l])) {
				l = l + 1;
				return reverseString(inputCharArray, l, r);
			}

			if(checkSpecialCharacter(inputCharArray[r])) {
				r = r - 1;
				return reverseString(inputCharArray, l, r);
			} 

			char temp = inputCharArray[l];
			inputCharArray[l] = inputCharArray[r];
			inputCharArray[r] = temp;
			return reverseString(inputCharArray, l + 1, r - 1);
		}
		
		return String.valueOf(inputCharArray);
	}

	private static boolean checkSpecialCharacter(char sChar) {

		char[] restrictedChars = {'!', '@', '#', '$', '%', '^', '&', '*'};
		for(int i = 0; i < restrictedChars.length; i++ ) {
			if(restrictedChars[i] == sChar) {
				return true;
			}
		}
		return false;
	}

}
