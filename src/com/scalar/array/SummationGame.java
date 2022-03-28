package com.scalar.array;
import java.util.Scanner;

public class SummationGame {

	/**
	 * Write a program to find sum all Natural numbers from 1 to N 
	 * where you have to take N as input from user
	 * */
	public static void main(String[] args) {
		// YOUR CODE GOES HERE
		// Please take input and print output to standard input/output (stdin/stdout)
		// DO NOT USE ARGUMENTS FOR INPUTS
		// E.g. 'Scanner' for input & 'System.out' for output
		Scanner sc1 = new Scanner(System.in);
		int N = sc1.nextInt();

		int sum = N * (N + 1) / 2;
		System.out.println(sum);
	}
}
