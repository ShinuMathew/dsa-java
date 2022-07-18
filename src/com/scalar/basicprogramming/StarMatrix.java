package com.scalar.basicprogramming;

/*
 * Java program to create 4*4 matrix of ‘*’ and then Traverse it from center to up then down
 * */
public class StarMatrix {

	public static void main(String[] args) {
		
		for(int i = 0; i < 4; i++) {
			for(int j = 0; j < 4; j++) {
				System.out.print(" * ");
			}
			System.out.println("");
		}
	}
}
