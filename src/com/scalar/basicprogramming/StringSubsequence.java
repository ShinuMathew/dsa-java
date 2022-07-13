package com.scalar.basicprogramming;

import java.util.LinkedHashSet;
import java.util.Set;

/**
 * Given a string, find all its subsequences or print its powersets
 * Ex: abc : {"", "a", "b", "c", "ab", "ac", "bc", "abc"}
 * */
public class StringSubsequence {

	static Set<String> result = new LinkedHashSet<String>();
	static void getSubsequence(String s, String res, int index) {
		if(s == null || s.length() <= 0)
			System.out.println("Invalid String. String should be of length > 0");		
		result.add(res);
		if(index >= s.length())
			return;
		
		//	String result = s.substring(0, index);
		getSubsequence(s, res+s.charAt(index), index+1);
		getSubsequence(s, res, index+1);
		
	}
	
	public static void main(String[] args) {
		getSubsequence("abcd", "", 0);
		result.forEach(System.out::println);
	}
	
}
