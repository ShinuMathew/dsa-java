package com.scalar.basic;

import java.util.LinkedHashSet;
import java.util.Set;

/**
 * Write a Java program to print all permutations of a given String. For
 * example, if given String is "GOD" then your program should print all 6
 * permutations of this string, e.g. "GOD," "OGD", "DOG," "GDO," "ODG," and
 * "DGO."
 */
public class StringPermutation {
	
	public static Set<String> resultList = new LinkedHashSet<String>();

	public static void main(String[] args) {
		String s = "GOD";
//		permute(s, 0, s.length());
		permute3(s, "");
		resultList.forEach(System.out::println);
	}
	
	public static void permute3(String s, String answer) {  
	    if (s.length() == 0) {
	        System.out.print(answer + "  ");
	        return;
	    }
	     
	    for(int i = 0 ;i < s.length(); i++)
	    {
	        char ch = s.charAt(i);
	        String left_substr = s.substring(0, i);
	        String right_substr = s.substring(i + 1);
	        String rest = left_substr + right_substr;
	        permute3(rest, answer + ch);
	    }
	}

	public static void permute2(String s, int startIndex, int endIndex) {
		if(startIndex > endIndex)
			return;
		char[] stringArray = s.toCharArray();
		for(int i = startIndex; i < endIndex; i++) {
			for(int j = i; j < endIndex; j++) {
				char[] tempArr = s.toCharArray();
				char temp = tempArr[i];
				tempArr[i] = tempArr[j];
				tempArr[j] = temp;				
				resultList.add(String.valueOf(tempArr));
			}
		}
		permute2(s, startIndex+1, endIndex);
	}
	
	public static void permute1(String s, int startIndex, int endIndex) {
		if(s == null || s.length() == 0) 
			System.out.println("Invalid String. String should have length > 0");
		if(startIndex > endIndex)
			return;
		char[] stringArray = s.toCharArray();
		for(int i = startIndex; i <= endIndex; i++) {
			char temp = stringArray[startIndex];
			stringArray[startIndex] = stringArray[endIndex];
			stringArray[endIndex] = temp;
			resultList.add(String.valueOf(stringArray));
			System.out.println(stringArray);
		}
		permute1(s, startIndex+1, endIndex);
	}
	
	
	
}