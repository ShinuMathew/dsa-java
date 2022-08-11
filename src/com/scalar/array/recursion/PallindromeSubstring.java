package com.scalar.array.recursion;

public class PallindromeSubstring {
	
	public static void main(String[] args) {
		
		char[] ch = {'g', 'o', 'o', 'd', 'd', 'a', 'd' };
		System.out.println(isPallindrome(ch, 5, 5));
	}
	
	private static boolean isPallindrome(char[] ch, int s, int e) {		
		if(s <= e) {
			System.out.println("Checking Pallindrome for "+ ch[s]+ " to "+ ch[e]);
			if(ch[s] == ch[e]) {
				s++;
				e--;
				isPallindrome(ch, s, e);
			} else {
				return false;
			}
		}
		return true;
	}

}
