package com.scalar.basic;

import java.util.concurrent.atomic.AtomicInteger;

public class Palindrome {
	
	static AtomicInteger counter = new AtomicInteger();
	
	public static void main(String[] args) {
		
		String s = "malayalam";
		if(isPalindrome(s, 0, s.length()-1))
			System.out.println(s+" is palindrome");
		else
			System.out.println(s+" is not a palindrome");
		System.out.println("Total steps : "+counter.get());
	}
	
	private static boolean isPalindrome(String s, int lIndex, int rIndex) {
		counter.incrementAndGet();
		if(s.charAt(lIndex) != s.charAt(rIndex))
			return false;
		if(lIndex >= rIndex)
			return true;
		else
			return isPalindrome(s, lIndex+1, rIndex-1);
	}
}
