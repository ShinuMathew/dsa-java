package com.scalar.basic;

public class SimpleAnagram {
	
	public static void main(String[] args) {
		
		if(checkAnagram("LISTEN", "SILEMT"))
			System.out.println("Its an Anagram");
		else
			System.out.println("Not an anagram");
	}
	
	private static boolean checkAnagram(String str1, String str2) {
		char[] charArrayStr1 = str1.toCharArray();
		char[] charArrayStr2 = str2.toCharArray();
		boolean hasChar;
		if(charArrayStr1.length != charArrayStr2.length)
			return false;
		for(int i = 0; i<charArrayStr1.length; i++) {
			hasChar = false;
			for(int j = 0; j<charArrayStr2.length; j++) {
				if(charArrayStr1[i] == charArrayStr2[j]) {
					hasChar = true;
					break;
				}				 
			}
			if(!hasChar)
				return false;
		}
		return true;
	}

}
