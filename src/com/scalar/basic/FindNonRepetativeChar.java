package com.scalar.basic;

// Give a string bbbbbbcaaadddf. Find the first non repeating character
public class FindNonRepetativeChar {

	public static void main(String[] args) throws Exception {
		
		String s = "c";
		System.out.println(getNonRepetativeChar(s));
		
	}
	
	private static char getNonRepetativeChar(String s) throws Exception {
		
		if(s.length() == 0) {
			throw new Exception("Invalid String");
		}
		
		char[] sCharArr = s.toCharArray();
		
		int i = 0;
		int repeatationCount = 0;
		while(i < sCharArr.length -1) {
			if(sCharArr[i] == sCharArr[i+1]) {
				repeatationCount++;
			} else {
				if(repeatationCount == 0) {
					return sCharArr[i];
				} else {
					repeatationCount = 0;
				}
			}
			i++;
		}
		return sCharArr[sCharArr.length-1];
	}
}
